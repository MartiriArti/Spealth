package tonydarko.spealth.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import tonydarko.spealth.R;
import tonydarko.spealth.Utils.Constants;
import tonydarko.spealth.controller.fragments.NewsFragment;
import tonydarko.spealth.controller.fragments.SettingsFragment;

public class HomeActivity extends AppCompatActivity {


    @BindView(R.id.navigation)
    BottomNavigationView navigation;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.container, NewsFragment.newInstance())
                            .commit();
                    return true;
                case R.id.navigation_chats:
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.container, NewsFragment.newInstance())
                            .commit();
                    return true;
                case R.id.navigation_chats1:
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.container, NewsFragment.newInstance())
                            .commit();
                    return true;
                case R.id.navigation_home1:
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.container, NewsFragment.newInstance())
                            .commit();
                    return true;
                case R.id.navigation_settings:
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.container, SettingsFragment.newInstance())
                            .commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
}
