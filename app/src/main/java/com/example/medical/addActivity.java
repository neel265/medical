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


public class addActivity extends AppCompatActivity {
    private static final int REQUEST_CODE_IMAGE = 101;
    private ImageView imageviewadd;
    private EditText inputimagename;
    private TextView textviewprogress;
    private ProgressBar progressbar;
    private Button btnuplod;
    private EditText des;

    Uri imageuri;
    boolean isImageadded =false;



    DatabaseReference Dataref;
    StorageReference Storageref;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_add );


        imageviewadd =findViewById(R.id.imageViewadd);
        inputimagename =findViewById(R.id.inputimagename);
        textviewprogress =findViewById(R.id.textviewprogress);
        progressbar =findViewById(R.id.progressbar);
        btnuplod =findViewById(R.id.btnuplod);
        des =findViewById(R.id.des);


        textviewprogress.setVisibility(View.GONE);
        progressbar.setVisibility(View.GONE);

        Dataref = FirebaseDatabase.getInstance().getReference().child("item");
        Storageref= FirebaseStorage.getInstance().getReference().child("itemimage");

        imageviewadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent ,REQUEST_CODE_IMAGE);
            }
        });
        btnuplod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String imagename = inputimagename.getText().toString();
                final String descripton =des.getText().toString();

                if(isImageadded!=false && imagename!=null  && descripton!=null)
                {
                    uploadImage(imagename,descripton);



                }
            }
        });
    }

    private void uploadImage(final String imagename,final String descripton) {
        textviewprogress.setVisibility(View.VISIBLE);
        progressbar.setVisibility(View.VISIBLE);


        final   String key =Dataref.push().getKey();
        Storageref.child(key+"jpg").putFile(imageuri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                Storageref.child(key+"jpg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        HashMap hashMap =new HashMap();
                        hashMap.put("itemimage",imagename);
                        hashMap.put("des",descripton);
                        hashMap.put("imageuri",uri.toString());

                        Dataref.child(key).setValue(hashMap).addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {

                                startActivity(new Intent(getApplicationContext(),adminhomeactivity.class));
                                Toast.makeText(addActivity.this , "data Suceesfully uploded", Toast.LENGTH_SHORT).show();
                            }
                        });
                    }

                });


            }
        }).addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onProgress(@NonNull UploadTask.TaskSnapshot snapshot) {
                double progress = (snapshot.getBytesTransferred()*100)/snapshot.getTotalByteCount();
                progressbar.setProgress((int) progress);
                textviewprogress.setText(progress+"%");
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_CODE_IMAGE && data!=null)
        {
            imageuri = data.getData();
            isImageadded=true;
            imageviewadd.setImageURI(imageuri);
        }
    }
}