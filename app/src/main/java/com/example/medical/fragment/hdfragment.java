package com.example.medical.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.medical.MainActivity65;
import com.example.medical.MainActivity66;
import com.example.medical.MainActivity67;
import com.example.medical.MainActivity68;
import com.example.medical.MainActivity69;
import com.example.medical.MainActivity70;
import com.example.medical.MainActivity71;
import com.example.medical.MainActivity72;
import com.example.medical.R;
import com.example.medical.adapter.eadapter;
import com.example.medical.adapter.hdadapter;
import com.example.medical.classes.recycler;
import com.example.medical.model.elderly;
import com.example.medical.model.hd;

import java.util.ArrayList;


public class hdfragment extends Fragment {

    RecyclerView rec;
    ArrayList <hd> her;
    public hdfragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate ( R.layout.fragment_hdfragment, container, false );
        rec=view.findViewById ( R.id.rec);

        her=new ArrayList <> (  );
        her.add ( new hd ( R.drawable.df,"Dr  Morpen Gulco One Bg 03. MRP 500" ) );
        her.add ( new hd ( R.drawable.ds,"Accu-check Active Gulcometer test.. MRP 858" ) );
        her.add ( new hd ( R.drawable.dt,"Accu-check Instant Gulcometer Test.. MRP 890" ) );
        her.add ( new hd ( R.drawable.dfo,"Dr Morpen Bg 03  Gulcometer Test MRP 325" ) );
        her.add ( new hd ( R.drawable.hdf,"Pharmeasy All-in-One Vaporizer MRP 570" ) );
        her.add ( new hd ( R.drawable.hds,"BPL Accudigit Dt-02 Digital Ther..MRP 220" ) );
        her.add ( new hd ( R.drawable.hdt,"One Touch Verio Glucometer Test.. MRP 1040" ) );
        her.add ( new hd ( R.drawable.hdfo,"Beato Curv-Blood Glucose 50Test MRP 700" ) );
        her.add ( new hd ( R.drawable.dte,"One Touch Ultra Glucometer Test.. MRP 1300" ) );



        hdadapter hdadapter=new hdadapter ( her,getContext () );
        LinearLayoutManager layoutManager=new LinearLayoutManager ( getContext (),LinearLayoutManager.VERTICAL,false);
        rec.setLayoutManager ( layoutManager );
        rec.setNestedScrollingEnabled ( false );
        rec.setAdapter ( hdadapter );
        rec.addOnItemTouchListener ( new recycler ( getContext ( ), rec, new recycler.OnItemClickListener ( ) {
            @Override
            public void onItemClick(View view, int position) {
            switch (position){
                case 0:
                case 3:
                    Intent intent=new Intent ( getActivity (), MainActivity65.class );
                    startActivity ( intent );
                    break;
                case 1:
                    Intent intent1=new Intent ( getActivity (), MainActivity66.class );
                    startActivity ( intent1 );
                    break;
                case 2:
                    Intent intent2=new Intent ( getActivity (), MainActivity67.class );
                    startActivity ( intent2 );
                    break;
                case 4:
                    Intent intent4=new Intent ( getActivity (), MainActivity68.class );
                    startActivity ( intent4 );
                    break;
                case 5:
                    Intent intent5=new Intent ( getActivity (), MainActivity69.class );
                    startActivity ( intent5);
                    break;
                case 6:
                    Intent intent6=new Intent ( getActivity (), MainActivity70.class );
                    startActivity ( intent6 );
                    break;
                case 7:
                    Intent intent7=new Intent ( getActivity (), MainActivity71.class );
                    startActivity ( intent7 );
                    break;
                case 8:
                    Intent intent8=new Intent ( getActivity (), MainActivity72.class );
                    startActivity ( intent8 );
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