package tonydarko.spealth.Utils;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.GoogleApiClient;

public class Constants {

    static  GoogleSignInAccount googleSignInAccount;
    static GoogleSignInResult googleSignInResult;
    static GoogleApiClient googleApiClient;

    public static GoogleSignInAccount getGoogleSignInAccount() {
        return googleSignInAccount;
    }

    public static void setGoogleSignInAccount(GoogleSignInAccount googleSignInAccount) {
        Constants.googleSignInAccount = googleSignInAccount;
    }

    public static GoogleSignInResult getGoogleSignInResult() {
        return googleSignInResult;
    }

    public static void setGoogleSignInResult(GoogleSignInResult googleSignInResult) {
        Constants.googleSignInResult = googleSignInResult;
    }

    public static GoogleApiClient getGoogleApiClient() {
        return googleApiClient;
    }

    public static void setGoogleApiClient(GoogleApiClient googleApiClient) {
        Constants.googleApiClient = googleApiClient;
    }

    public static final String STATUS_SUCCEED = "success";
    public static final String STATUS_LOGIN_BUSY_ALREADY = "Login busy already";
    public static final String STATUS_WRONG_LOGIN = "Wrong login";
    public static final String STATUS_WRONG_PASSWORD = "Wrong password";
    public static final String STATUS_ERROR = "Error";

    public static final String SHARE_PREF_FILE_NAME = "money_tracker_shared_pref";
    public static final String TOKEN_KEY = "token_key";

    public static final String GOOGLE_TOKEN_KEY = "google_token_key";
    private static final String G_PLUS_SCOPE = "oauth2:https://www.googleapis.com/auth/plus.me";
    private static final String USERINFO_SCOPE = "https://www.googleapis.com/auth/userinfo.profile";
    private static final String EMAIL_SCOPE = "https://www.googleapis.com/auth/userinfo.email";
    public static final String SCOPES = G_PLUS_SCOPE + " " + USERINFO_SCOPE + " " + EMAIL_SCOPE;
    public static final String EMAIL_KEY = "email";
    public static final String NAME_KEY = "name";
    public static final String PICTURE_KEY = "picture";

}
