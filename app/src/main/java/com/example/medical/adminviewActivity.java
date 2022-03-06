package com.example.medical;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.squareup.picasso.Picasso;

import java.nio.charset.StandardCharsets;


public class adminviewActivity extends AppCompatActivity {
    ImageView image_view;
    TextView tvview,  descview;

    //declare button veriable
    Button btndelet;
    DatabaseReference ref,dataref; //declare data ref for delet button
    StorageReference storageReference;//declare stroge ref fro delet button


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_adminview );

        image_view= findViewById(R.id.image_view);
        tvview =findViewById(R.id.tvview);
        descview =findViewById(R.id.descview);

        //delet button find id
        btndelet=findViewById(R.id.btndelet);

        ref= FirebaseDatabase.getInstance().getReference().child("item");


        String itemkey = getIntent().getStringExtra("itemkey");


        //declare both two lines for delet button
        dataref = FirebaseDatabase.getInstance().getReference().child("item").child(itemkey);
        storageReference= FirebaseStorage.getInstance().getReference().child("itemimage").child(itemkey+"jpg");


        ref.child(itemkey).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(snapshot.exists())
                {
                    String itemimage = snapshot.child("itemimage").getValue().toString();

                    String des = snapshot.child("des").getValue().toString();

                    String imageuri = snapshot.child("imageuri").getValue().toString();



                    Picasso.get().load(imageuri).into(image_view);
                    tvview.setText(itemimage);
                    descview.setText(des);


                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });



        //add seton click listner for delet button

        btndelet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dataref.removeValue().addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void unused) {
                        storageReference.delete().addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(adminviewActivity.this, "item is deleted", Toast.LENGTH_SHORT).show();

                                startActivity(new Intent(getApplicationContext(),adminhome.class));
                            }
                        });
                    }
                });

            }
        });


    }
}