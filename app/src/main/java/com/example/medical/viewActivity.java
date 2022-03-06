package com.example.medical;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;
public class viewActivity extends AppCompatActivity {
    ImageView image_view;
    TextView tvview,  descview;
    Button de,dea,ded;

    DatabaseReference ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_view );
        getSupportActionBar ().hide ();

        image_view= findViewById(R.id.image_view);
        tvview =findViewById(R.id.tvview);
        descview =findViewById(R.id.descview);
       de=findViewById ( R.id.de );
       dea=findViewById ( R.id.dea );
       ded=findViewById ( R.id.ded );
        ref= FirebaseDatabase.getInstance().getReference().child("item");


        String itemkey = getIntent().getStringExtra("itemkey");

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
        de.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent ( viewActivity.this,MainActivity8.class );
                startActivity ( intent );
            }
        } );
        dea.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent ( viewActivity.this,MainActivity5.class );
                startActivity ( intent );
            }
        } );
        ded.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent ( viewActivity.this,MainActivity14.class );
                startActivity ( intent );
            }
        } );

    }
}