package com.example.material_nav_toolbar_fragcommu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.material_nav_toolbar_fragcommu.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationView;

public  class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, Fragment_Communication {
    private static String TAG="HomeActivity";
    private ActivityMainBinding binding;

    FirstFragment firstFragment;
    SecondFragent secondFragent;
    FragmentTransaction transaction;

    Toolbar toolbar;
    TextView toolbarTitle;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle actionBarDrawerToggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater()) ;
        setContentView(binding.getRoot());

        toolbar=findViewById(R.id.toolbarhome);
        setSupportActionBar(toolbar);

        toolbarTitle=findViewById(R.id.toolbarTitle);
        toolbarTitle.setText("Apply Mama");
        drawerLayout=findViewById(R.id.drawerlayout);
        navigationView=findViewById(R.id.navigation);

        actionBarDrawerToggle=new ActionBarDrawerToggle(this,
                drawerLayout,toolbar,R.string.open,R.string.close);

        actionBarDrawerToggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white,null));
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();


        actionBarDrawerToggle.setToolbarNavigationClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        navigationView.setNavigationItemSelectedListener(this);
        init_fragment();

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }

    private void init_fragment(){
        firstFragment =new FirstFragment();
        transaction=getSupportFragmentManager().beginTransaction();
        transaction.add(binding.appbarHome.contenthome.homeFrameLayout.getId(), firstFragment,"HomeFragment").commit();
    }

    @Override
    public void doTransaction(String fragmentTag, String data) {

        secondFragent =new SecondFragent();

        transaction=getSupportFragmentManager().beginTransaction();

        Bundle bundle=new Bundle();
        bundle.putString(getString(R.string.intent_message),data);
        secondFragent.setArguments(bundle);

        transaction.addToBackStack(fragmentTag);
        transaction.replace(binding.appbarHome.contenthome.homeFrameLayout.getId(), secondFragent);
        transaction.commit();

        actionBarDrawerToggle.setDrawerIndicatorEnabled(false);
    }



    @Override
    public void onBackPressed() {
        actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        super.onBackPressed();
    }

}
