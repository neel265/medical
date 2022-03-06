package com.example.medical;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.medical.databinding.ActivitySignupactivityBinding;
import com.example.medical.models.user;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class signupactivity extends AppCompatActivity {

    ActivitySignupactivityBinding binding;
    private FirebaseAuth auth;
    FirebaseDatabase database;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        binding = ActivitySignupactivityBinding.inflate((getLayoutInflater()));
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        auth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();

        progressDialog = new ProgressDialog(signupactivity.this);
        progressDialog.setTitle("creating account");
        progressDialog.setMessage("we are creting your account");




        binding.btnsinghup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialog.show();
                auth.createUserWithEmailAndPassword(binding.Email.getText().toString(),binding.etPassword.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        progressDialog.dismiss();
                        if(task.isSuccessful()){
                            user user = new user(binding.Username.getText().toString() , binding.Email.getText().toString(), binding.etPassword.getText().toString());

                            String Id = task.getResult().getUser().getUid();
                            database.getReference().child("users").child(Id).setValue(user);
                            Toast.makeText(signupactivity.this, "User created succefully", Toast.LENGTH_SHORT).show();


                        }
                        else {
                            Toast.makeText(signupactivity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }


                    }
                });


            }
        });
        binding.haveacc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(signupactivity.this ,signinactiivty.class);
                startActivity(intent);
            }

        });

    }
}