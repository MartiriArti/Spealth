package tonydarko.spealth.Utils;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiClient;

public class Constants {

    public static GoogleSignInAccount getGoogleSignInAccount() {
        return googleSignInAccount;
    }

    public static void setGoogleSignInAccount(GoogleSignInAccount googleSignInAccount) {
        Constants.googleSignInAccount = googleSignInAccount;
    }

    static  GoogleSignInAccount googleSignInAccount;
}
