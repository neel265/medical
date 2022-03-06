package com.example.medical;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.medical.databinding.ActivitySigninactiivtyBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class signinactiivty extends AppCompatActivity {
    FirebaseAuth auth;

    ActivitySigninactiivtyBinding binding;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        binding =ActivitySigninactiivtyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        auth = FirebaseAuth.getInstance();
        progressDialog = new ProgressDialog(signinactiivty.this);
        progressDialog.setTitle("login");
        progressDialog.setMessage("login in your account");

        binding.btnsinghin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialog.show();
                auth.signInWithEmailAndPassword(binding.Emailin.getText().toString() , binding.etPasswordin.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressDialog.dismiss();

                        if(task.isSuccessful())

                        {
                            Intent intent = new Intent(signinactiivty.this,mainactivity.class);
                            startActivity(intent);
                        }
                        else {
                            Toast.makeText(signinactiivty.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

        binding.clicksignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(signinactiivty.this ,signupactivity.class);
                startActivity(intent);
            }
        });
        if(auth.getCurrentUser()!= null)
        {
            Intent intent = new Intent(signinactiivty.this , mainactivity.class);
            startActivity(intent);
        }

    }
}