package tonydarko.spealth;

import android.app.Application;
import android.content.SharedPreferences;

import tonydarko.spealth.Utils.Constants;

public class SpealthApplication extends Application {


    private static SharedPreferences sharedPreferences;

    @Override
    public void onCreate() {
        super.onCreate();

        sharedPreferences = getSharedPreferences(Constants.SHARE_PREF_FILE_NAME, MODE_PRIVATE);
    }

    public static void saveAuthToken(String token) {
        sharedPreferences
                .edit()
                .putString(Constants.TOKEN_KEY, token)
                .apply();
    }

    public static String getAuthToken() {
        return sharedPreferences
                .getString(Constants.TOKEN_KEY, "");
    }

    public static void saveGoogleAuthToken(String token) {
        sharedPreferences
                .edit()
                .putString(Constants.GOOGLE_TOKEN_KEY, token)
                .apply();
    }

    public static String getGoogleAuthToken() {
        return sharedPreferences
                .getString(Constants.GOOGLE_TOKEN_KEY, "");

    }

    public static void saveEmail(String email) {

        sharedPreferences
                .edit()
                .putString(Constants.EMAIL_KEY, email)
                .apply();
    }

    public static String getEmail() {
        return sharedPreferences
                .getString(Constants.EMAIL_KEY, "");
    }

    public static void saveName(String name) {

        sharedPreferences
                .edit()
                .putString(Constants.NAME_KEY, name)
                .apply();
    }

    public static String getName() {
        return sharedPreferences
                .getString(Constants.NAME_KEY, "");
    }

    public static void savePicture(String picture) {

        sharedPreferences
                .edit()
                .putString(Constants.PICTURE_KEY, picture)
                .apply();
    }

    public static String getPicture() {
        return sharedPreferences
                .getString(Constants.PICTURE_KEY, "");
    }




}
