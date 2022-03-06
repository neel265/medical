package com.example.medical;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.medical.databinding.ActivityMainBinding;
import com.example.medical.fragment.accountFragment;
import com.example.medical.fragment.homefragement;
import com.example.medical.fragment.shopFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;

public class mainactivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    ActivityMainBinding binding;
    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        auth = FirebaseAuth.getInstance();

        FragmentTransaction fragmentTransaction=getSupportFragmentManager ().beginTransaction ();
        fragmentTransaction.replace ( R.id.contanier,new homefragement () );
        fragmentTransaction.commit ();

        bottomNavigationView=findViewById ( R.id.bottomnavigation );
        bottomNavigationView.setOnNavigationItemSelectedListener ( new BottomNavigationView.OnNavigationItemSelectedListener ( ) {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                FragmentTransaction fragmentTransaction=getSupportFragmentManager ().beginTransaction ();
                switch (item.getItemId ())
                {
                    case R.id.home:

                        fragmentTransaction.replace ( R.id.contanier,new homefragement ());

                        break;

                    case R.id.shop:
                        fragmentTransaction.replace ( R.id.contanier,new shopFragment () );
                        break;
                    case R.id.account:
                        fragmentTransaction.replace ( R.id.contanier,new accountFragment () );
                        break;
                }
                fragmentTransaction.commit ();
                return true;
            }
        } );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater =getMenuInflater();
        inflater.inflate(R.menu.menuu , menu);
        return super.onCreateOptionsMenu ( menu );
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.setting:
                Toast.makeText(this, "settings", Toast.LENGTH_SHORT).show();
                break;
            case R.id.logput:
                auth.signOut();
                Intent intent=new Intent ( mainactivity.this, signupactivity.class );
                startActivity ( intent );
                break;
        }
        return true;
    }
}