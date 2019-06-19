/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.keycloak.authentication.authenticators.browser;

import org.jboss.resteasy.specimpl.MultivaluedMapImpl;
import org.keycloak.authentication.AuthenticationFlowContext;
import org.keycloak.authentication.Authenticator;
import org.keycloak.credential.CredentialModel;
import org.keycloak.forms.login.LoginFormsProvider;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.RealmModel;
import org.keycloak.models.UserCredentialModel;
import org.keycloak.models.UserModel;
import org.keycloak.protocol.oidc.OIDCLoginProtocol;
import org.keycloak.services.ServicesLogger;
import org.keycloak.services.managers.AuthenticationManager;

import java.util.Iterator;
import java.util.List;

import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

/**
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
public class UsernamePasswordForm extends AbstractUsernameFormAuthenticator implements Authenticator {
    protected static ServicesLogger log = ServicesLogger.LOGGER;

    @Override
    public void action(AuthenticationFlowContext context) {
        MultivaluedMap<String, String> formData = context.getHttpRequest().getDecodedFormParameters();
        
        RealmModel realmModel = context.getRealm();
        UserModel user = context.getUser();
        UserCredentialModel credentials = null;
        List<CredentialModel> listCredentialModel =null;
        String otp = formData.getFirst("smscode");
        
        System.out.println("otp in UsernamePasswordForm "+otp);
        
        String storedOTP = null;
        
        if(realmModel != null && user != null ) {
        	listCredentialModel  = context.getSession().userCredentialManager().getStoredCredentials(context.getRealm(), context.getUser());
        	System.out.println("step 1");

        }   
        if(listCredentialModel != null && otp != null) {
        	
        	Iterator<CredentialModel> itr = listCredentialModel.iterator();
        	System.out.println("in if loop");
        	while(itr.hasNext())
        	{
        		CredentialModel credentialModel  = itr.next();
        		System.out.println("getvalue"+credentialModel.getValue());
        		storedOTP = credentialModel.getValue();
        	}
        	
        	if(!validateOTP(context, formData,storedOTP))
        	{
        		return;
        	}
        	System.out.println("after validation");

            context.success();
        	
        }
        
        
        if (formData.containsKey("cancel")) {
            context.cancelLogin();
            return;
        }
        if(otp == null ) {
	        if (!validateForm(context, formData) ) {
	            return;
	        }
        }
    	System.out.println("end of method");

        context.success();
        

        
    }

    protected boolean validateForm(AuthenticationFlowContext context, MultivaluedMap<String, String> formData) {
        return validateUserAndPassword(context, formData);
    }
    
    protected boolean validateOTP(AuthenticationFlowContext context, MultivaluedMap<String, String> formData,String storedOTP) {
        return validateMobileOTP(context, formData,storedOTP);
    }

    @Override
    public void authenticate(AuthenticationFlowContext context) {
        MultivaluedMap<String, String> formData = new MultivaluedMapImpl<>();
        String loginHint = context.getAuthenticationSession().getClientNote(OIDCLoginProtocol.LOGIN_HINT_PARAM);

        String rememberMeUsername = AuthenticationManager.getRememberMeUsername(context.getRealm(), context.getHttpRequest().getHttpHeaders());

        if (loginHint != null || rememberMeUsername != null) {
            if (loginHint != null) {
                formData.add(AuthenticationManager.FORM_USERNAME, loginHint);
            } else {
                formData.add(AuthenticationManager.FORM_USERNAME, rememberMeUsername);
                formData.add("rememberMe", "on");
            }
        }
        Response challengeResponse = challenge(context, formData);
        context.challenge(challengeResponse);
    }

    @Override
    public boolean requiresUser() {
        return false;
    }

    protected Response challenge(AuthenticationFlowContext context, MultivaluedMap<String, String> formData) {
        LoginFormsProvider forms = context.form();

        if (formData.size() > 0) forms.setFormData(formData);
        
        System.out.println("challenge");

        return forms.createLogin();
    }


    @Override
    public boolean configuredFor(KeycloakSession session, RealmModel realm, UserModel user) {
        // never called
        return true;
    }

    @Override
    public void setRequiredActions(KeycloakSession session, RealmModel realm, UserModel user) {
        // never called
    }

    @Override
    public void close() {

    }
}
