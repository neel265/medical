package com.example.medical;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.medical.databinding.ActivityAdminsignupactivityBinding;
import com.example.medical.databinding.ActivitySignupactivityBinding;
import com.example.medical.models.admin;
import com.example.medical.models.user;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;
public class adminsignupactivity extends AppCompatActivity {
    ActivityAdminsignupactivityBinding binding;
    private FirebaseAuth auth;
    FirebaseDatabase database;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        binding = ActivityAdminsignupactivityBinding.inflate((getLayoutInflater()));
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        auth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();

        progressDialog = new ProgressDialog(adminsignupactivity.this);
        progressDialog.setTitle("creating account");
        progressDialog.setMessage("we are creting your account");

        binding.adminsinghup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialog.show();
                auth.createUserWithEmailAndPassword(binding.adminEmail.getText().toString(),binding.adminPassword.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        progressDialog.dismiss();
                        if(task.isSuccessful()){
                            admin admin= new admin(binding.adminUsername.getText().toString() , binding.adminEmail.getText().toString(), binding.adminPassword.getText().toString());

                            String Id = task.getResult().getUser().getUid();
                            database.getReference().child("admin").child(Id).setValue(admin);
                            Toast.makeText(adminsignupactivity.this, "User created succefully", Toast.LENGTH_SHORT).show();


                        }
                        else {
                            Toast.makeText(adminsignupactivity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }


                    }
                });


            }
        });
        binding.adminhaveacc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(adminsignupactivity.this ,adminsigninactivity.class);
                startActivity(intent);
            }

        });

    }
}