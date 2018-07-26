package tonydarko.spealth.controller;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Toast;

import java.util.Stack;

import butterknife.BindView;
import butterknife.ButterKnife;
import tonydarko.spealth.R;
import tonydarko.spealth.controller.fragments.ChatFragment;
import tonydarko.spealth.controller.fragments.HomeFragment;
import tonydarko.spealth.controller.fragments.NavigationFragment;
import tonydarko.spealth.controller.fragments.NewsFragment;
import tonydarko.spealth.controller.fragments.SettingsFragment;

public class HomeActivity extends AppCompatActivity implements
        BottomNavigationView.OnNavigationItemSelectedListener {
    @BindView(R.id.navigation)
    BottomNavigationView navigation;
    Stack<MenuItem> menuItemsStack = new Stack<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

        if (savedInstanceState == null) {
            replaceFragment(HomeFragment.newInstance());
        }

        navigation.setOnNavigationItemSelectedListener(this);
    }

    private void replaceFragment(Fragment fragment) {
        String backStackName = fragment.getClass().getName();

        FragmentManager manager = getSupportFragmentManager();
        boolean fragmentPopped = manager.popBackStackImmediate(backStackName, 0);

        if (!fragmentPopped && manager.findFragmentByTag(backStackName) == null) {
            FragmentTransaction ft = manager.beginTransaction();
            ft.replace(R.id.container, fragment, backStackName);
            ft.addToBackStack(backStackName);
            ft.commit();
        }
    }

    @Override
    public void onBackPressed() {
        if (menuItemsStack.size() > 1) {
            menuItemsStack.pop();
            System.out.println(menuItemsStack.size());
            navigation.setSelectedItemId(menuItemsStack.get(menuItemsStack.size() - 1).getItemId());
            menuItemsStack.pop();
        } else if (menuItemsStack.size() == 1) {
            menuItemsStack.pop();
            navigation.setSelectedItemId(R.id.navigation_home);
            menuItemsStack.pop();
        }else {
            super.onBackPressed();
            finish();
        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.navigation_home:
                replaceFragment(HomeFragment.newInstance());
                menuItemsStack.push(item);
                System.out.println(menuItemsStack.size());
                return true;
            case R.id.navigation_chats:
                replaceFragment(ChatFragment.newInstance());
                menuItemsStack.push(item);
                System.out.println(menuItemsStack.size());
                return true;
            case R.id.navigation_news:
                replaceFragment(NewsFragment.newInstance());
                menuItemsStack.push(item);
                System.out.println(menuItemsStack.size());
                return true;
            case R.id.navigation_navigation:
                replaceFragment(NavigationFragment.newInstance());
                menuItemsStack.push(item);
                System.out.println(menuItemsStack.size());
                return true;
            case R.id.navigation_settings:
                replaceFragment(SettingsFragment.newInstance());
                menuItemsStack.push(item);
                System.out.println(menuItemsStack.size());
                return true;
        }
        return false;
    }
}
