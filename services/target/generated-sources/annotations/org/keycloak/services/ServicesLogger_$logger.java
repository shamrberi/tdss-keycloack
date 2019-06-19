package org.keycloak.services;

import java.util.Locale;
import java.io.Serializable;
import javax.annotation.Generated;
import org.jboss.logging.DelegatingBasicLogger;
import java.lang.String;
import java.io.IOException;
import org.jboss.logging.Logger;
import java.net.URI;
import java.lang.Exception;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.RuntimeException;
import org.keycloak.events.EventListenerProvider;
import org.jboss.logging.BasicLogger;
import org.keycloak.models.ModelDuplicateException;
import org.keycloak.email.EmailException;
import java.lang.Throwable;
import java.lang.Object;
import javax.naming.NamingException;


import static org.jboss.logging.Logger.Level.ERROR;
import static org.jboss.logging.Logger.Level.INFO;
import static org.jboss.logging.Logger.Level.DEBUG;
import static org.jboss.logging.Logger.Level.FATAL;
import static org.jboss.logging.Logger.Level.WARN;

/**
 * Warning this class consists of generated code.
 */
@Generated(value = "org.jboss.logging.processor.generator.model.MessageLoggerImplementor", date = "2019-06-18T15:56:50+0530")
public class ServicesLogger_$logger extends DelegatingBasicLogger implements ServicesLogger, BasicLogger, Serializable {
    private static final long serialVersionUID = 1L;
    private static final String FQCN = ServicesLogger_$logger.class.getName();
    public ServicesLogger_$logger(final Logger log) {
        super(log);
    }
    private static final Locale LOCALE = Locale.ROOT;
    protected Locale getLoggingLocale() {
        return LOCALE;
    }
    @Override
    public final void loadingFrom(final Object from) {
        super.log.logf(FQCN, INFO, null, loadingFrom$str(), from);
    }
    private static final String loadingFrom = "KC-SERVICES0001: Loading config from %s";
    protected String loadingFrom$str() {
        return loadingFrom;
    }
    @Override
    public final void migrationFailure(final Throwable t) {
        super.log.logf(FQCN, ERROR, t, migrationFailure$str());
    }
    private static final String migrationFailure = "KC-SERVICES0002: Failed to migrate datamodel";
    protected String migrationFailure$str() {
        return migrationFailure;
    }
    @Override
    public final void realmExists(final String realmName, final String from) {
        super.log.logf(FQCN, INFO, null, realmExists$str(), realmName, from);
    }
    private static final String realmExists = "KC-SERVICES0003: Not importing realm %s from %s.  It already exists.";
    protected String realmExists$str() {
        return realmExists;
    }
    @Override
    public final void importedRealm(final String realmName, final String from) {
        super.log.logf(FQCN, INFO, null, importedRealm$str(), realmName, from);
    }
    private static final String importedRealm = "KC-SERVICES0004: Imported realm %s from %s.";
    protected String importedRealm$str() {
        return importedRealm;
    }
    @Override
    public final void unableToImportRealm(final Throwable t, final String realmName, final String from) {
        super.log.logf(FQCN, WARN, t, unableToImportRealm$str(), realmName, from);
    }
    private static final String unableToImportRealm = "KC-SERVICES0005: Unable to import realm %s from %s.";
    protected String unableToImportRealm$str() {
        return unableToImportRealm;
    }
    @Override
    public final void imprtingUsersFrom(final Object from) {
        super.log.logf(FQCN, INFO, null, imprtingUsersFrom$str(), from);
    }
    private static final String imprtingUsersFrom = "KC-SERVICES0006: Importing users from '%s'";
    protected String imprtingUsersFrom$str() {
        return imprtingUsersFrom;
    }
    @Override
    public final void failedToLoadUsers(final Throwable t) {
        super.log.logf(FQCN, ERROR, t, failedToLoadUsers$str());
    }
    private static final String failedToLoadUsers = "KC-SERVICES0007: Failed to load 'keycloak-add-user.json'";
    protected String failedToLoadUsers$str() {
        return failedToLoadUsers;
    }
    @Override
    public final void addUserFailedRealmNotFound(final String user, final String realm) {
        super.log.logf(FQCN, ERROR, null, addUserFailedRealmNotFound$str(), user, realm);
    }
    private static final String addUserFailedRealmNotFound = "KC-SERVICES0008: Failed to add user %s to realm %s: realm not found";
    protected String addUserFailedRealmNotFound$str() {
        return addUserFailedRealmNotFound;
    }
    @Override
    public final void addUserSuccess(final String user, final String realm) {
        super.log.logf(FQCN, INFO, null, addUserSuccess$str(), user, realm);
    }
    private static final String addUserSuccess = "KC-SERVICES0009: Added user '%s' to realm '%s'";
    protected String addUserSuccess$str() {
        return addUserSuccess;
    }
    @Override
    public final void addUserFailedUserExists(final String user, final String realm) {
        super.log.logf(FQCN, ERROR, null, addUserFailedUserExists$str(), user, realm);
    }
    private static final String addUserFailedUserExists = "KC-SERVICES0010: Failed to add user '%s' to realm '%s': user with username exists";
    protected String addUserFailedUserExists$str() {
        return addUserFailedUserExists;
    }
    @Override
    public final void addUserFailed(final Throwable t, final String user, final String realm) {
        super.log.logf(FQCN, ERROR, t, addUserFailed$str(), user, realm);
    }
    private static final String addUserFailed = "KC-SERVICES0011: Failed to add user '%s' to realm '%s'";
    protected String addUserFailed$str() {
        return addUserFailed;
    }
    @Override
    public final void failedToDeleteFile(final String fileName) {
        super.log.logf(FQCN, ERROR, null, failedToDeleteFile$str(), fileName);
    }
    private static final String failedToDeleteFile = "KC-SERVICES0012: Failed to delete '%s'";
    protected String failedToDeleteFile$str() {
        return failedToDeleteFile;
    }
    @Override
    public final void failedAuthentication(final Throwable t) {
        super.log.logf(FQCN, WARN, t, failedAuthentication$str());
    }
    private static final String failedAuthentication = "KC-SERVICES0013: Failed authentication";
    protected String failedAuthentication$str() {
        return failedAuthentication;
    }
    @Override
    public final void failedClientAuthentication(final Throwable t) {
        super.log.logf(FQCN, DEBUG, t, failedClientAuthentication$str());
    }
    private static final String failedClientAuthentication = "KC-SERVICES0014: Failed client authentication";
    protected String failedClientAuthentication$str() {
        return failedClientAuthentication;
    }
    @Override
    public final void errorAuthenticatingClient(final Throwable t) {
        super.log.logf(FQCN, ERROR, t, errorAuthenticatingClient$str());
    }
    private static final String errorAuthenticatingClient = "KC-SERVICES0015: Unexpected error when authenticating client";
    protected String errorAuthenticatingClient$str() {
        return errorAuthenticatingClient;
    }
    @Override
    public final void unknownFlow() {
        super.log.logf(FQCN, ERROR, null, unknownFlow$str());
    }
    private static final String unknownFlow = "KC-SERVICES0016: Unknown flow to execute with";
    protected String unknownFlow$str() {
        return unknownFlow;
    }
    @Override
    public final void unknownResultStatus() {
        super.log.logf(FQCN, ERROR, null, unknownResultStatus$str());
    }
    private static final String unknownResultStatus = "KC-SERVICES0017: Unknown result status";
    protected String unknownResultStatus$str() {
        return unknownResultStatus;
    }
    @Override
    public final void authMethodFallback(final String clientId, final String expectedClientAuthType) {
        super.log.logf(FQCN, WARN, null, authMethodFallback$str(), clientId, expectedClientAuthType);
    }
    private static final String authMethodFallback = "KC-SERVICES0018: Client %s doesn't have have authentication method configured. Fallback to %s";
    protected String authMethodFallback$str() {
        return authMethodFallback;
    }
    @Override
    public final void noDuplicationDetected() {
        super.log.logf(FQCN, WARN, null, noDuplicationDetected$str());
    }
    private static final String noDuplicationDetected = "KC-SERVICES0019: No duplication detected.";
    protected String noDuplicationDetected$str() {
        return noDuplicationDetected;
    }
    @Override
    public final void resetFlow(final String emailOrUserName) {
        super.log.logf(FQCN, WARN, null, resetFlow$str(), emailOrUserName);
    }
    private static final String resetFlow = "KC-SERVICES0020: %s is null. Reset flow and enforce showing reviewProfile page";
    protected String resetFlow$str() {
        return resetFlow;
    }
    @Override
    public final void confirmBrokerEmailFailed(final Throwable t) {
        super.log.logf(FQCN, ERROR, t, confirmBrokerEmailFailed$str());
    }
    private static final String confirmBrokerEmailFailed = "KC-SERVICES0021: Failed to send email to confirm identity broker linking";
    protected String confirmBrokerEmailFailed$str() {
        return confirmBrokerEmailFailed;
    }
    @Override
    public final void keyParamDoesNotMatch() {
        super.log.logf(FQCN, ERROR, null, keyParamDoesNotMatch$str());
    }
    private static final String keyParamDoesNotMatch = "KC-SERVICES0022: Key parameter don't match with the expected value from client session";
    protected String keyParamDoesNotMatch$str() {
        return keyParamDoesNotMatch;
    }
    @Override
    public final void smtpNotConfigured() {
        super.log.logf(FQCN, WARN, null, smtpNotConfigured$str());
    }
    private static final String smtpNotConfigured = "KC-SERVICES0023: Smtp is not configured for the realm. Ignoring email verification authenticator";
    protected String smtpNotConfigured$str() {
        return smtpNotConfigured;
    }
    @Override
    public final void modelDuplicateException(final ModelDuplicateException mde) {
        super.log.logf(FQCN, ERROR, mde, modelDuplicateException$str());
    }
    private static final String modelDuplicateException = "KC-SERVICES0024: ";
    protected String modelDuplicateException$str() {
        return modelDuplicateException;
    }
    @Override
    public final void errorValidatingAssertion(final Throwable t) {
        super.log.logf(FQCN, ERROR, t, errorValidatingAssertion$str());
    }
    private static final String errorValidatingAssertion = "KC-SERVICES0025: Error when validating client assertion";
    protected String errorValidatingAssertion$str() {
        return errorValidatingAssertion;
    }
    @Override
    public final void failedToSendPwdResetEmail(final EmailException e) {
        super.log.logf(FQCN, ERROR, e, failedToSendPwdResetEmail$str());
    }
    private static final String failedToSendPwdResetEmail = "KC-SERVICES0026: Failed to send password reset email";
    protected String failedToSendPwdResetEmail$str() {
        return failedToSendPwdResetEmail;
    }
    @Override
    public final void recaptchaFailed(final Exception e) {
        super.log.logf(FQCN, ERROR, e, recaptchaFailed$str());
    }
    private static final String recaptchaFailed = "KC-SERVICES0028: Recaptcha failed";
    protected String recaptchaFailed$str() {
        return recaptchaFailed;
    }
    @Override
    public final void failedToSendEmail(final Exception e) {
        super.log.logf(FQCN, ERROR, e, failedToSendEmail$str());
    }
    private static final String failedToSendEmail = "KC-SERVICES0029: Failed to send email";
    protected String failedToSendEmail$str() {
        return failedToSendEmail;
    }
    @Override
    public final void fullModelImport(final String strategy) {
        super.log.logf(FQCN, INFO, null, fullModelImport$str(), strategy);
    }
    private static final String fullModelImport = "KC-SERVICES0030: Full model import requested. Strategy: %s";
    protected String fullModelImport$str() {
        return fullModelImport;
    }
    @Override
    public final void realmImportRequested(final String realmName, final String strategy) {
        super.log.logf(FQCN, INFO, null, realmImportRequested$str(), realmName, strategy);
    }
    private static final String realmImportRequested = "KC-SERVICES0031: Import of realm '%s' requested. Strategy: %s";
    protected String realmImportRequested$str() {
        return realmImportRequested;
    }
    @Override
    public final void importSuccess() {
        super.log.logf(FQCN, INFO, null, importSuccess$str());
    }
    private static final String importSuccess = "KC-SERVICES0032: Import finished successfully";
    protected String importSuccess$str() {
        return importSuccess;
    }
    @Override
    public final void fullModelExportRequested() {
        super.log.logf(FQCN, INFO, null, fullModelExportRequested$str());
    }
    private static final String fullModelExportRequested = "KC-SERVICES0033: Full model export requested";
    protected String fullModelExportRequested$str() {
        return fullModelExportRequested;
    }
    @Override
    public final void realmExportRequested(final String realmName) {
        super.log.logf(FQCN, INFO, null, realmExportRequested$str(), realmName);
    }
    private static final String realmExportRequested = "KC-SERVICES0034: Export of realm '%s' requested.";
    protected String realmExportRequested$str() {
        return realmExportRequested;
    }
    @Override
    public final void exportSuccess() {
        super.log.logf(FQCN, INFO, null, exportSuccess$str());
    }
    private static final String exportSuccess = "KC-SERVICES0035: Export finished successfully";
    protected String exportSuccess$str() {
        return exportSuccess;
    }
    @Override
    public final void overwriteError(final Exception e, final String name) {
        super.log.logf(FQCN, ERROR, e, overwriteError$str(), name);
    }
    private static final String overwriteError = "KC-SERVICES0036: Error overwriting %s";
    protected String overwriteError$str() {
        return overwriteError;
    }
    @Override
    public final void creationError(final Exception e, final String name) {
        super.log.logf(FQCN, ERROR, e, creationError$str(), name);
    }
    private static final String creationError = "KC-SERVICES0037: Error creating %s";
    protected String creationError$str() {
        return creationError;
    }
    @Override
    public final void roleImportError(final Exception e) {
        super.log.logf(FQCN, ERROR, e, roleImportError$str());
    }
    private static final String roleImportError = "KC-SERVICES0038: Error importing roles";
    protected String roleImportError$str() {
        return roleImportError;
    }
    @Override
    public final void untranslatedProtocol(final String errorName) {
        super.log.logf(FQCN, WARN, null, untranslatedProtocol$str(), errorName);
    }
    private static final String untranslatedProtocol = "KC-SERVICES0039: Untranslated protocol Error: %s so we return default SAML error";
    protected String untranslatedProtocol$str() {
        return untranslatedProtocol;
    }
    @Override
    public final void usingDeprecatedDirectGrantsOnly() {
        super.log.logf(FQCN, WARN, null, usingDeprecatedDirectGrantsOnly$str());
    }
    private static final String usingDeprecatedDirectGrantsOnly = "KC-SERVICES0040: Using deprecated 'directGrantsOnly' configuration in JSON representation. It will be removed in future versions";
    protected String usingDeprecatedDirectGrantsOnly$str() {
        return usingDeprecatedDirectGrantsOnly;
    }
    @Override
    public final void invokingDeprecatedEndpoint(final URI requestUri) {
        super.log.logf(FQCN, WARN, null, invokingDeprecatedEndpoint$str(), requestUri);
    }
    private static final String invokingDeprecatedEndpoint = "KC-SERVICES0041: Invoking deprecated endpoint %s";
    protected String invokingDeprecatedEndpoint$str() {
        return invokingDeprecatedEndpoint;
    }
    @Override
    public final void responseModeQueryNotAllowed() {
        super.log.logf(FQCN, ERROR, null, responseModeQueryNotAllowed$str());
    }
    private static final String responseModeQueryNotAllowed = "KC-SERVICES0042: Response_mode 'query' not allowed for implicit or hybrid flow";
    protected String responseModeQueryNotAllowed$str() {
        return responseModeQueryNotAllowed;
    }
    @Override
    public final void clientSessionNull() {
        super.log.logf(FQCN, ERROR, null, clientSessionNull$str());
    }
    private static final String clientSessionNull = "KC-SERVICES0043: Client session is null";
    protected String clientSessionNull$str() {
        return clientSessionNull;
    }
    @Override
    public final void clientModelNull() {
        super.log.logf(FQCN, ERROR, null, clientModelNull$str());
    }
    private static final String clientModelNull = "KC-SERVICES0044: Client model in client session is null";
    protected String clientModelNull$str() {
        return clientModelNull;
    }
    @Override
    public final void invalidToken() {
        super.log.logf(FQCN, ERROR, null, invalidToken$str());
    }
    private static final String invalidToken = "KC-SERVICES0045: Invalid token. Token verification failed.";
    protected String invalidToken$str() {
        return invalidToken;
    }
    @Override
    public final void multipleValuesForMapper(final String attrValue, final String mapper) {
        super.log.logf(FQCN, WARN, null, multipleValuesForMapper$str(), attrValue, mapper);
    }
    private static final String multipleValuesForMapper = "KC-SERVICES0046: Multiple values found '%s' for protocol mapper '%s' but expected just single value";
    protected String multipleValuesForMapper$str() {
        return multipleValuesForMapper;
    }
    @Override
    public final void spiMayChange(final String factoryId, final String factoryClass, final String spiName) {
        super.log.logf(FQCN, WARN, null, spiMayChange$str(), factoryId, factoryClass, spiName);
    }
    private static final String spiMayChange = "KC-SERVICES0047: %s (%s) is implementing the internal SPI %s. This SPI is internal and may change without notice";
    protected String spiMayChange$str() {
        return spiMayChange;
    }
    @Override
    public final void exceptionDuringRollback(final RuntimeException e) {
        super.log.logf(FQCN, ERROR, e, exceptionDuringRollback$str());
    }
    private static final String exceptionDuringRollback = "KC-SERVICES0048: Exception during rollback";
    protected String exceptionDuringRollback$str() {
        return exceptionDuringRollback;
    }
    @Override
    public final void clientRegistrationException(final String message) {
        super.log.logf(FQCN, ERROR, null, clientRegistrationException$str(), message);
    }
    private static final String clientRegistrationException = "KC-SERVICES0049: %s";
    protected String clientRegistrationException$str() {
        return clientRegistrationException;
    }
    @Override
    public final void initializingAdminRealm(final String adminRealmName) {
        super.log.logf(FQCN, INFO, null, initializingAdminRealm$str(), adminRealmName);
    }
    private static final String initializingAdminRealm = "KC-SERVICES0050: Initializing %s realm";
    protected String initializingAdminRealm$str() {
        return initializingAdminRealm;
    }
    @Override
    public final void failedToLogoutClient(final Exception e) {
        super.log.logf(FQCN, WARN, e, failedToLogoutClient$str());
    }
    private static final String failedToLogoutClient = "KC-SERVICES0051: Failed to logout client, continuing";
    protected String failedToLogoutClient$str() {
        return failedToLogoutClient;
    }
    @Override
    public final void failedProcessingType(final Exception e) {
        super.log.logf(FQCN, ERROR, e, failedProcessingType$str());
    }
    private static final String failedProcessingType = "KC-SERVICES0052: Failed processing type";
    protected String failedProcessingType$str() {
        return failedProcessingType;
    }
    @Override
    public final void loginFailure(final String user, final String ip) {
        super.log.logf(FQCN, WARN, null, loginFailure$str(), user, ip);
    }
    private static final String loginFailure = "KC-SERVICES0053: login failure for user %s from ip %s";
    protected String loginFailure$str() {
        return loginFailure;
    }
    @Override
    public final void unknownAction(final String action) {
        super.log.logf(FQCN, ERROR, null, unknownAction$str(), action);
    }
    private static final String unknownAction = "KC-SERVICES0054: Unknown action: %s";
    protected String unknownAction$str() {
        return unknownAction;
    }
    @Override
    public final void errorAuthenticating(final Exception e, final String message) {
        super.log.logf(FQCN, ERROR, e, errorAuthenticating$str(), message);
    }
    private static final String errorAuthenticating = "KC-SERVICES0055: %s";
    protected String errorAuthenticating$str() {
        return errorAuthenticating;
    }
    @Override
    public final void errorClosingLDAP(final NamingException ne) {
        super.log.logf(FQCN, WARN, ne, errorClosingLDAP$str());
    }
    private static final String errorClosingLDAP = "KC-SERVICES0056: Error when closing LDAP connection";
    protected String errorClosingLDAP$str() {
        return errorClosingLDAP;
    }
    @Override
    public final void logoutFailed(final IOException ioe, final String clientId) {
        super.log.logf(FQCN, WARN, ioe, logoutFailed$str(), clientId);
    }
    private static final String logoutFailed = "KC-SERVICES0057: Logout for client '%s' failed";
    protected String logoutFailed$str() {
        return logoutFailed;
    }
    @Override
    public final void failedToSendRevocation(final IOException ioe) {
        super.log.logf(FQCN, WARN, ioe, failedToSendRevocation$str());
    }
    private static final String failedToSendRevocation = "KC-SERVICES0058: Failed to send revocation request";
    protected String failedToSendRevocation$str() {
        return failedToSendRevocation;
    }
    @Override
    public final void availabilityTestFailed(final String managementUrl) {
        super.log.logf(FQCN, WARN, null, availabilityTestFailed$str(), managementUrl);
    }
    private static final String availabilityTestFailed = "KC-SERVICES0059: Availability test failed for uri '%s'";
    protected String availabilityTestFailed$str() {
        return availabilityTestFailed;
    }
    @Override
    public final void roleNotInRealm(final String offlineAccessRole) {
        super.log.logf(FQCN, WARN, null, roleNotInRealm$str(), offlineAccessRole);
    }
    private static final String roleNotInRealm = "KC-SERVICES0060: Role '%s' not available in realm";
    protected String roleNotInRealm$str() {
        return roleNotInRealm;
    }
    @Override
    public final void errorDuringFullUserSync(final Throwable t) {
        super.log.logf(FQCN, ERROR, t, errorDuringFullUserSync$str());
    }
    private static final String errorDuringFullUserSync = "KC-SERVICES0061: Error occurred during full sync of users";
    protected String errorDuringFullUserSync$str() {
        return errorDuringFullUserSync;
    }
    @Override
    public final void errorDuringChangedUserSync(final Throwable t) {
        super.log.logf(FQCN, ERROR, t, errorDuringChangedUserSync$str());
    }
    private static final String errorDuringChangedUserSync = "KC-SERVICES0062: Error occurred during sync of changed users";
    protected String errorDuringChangedUserSync$str() {
        return errorDuringChangedUserSync;
    }
    @Override
    public final void failedToFormatMessage(final String cause) {
        super.log.logf(FQCN, WARN, null, failedToFormatMessage$str(), cause);
    }
    private static final String failedToFormatMessage = "KC-SERVICES0063: Failed to format message due to: %s";
    protected String failedToFormatMessage$str() {
        return failedToFormatMessage;
    }
    @Override
    public final void failedToloadMessages(final IOException ioe) {
        super.log.logf(FQCN, WARN, ioe, failedToloadMessages$str());
    }
    private static final String failedToloadMessages = "KC-SERVICES0064: Failed to load messages";
    protected String failedToloadMessages$str() {
        return failedToloadMessages;
    }
    @Override
    public final void failedToUpdatePassword(final Exception e) {
        super.log.logf(FQCN, ERROR, e, failedToUpdatePassword$str());
    }
    private static final String failedToUpdatePassword = "KC-SERVICES0065: Failed to update Password";
    protected String failedToUpdatePassword$str() {
        return failedToUpdatePassword;
    }
    @Override
    public final void couldNotFireEvent(final Exception e) {
        super.log.logf(FQCN, ERROR, e, couldNotFireEvent$str());
    }
    private static final String couldNotFireEvent = "KC-SERVICES0066: Could not fire event.";
    protected String couldNotFireEvent$str() {
        return couldNotFireEvent;
    }
    @Override
    public final void failedToParseRestartLoginCookie(final Exception e) {
        super.log.logf(FQCN, ERROR, e, failedToParseRestartLoginCookie$str());
    }
    private static final String failedToParseRestartLoginCookie = "KC-SERVICES0067: failed to parse RestartLoginCookie";
    protected String failedToParseRestartLoginCookie$str() {
        return failedToParseRestartLoginCookie;
    }
    @Override
    public final void notFoundSerializedCtxInClientSession(final String noteKey) {
        super.log.logf(FQCN, ERROR, null, notFoundSerializedCtxInClientSession$str(), noteKey);
    }
    private static final String notFoundSerializedCtxInClientSession = "KC-SERVICES0068: Not found serialized context in clientSession under note '%s'";
    protected String notFoundSerializedCtxInClientSession$str() {
        return notFoundSerializedCtxInClientSession;
    }
    @Override
    public final void flowNotConfigForIDP(final String identityProviderAlias) {
        super.log.logf(FQCN, ERROR, null, flowNotConfigForIDP$str(), identityProviderAlias);
    }
    private static final String flowNotConfigForIDP = "KC-SERVICES0069: Flow not configured for identity provider '%s'";
    protected String flowNotConfigForIDP$str() {
        return flowNotConfigForIDP;
    }
    @Override
    public final void flowNotFoundForIDP(final String flowId, final String identityProviderAlias) {
        super.log.logf(FQCN, ERROR, null, flowNotFoundForIDP$str(), flowId, identityProviderAlias);
    }
    private static final String flowNotFoundForIDP = "KC-SERVICES0070: Not found configured flow with ID '%s' for identity provider '%s'";
    protected String flowNotFoundForIDP$str() {
        return flowNotFoundForIDP;
    }
    @Override
    public final void reqdActionDoesNotMatch() {
        super.log.logf(FQCN, ERROR, null, reqdActionDoesNotMatch$str());
    }
    private static final String reqdActionDoesNotMatch = "KC-SERVICES0071: required action doesn't match current required action";
    protected String reqdActionDoesNotMatch$str() {
        return reqdActionDoesNotMatch;
    }
    @Override
    public final void invalidKeyForEmailVerification() {
        super.log.logf(FQCN, ERROR, null, invalidKeyForEmailVerification$str());
    }
    private static final String invalidKeyForEmailVerification = "KC-SERVICES0072: Invalid key for email verification";
    protected String invalidKeyForEmailVerification$str() {
        return invalidKeyForEmailVerification;
    }
    @Override
    public final void userSessionNull() {
        super.log.logf(FQCN, ERROR, null, userSessionNull$str());
    }
    private static final String userSessionNull = "KC-SERVICES0073: User session was null";
    protected String userSessionNull$str() {
        return userSessionNull;
    }
    @Override
    public final void actionProviderNull() {
        super.log.logf(FQCN, ERROR, null, actionProviderNull$str());
    }
    private static final String actionProviderNull = "KC-SERVICES0074: Required action provider was null";
    protected String actionProviderNull$str() {
        return actionProviderNull;
    }
    @Override
    public final void failedToGetThemeRequest(final Exception e) {
        super.log.logf(FQCN, WARN, e, failedToGetThemeRequest$str());
    }
    private static final String failedToGetThemeRequest = "KC-SERVICES0075: Failed to get theme request";
    protected String failedToGetThemeRequest$str() {
        return failedToGetThemeRequest;
    }
    @Override
    public final void rejectedNonLocalAttemptToCreateInitialUser(final String remoteAddr) {
        super.log.logf(FQCN, ERROR, null, rejectedNonLocalAttemptToCreateInitialUser$str(), remoteAddr);
    }
    private static final String rejectedNonLocalAttemptToCreateInitialUser = "KC-SERVICES0076: Rejected non-local attempt to create initial user from %s";
    protected String rejectedNonLocalAttemptToCreateInitialUser$str() {
        return rejectedNonLocalAttemptToCreateInitialUser;
    }
    @Override
    public final void createdInitialAdminUser(final String userName) {
        super.log.logf(FQCN, INFO, null, createdInitialAdminUser$str(), userName);
    }
    private static final String createdInitialAdminUser = "KC-SERVICES0077: Created initial admin user with username %s";
    protected String createdInitialAdminUser$str() {
        return createdInitialAdminUser;
    }
    @Override
    public final void initialUserAlreadyCreated() {
        super.log.logf(FQCN, WARN, null, initialUserAlreadyCreated$str());
    }
    private static final String initialUserAlreadyCreated = "KC-SERVICES0078: Rejected attempt to create initial user as user is already created";
    protected String initialUserAlreadyCreated$str() {
        return initialUserAlreadyCreated;
    }
    @Override
    public final void localeNotSpecified() {
        super.log.logf(FQCN, WARN, null, localeNotSpecified$str());
    }
    private static final String localeNotSpecified = "KC-SERVICES0079: Locale not specified for messages.json";
    protected String localeNotSpecified$str() {
        return localeNotSpecified;
    }
    @Override
    public final void msgBundleNotFound(final String lang) {
        super.log.logf(FQCN, WARN, null, msgBundleNotFound$str(), lang);
    }
    private static final String msgBundleNotFound = "KC-SERVICES0080: Message bundle not found for language code '%s'";
    protected String msgBundleNotFound$str() {
        return msgBundleNotFound;
    }
    @Override
    public final void msgBundleNotFoundForEn() {
        super.log.logf(FQCN, FATAL, null, msgBundleNotFoundForEn$str());
    }
    private static final String msgBundleNotFoundForEn = "KC-SERVICES0081: Message bundle not found for language code 'en'";
    protected String msgBundleNotFoundForEn$str() {
        return msgBundleNotFoundForEn;
    }
    @Override
    public final void noEventStoreProvider() {
        super.log.logf(FQCN, ERROR, null, noEventStoreProvider$str());
    }
    private static final String noEventStoreProvider = "KC-SERVICES0082: Admin Events enabled, but no event store provider configured";
    protected String noEventStoreProvider$str() {
        return noEventStoreProvider;
    }
    @Override
    public final void providerNotFound(final String id) {
        super.log.logf(FQCN, ERROR, null, providerNotFound$str(), id);
    }
    private static final String providerNotFound = "KC-SERVICES0083: Event listener '%s' registered, but provider not found";
    protected String providerNotFound$str() {
        return providerNotFound;
    }
    @Override
    public final void failedToSaveEvent(final Throwable t) {
        super.log.logf(FQCN, ERROR, t, failedToSaveEvent$str());
    }
    private static final String failedToSaveEvent = "KC-SERVICES0084: Failed to save event";
    protected String failedToSaveEvent$str() {
        return failedToSaveEvent;
    }
    @Override
    public final void failedToSendType(final Throwable t, final EventListenerProvider listener) {
        super.log.logf(FQCN, ERROR, t, failedToSendType$str(), listener);
    }
    private static final String failedToSendType = "KC-SERVICES0085: Failed to send type to %s";
    protected String failedToSendType$str() {
        return failedToSendType;
    }
    @Override
    public final void addedKerberosToRealmCredentials() {
        super.log.logf(FQCN, INFO, null, addedKerberosToRealmCredentials$str());
    }
    private static final String addedKerberosToRealmCredentials = "KC-SERVICES0086: Added 'kerberos' to required realm credentials";
    protected String addedKerberosToRealmCredentials$str() {
        return addedKerberosToRealmCredentials;
    }
    @Override
    public final void syncingDataForMapper(final String modelName, final String mapperType, final String direction) {
        super.log.logf(FQCN, INFO, null, syncingDataForMapper$str(), modelName, mapperType, direction);
    }
    private static final String syncingDataForMapper = "KC-SERVICES0087: Syncing data for mapper '%s' of type '%s'. Direction: %s";
    protected String syncingDataForMapper$str() {
        return syncingDataForMapper;
    }
    @Override
    public final void failedToSendActionsEmail(final EmailException e) {
        super.log.logf(FQCN, ERROR, e, failedToSendActionsEmail$str());
    }
    private static final String failedToSendActionsEmail = "KC-SERVICES0088: Failed to send execute actions email";
    protected String failedToSendActionsEmail$str() {
        return failedToSendActionsEmail;
    }
    @Override
    public final void failedToRunScheduledTask(final Throwable t, final String taskClass) {
        super.log.logf(FQCN, ERROR, t, failedToRunScheduledTask$str(), taskClass);
    }
    private static final String failedToRunScheduledTask = "KC-SERVICES0089: Failed to run scheduled task %s";
    protected String failedToRunScheduledTask$str() {
        return failedToRunScheduledTask;
    }
    @Override
    public final void failedToCloseProviderSession(final Throwable t) {
        super.log.logf(FQCN, ERROR, t, failedToCloseProviderSession$str());
    }
    private static final String failedToCloseProviderSession = "KC-SERVICES0090: Failed to close ProviderSession";
    protected String failedToCloseProviderSession$str() {
        return failedToCloseProviderSession;
    }
    @Override
    public final void oidcScopeMissing() {
        if (super.log.isEnabled(WARN) && oidcScopeMissing_$Once.compareAndSet(false, true)) {
            super.log.logf(FQCN, WARN, null, oidcScopeMissing$str());
        }

    }
    private static final String oidcScopeMissing = "KC-SERVICES0091: Request is missing scope 'openid' so it's not treated as OIDC, but just pure OAuth2 request.";
    protected String oidcScopeMissing$str() {
        return oidcScopeMissing;
    }
    private static final AtomicBoolean oidcScopeMissing_$Once = new AtomicBoolean(false);
    @Override
    public final void missingParameter(final String paramName) {
        super.log.logf(FQCN, ERROR, null, missingParameter$str(), paramName);
    }
    private static final String missingParameter = "KC-SERVICES0092: Missing parameter: %s";
    protected String missingParameter$str() {
        return missingParameter;
    }
    @Override
    public final void invalidParameter(final String paramName) {
        super.log.logf(FQCN, ERROR, null, invalidParameter$str(), paramName);
    }
    private static final String invalidParameter = "KC-SERVICES0093: Invalid parameter value for: %s";
    protected String invalidParameter$str() {
        return invalidParameter;
    }
    @Override
    public final void unsupportedParameter(final String paramName) {
        super.log.logf(FQCN, ERROR, null, unsupportedParameter$str(), paramName);
    }
    private static final String unsupportedParameter = "KC-SERVICES0094: Unsupported parameter: %s";
    protected String unsupportedParameter$str() {
        return unsupportedParameter;
    }
    @Override
    public final void flowNotAllowed(final String flowName) {
        super.log.logf(FQCN, ERROR, null, flowNotAllowed$str(), flowName);
    }
    private static final String flowNotAllowed = "KC-SERVICES0095: Client is not allowed to initiate browser login with given response_type. %s flow is disabled for the client.";
    protected String flowNotAllowed$str() {
        return flowNotAllowed;
    }
    @Override
    public final void supportedJwkNotFound(final String usage) {
        super.log.logf(FQCN, WARN, null, supportedJwkNotFound$str(), usage);
    }
    private static final String supportedJwkNotFound = "KC-SERVICES0096: Not found JWK of supported keyType under jwks_uri for usage: %s";
    protected String supportedJwkNotFound$str() {
        return supportedJwkNotFound;
    }
    @Override
    public final void invalidRequest(final Throwable t) {
        super.log.logf(FQCN, WARN, t, invalidRequest$str());
    }
    private static final String invalidRequest = "KC-SERVICES0097: Invalid request";
    protected String invalidRequest$str() {
        return invalidRequest;
    }
    @Override
    public final void clientRegistrationRequestRejected(final String opDescription, final String detailedMessage) {
        super.log.logf(FQCN, WARN, null, clientRegistrationRequestRejected$str(), opDescription, detailedMessage);
    }
    private static final String clientRegistrationRequestRejected = "KC-SERVICES0099: Operation '%s' rejected. %s";
    protected String clientRegistrationRequestRejected$str() {
        return clientRegistrationRequestRejected;
    }
    @Override
    public final void clientRegistrationMapperNotAllowed(final String mapperName, final String mapperType) {
        super.log.logf(FQCN, WARN, null, clientRegistrationMapperNotAllowed$str(), mapperName, mapperType);
    }
    private static final String clientRegistrationMapperNotAllowed = "KC-SERVICES0100: ProtocolMapper '%s' of type '%s' not allowed";
    protected String clientRegistrationMapperNotAllowed$str() {
        return clientRegistrationMapperNotAllowed;
    }
    @Override
    public final void failedToVerifyRemoteHost(final String hostname) {
        super.log.logf(FQCN, WARN, null, failedToVerifyRemoteHost$str(), hostname);
    }
    private static final String failedToVerifyRemoteHost = "KC-SERVICES0101: Failed to verify remote host : %s";
    protected String failedToVerifyRemoteHost$str() {
        return failedToVerifyRemoteHost;
    }
    @Override
    public final void urlDoesntMatch(final String url) {
        super.log.logf(FQCN, WARN, null, urlDoesntMatch$str(), url);
    }
    private static final String urlDoesntMatch = "KC-SERVICES0102: URL '%s' doesn't match any trustedHost or trustedDomain";
    protected String urlDoesntMatch$str() {
        return urlDoesntMatch;
    }
    @Override
    public final void passwordResetFailed(final Throwable t) {
        super.log.logf(FQCN, DEBUG, t, passwordResetFailed$str());
    }
    private static final String passwordResetFailed = "KC-SERVICES0103: Failed to reset password. User is temporarily disabled";
    protected String passwordResetFailed$str() {
        return passwordResetFailed;
    }
    @Override
    public final void notCreatingExistingUser(final String userName) {
        super.log.logf(FQCN, WARN, null, notCreatingExistingUser$str(), userName);
    }
    private static final String notCreatingExistingUser = "KC-SERVICES0104: Not creating user %s. It already exists.";
    protected String notCreatingExistingUser$str() {
        return notCreatingExistingUser;
    }
}
