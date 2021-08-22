package com.example.myfirstshoppingapplication;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.myfirstshoppingapplication.Fragments.FirstFragment;
import com.example.myfirstshoppingapplication.Fragments.ForthFragment;
import com.example.myfirstshoppingapplication.Fragments.HomeFragment;
import com.example.myfirstshoppingapplication.Fragments.LocationFragment;
import com.example.myfirstshoppingapplication.Fragments.SecondFragment;
import com.example.myfirstshoppingapplication.Fragments.SettingFragment;
import com.example.myfirstshoppingapplication.Fragments.ThirdFragment;
import com.google.android.material.navigation.NavigationView;

import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    String searchResult = "";
    //hello im also in there
    ImageButton img_btn_setting_main_bottom_menu ,
            img_btn_location_main_bottom_menu ,
            img_btn_profile_main_bottom_menu ,
            img_btn_card_main_bottom_menu ;

    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView nav_view;
    ActionBarDrawerToggle toggle;
    FragmentManager fm;
    FragmentTransaction ft;
    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupComponent();
        setSupportActionBar(toolbar);

        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {
                return true;
            }
        });

        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        getSupportActionBar().setDisplayShowHomeEnabled(true);

        nav_view.setNavigationItemSelectedListener(this);

        HomeFragment home = new HomeFragment(this);
        setMyFragment(home);

        img_btn_location_main_bottom_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LocationFragment locationFragment = new LocationFragment();
                setMyFragment(locationFragment);
            }
        });

        img_btn_profile_main_bottom_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SettingFragment settingFragment = new SettingFragment();
                setMyFragment(settingFragment);
            }
        });

        img_btn_card_main_bottom_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            /*  CardFragment cardFragment = new CardFragment(getApplicationContext());
                setMyFragment(cardFragment);*/
            /* Intent intent = new Intent(MainActivity.this,PaymentActivity.class);
                startActivity(intent);*/
            }
        });

        img_btn_setting_main_bottom_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SettingFragment settingFragment = new SettingFragment();
                setMyFragment(settingFragment);
            }
        });

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                searchResult = "";
                if(query.equals(searchResult)){
                    ForthFragment forthFragment = new ForthFragment();
                    setMyFragment(forthFragment);
                    return true;
                }else{
                    Toast.makeText(MainActivity.this, "result not found", Toast.LENGTH_SHORT).show();
                    return false;
                }
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.drawer_view, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {
        setupComponent();
        switch(item.getItemId()){
            case R.id.nav_first_fragment:
                FirstFragment firstFragment = new FirstFragment();
                setMyFragment(firstFragment);
                break;
            case R.id.nav_second_fragment:
                SecondFragment secondFragment = new SecondFragment();
                setMyFragment(secondFragment);
                break;
            case R.id.nav_third_fragment:
                ThirdFragment thirdFragment = new ThirdFragment();
                setMyFragment(thirdFragment);
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    private void setMyFragment(Fragment fragment){
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        ft.replace(R.id.flContentFramLayout,fragment).addToBackStack(null);
        ft.commit();
    }

    @Override
    public void onBackPressed() {
        setupComponent();
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else{
            //hideKeyboard();
            super.onBackPressed();
        }
    }

    private void setupComponent(){

        drawerLayout = findViewById(R.id.drawerLayout_main);
        nav_view = findViewById(R.id.nav);
        searchView = findViewById(R.id.search_bar_main_toolbar);
        toolbar = findViewById(R.id.mytoolbar);
        img_btn_card_main_bottom_menu = (ImageButton)findViewById(R.id.img_btn_card_main_bottom_menu);
        img_btn_setting_main_bottom_menu = (ImageButton)findViewById(R.id.img_btn_setting_main_bottom_menu);
        img_btn_profile_main_bottom_menu = (ImageButton)findViewById(R.id.img_btn_profile_main_bottom_menu);
        img_btn_location_main_bottom_menu = (ImageButton)findViewById(R.id.img_btn_location_main_bottom_menu);

    }

    private void hideKeyboard(){
        View view = this.getCurrentFocus();
        if(view != null){
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(),0);
        }
    }

}