package com.example.medical;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.util.HashMap;

public class adminhomeactivity extends AppCompatActivity {
    private static final int REQUEST_CODE_IMAGE =101 ;
    private ImageView imageadd;
    private EditText input,desc,shop;
    private TextView textprogres;
    private ProgressBar progressBar;
    private Button adupload;

    Uri imageUri;
    boolean isimageadd=false;




    DatabaseReference ref;
    StorageReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_adminhomeactivity );
        imageadd=findViewById ( R.id.imageadd );
        input=findViewById ( R.id.input );
        textprogres=findViewById ( R.id.textprogress );
        progressBar=findViewById ( R.id.progressbar );
        adupload=findViewById ( R.id.adupload );
        shop=findViewById ( R.id.shop );
        desc=findViewById ( R.id.desc );

        // to set the visibility
        textprogres.setVisibility ( View.GONE );
        progressBar.setVisibility ( View.GONE );


        ref= FirebaseDatabase.getInstance ().getReference ().child ( "name" );
        ref=FirebaseDatabase.getInstance ( ).getReference ( ).child ( "desc" );
        ref=FirebaseDatabase.getInstance ().getReference ().child ( "shop" );
        reference=FirebaseStorage.getInstance ( ).getReference ( ).child ( "medicine" );






        imageadd.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent ( );
                intent.setType ( "image/*" );
                intent.setAction ( Intent.ACTION_GET_CONTENT );
                startActivityForResult ( intent,REQUEST_CODE_IMAGE );
            }
        } );
        adupload.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
               final String imagename=input.getText ().toString ();
               final String imagedesc=desc.getText ().toString ();
               final String imageshop=shop.getText ().toString ();
               if (isimageadd!=false&& imagename!=null&& imagedesc!=null&& imageshop!=null){
                   uploadImage(imagename,imagedesc,imageshop);

               }


            }
        } );


    }


            private void uploadImage(final String imagename, String imagedesc, String imageshop){
                textprogres.setVisibility ( View.VISIBLE );
                progressBar.setVisibility ( View.VISIBLE );


                final String key = ref.push ( ).getKey ( );
                reference.child ( key + ".jpg" ).putFile ( imageUri ).addOnSuccessListener ( new OnSuccessListener <UploadTask.TaskSnapshot> ( ) {
                    @Override
                    public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {

                        reference.child ( key + ".jpg" ).getDownloadUrl ( ).addOnSuccessListener ( new OnSuccessListener <Uri> ( ) {
                            @Override
                            public void onSuccess(Uri uri) {
                                HashMap hashMap = new HashMap ( );
                                hashMap.put ( "name", imagename );
                                hashMap.put ( "desc",imagedesc );
                                hashMap.put ( "shop",imageshop );
                                hashMap.put ( "medicine",uri.toString () );
                                ref.setValue ( hashMap ).addOnSuccessListener ( new OnSuccessListener <Void> ( ) {
                                    @Override
                                    public void onSuccess(Void unused) {
                                        Toast.makeText ( adminhomeactivity.this, "upload image ", Toast.LENGTH_SHORT ).show ( );
                                    }
                                } );


                            }
                        } );
                    }
                } ).addOnProgressListener ( new OnProgressListener <UploadTask.TaskSnapshot> ( ) {
                    @Override
                    public void onProgress(@NonNull UploadTask.TaskSnapshot snapshot) {
                        double progress = (snapshot.getBytesTransferred ( ) * 100) / snapshot.getTotalByteCount ( );
                        progressBar.setProgress ( (int) progress );

                    }
                } );
            }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult ( requestCode, resultCode, data );
    if (requestCode==REQUEST_CODE_IMAGE&& data!=null){
        imageUri=data.getData ();
        isimageadd=true;
        imageadd.setImageURI ( imageUri );
    }
    }
}