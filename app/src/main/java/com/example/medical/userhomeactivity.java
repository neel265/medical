package com.example.medical;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.squareup.picasso.Picasso;


public class userhomeactivity extends AppCompatActivity {
    EditText inputsearch;
    RecyclerView rcview;
    FirebaseRecyclerOptions <items> options;
    FirebaseRecyclerAdapter <items,MyviewHolder> adapter;
    DatabaseReference DataRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_userhomeactivity );
        getSupportActionBar ().hide ();

        DataRef = FirebaseDatabase.getInstance().getReference().child("item");


        inputsearch =findViewById(R.id.inputsearch);
        rcview =findViewById(R.id.rcview);

//        rcview.setLayoutManager(new GridLayoutManager(getApplicationContext(this,2)));


        GridLayoutManager layoutManager = new GridLayoutManager(this, 2 );
        rcview.setLayoutManager(layoutManager);
        rcview.setHasFixedSize(true);

//        floatingActionButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(getApplicationContext(),addActivity.class));
//
//            }
//        });

        LoadData("");

        inputsearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(editable.toString() !=null)
                {
                    LoadData(editable.toString());
                }
                else
                {
                    LoadData("");
                }
            }
        });

    }

    private void LoadData(String data)
    {
        Query query =DataRef.orderByChild("itemimage").startAt(data).endAt(data+"\uf8ff");

        options = new FirebaseRecyclerOptions.Builder<items>().setQuery(query,items.class).build();
        adapter = new FirebaseRecyclerAdapter<items, MyviewHolder>(options) {
            @SuppressLint("RecyclerView")
            @Override
            protected void onBindViewHolder(@NonNull MyviewHolder holder, int position, @NonNull items model) {

                holder.tvdemo.setText(model.getItemimage());
                //   holder.des.setText(model.getDes());

                Picasso.get().load(model.getImageuri()).into(holder.imageViewdemo);
                holder.v.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent= new Intent(userhomeactivity.this , viewActivity.class);
                        intent.putExtra("itemkey", getRef(position).getKey());
                        startActivity(intent);
                    }
                });


            }

            @NonNull
            @Override
            public MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

                View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.singledemo,parent,false);
                return new MyviewHolder(v);
            }
        };
        adapter.startListening();
        rcview.setAdapter(adapter);

    }


}