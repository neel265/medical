package com.example.medical.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.medical.MainActivity45;
import com.example.medical.MainActivity46;
import com.example.medical.MainActivity47;
import com.example.medical.MainActivity51;
import com.example.medical.MainActivity52;
import com.example.medical.MainActivity53;
import com.example.medical.MainActivity64;
import com.example.medical.R;
import com.example.medical.adapter.eadapter;
import com.example.medical.classes.recycler;
import com.example.medical.model.dc;
import com.example.medical.model.elderly;

import java.util.ArrayList;


public class efragment extends Fragment {
    RecyclerView rec;
    ArrayList <elderly> er;


    public efragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate ( R.layout.fragment_efragment, container, false );

        rec=view.findViewById ( R.id.rec);

        er=new ArrayList <> (  );
        er.add ( new elderly ( R.drawable.ef,"Calcimax Forte Plus Strip of30 Tablets MRP 200" ) );
        er.add ( new elderly ( R.drawable.es,"Volini Pain Relif Spray Bottle of 1.. MRP 50" ) );
        er.add ( new elderly ( R.drawable.et,"Volin Pain Relif Gel 30Gm MRP 90" ) );
        er.add ( new elderly ( R.drawable.esi,"Iodex Balm 8gm MRP 40" ) );


        eadapter eadapter=new eadapter ( er,getContext () );
        LinearLayoutManager layoutManager=new LinearLayoutManager ( getContext (),LinearLayoutManager.VERTICAL,false );
        rec.setLayoutManager ( layoutManager );
        rec.setNestedScrollingEnabled ( false );
        rec.setAdapter ( eadapter );
        rec.addOnItemTouchListener ( new recycler ( getContext ( ), rec, new recycler.OnItemClickListener ( ) {
            @Override
            public void onItemClick(View view, int position) {
                switch (position){
                    case 0:
                        Intent intent1=new Intent ( getActivity (), MainActivity45.class );
                        startActivity ( intent1 );
                        break;
                    case 1:
                        Intent intent7=new Intent ( getActivity (), MainActivity51.class );
                        startActivity ( intent7);
                        break;

                    case 2:
                        Intent intent9=new Intent ( getActivity (), MainActivity52.class );
                        startActivity ( intent9 );
                        break;
                    case 3:
                        Intent intent2=new Intent ( getActivity (), MainActivity64.class );
                        startActivity ( intent2 );
                        break;

                }
            }

            @Override
            public void onItemLongClick(View view, int position) {

            }
        } ) );
        return view;
    }
}