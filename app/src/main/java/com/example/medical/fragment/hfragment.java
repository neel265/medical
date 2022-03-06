package com.example.medical.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.medical.MainActivity24;
import com.example.medical.MainActivity25;
import com.example.medical.MainActivity26;
import com.example.medical.MainActivity27;
import com.example.medical.MainActivity28;
import com.example.medical.MainActivity29;
import com.example.medical.MainActivity30;
import com.example.medical.MainActivity31;
import com.example.medical.MainActivity32;
import com.example.medical.MainActivity33;
import com.example.medical.R;
import com.example.medical.adapter.hadapater;
import com.example.medical.classes.recycler;
import com.example.medical.model.home;
import com.example.medical.model.person;

import java.util.ArrayList;


public class hfragment extends Fragment {


    RecyclerView rec;
    ArrayList <home> her;
    public hfragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate ( R.layout.fragment_hfragment, container, false );
        rec=view.findViewById ( R.id.rec);

        her=new ArrayList <> (  );
        her.add ( new home ( R.drawable.fh,"Savlon Antiseptic Disinfectant MRP 247" ) );
        her.add ( new home ( R.drawable.seh,"Tri-activ Disinfectant MRP 128" ) );
        her.add ( new home ( R.drawable.th,"Dabur Odomos Naturals Cream MRP 49" ) );
        her.add ( new home ( R.drawable.foh,"Luxor Nno Glass Pro Glass MRP 66" ) );
        her.add ( new home ( R.drawable.fih,"Pril Lime+Vinger  Dish  Wash bar MRP 47" ) );
        her.add ( new home ( R.drawable.rsih,"DR Morepen Quit &Quit Mosquito MRP 40" ) );
        her.add ( new home ( R.drawable.rseh,"Harpic Power Plus Orignnal Toliet MRP 36") );
        her.add ( new home ( R.drawable.eh,"Exo Dishwash Bar 120G MRP 10" ) );
        her.add ( new home ( R.drawable.nh,"dettol Distinfectant Sanitizer wet MRP 175" ) );
        her.add ( new home ( R.drawable.rteh,"Pee Safe -Tollet MRP 120" ) );


        hadapater hadapater=new hadapater ( her,getContext () );
        LinearLayoutManager layoutManager=new LinearLayoutManager ( getContext (),LinearLayoutManager.VERTICAL,false );
        rec.setLayoutManager ( layoutManager );
        rec.setNestedScrollingEnabled ( false );
        rec.setAdapter ( hadapater );

        rec.addOnItemTouchListener ( new recycler ( getContext ( ), rec, new recycler.OnItemClickListener ( ) {
            @Override
            public void onItemClick(View view, int position) {
                switch (position){
                    case 0:
                        Intent intent=new Intent ( getActivity (), MainActivity24.class );
                        startActivity ( intent );
                        break;
                    case 1:
                        Intent intent1=new Intent ( getActivity (), MainActivity25.class );
                        startActivity ( intent1 );
                        break;
                    case 2:
                        Intent intent2=new Intent ( getActivity (), MainActivity26.class );
                        startActivity ( intent2 );
                        break;
                    case 3:
                        Intent intent3=new Intent ( getActivity (), MainActivity27.class );
                        startActivity ( intent3 );
                        break;
                    case 4:
                        Intent intent4=new Intent ( getActivity (), MainActivity28.class );
                        startActivity ( intent4 );
                        break;
                    case 5:
                        Intent intent5=new Intent ( getActivity (), MainActivity29.class );
                        startActivity ( intent5 );
                        break;
                    case 6:
                        Intent intent6=new Intent ( getActivity (), MainActivity30.class );
                        startActivity ( intent6 );
                        break;
                    case 7:
                        Intent intent7=new Intent ( getActivity (), MainActivity31.class );
                        startActivity ( intent7 );
                        break;
                    case 8:
                        Intent intent8=new Intent ( getActivity (), MainActivity32.class );
                        startActivity ( intent8 );
                        break;
                    case 9:
                        Intent intent9=new Intent ( getActivity (), MainActivity33.class );
                        startActivity ( intent9 );
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