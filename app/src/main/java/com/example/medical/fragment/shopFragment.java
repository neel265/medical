package com.example.medical.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.medical.MainActivity10;
import com.example.medical.MainActivity12;
import com.example.medical.MainActivity13;
import com.example.medical.MainActivity14;
import com.example.medical.MainActivity16;
import com.example.medical.MainActivity5;
import com.example.medical.MainActivity6;
import com.example.medical.MainActivity7;
import com.example.medical.MainActivity8;
import com.example.medical.MainActivity9;
import com.example.medical.R;
import com.example.medical.adapter.shopadapter;
import com.example.medical.classes.recycler;
import com.example.medical.model.shop;

import java.util.ArrayList;


public class shopFragment extends Fragment {
    RecyclerView shoprecyclerview;
    ArrayList<shop> set;



    public shopFragment() {
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
        View view= inflater.inflate ( R.layout.fragment_shop, container, false );
        shoprecyclerview=view.findViewById ( R.id.shoprecyclerview );
        set=new ArrayList <> (  );
        set.add ( new shop ( R.drawable.blank,"Arogy setu Medical Store" ) );
        set.add ( new shop ( R.drawable.blank,"Rupani Medical Store" ) );
        set.add ( new shop ( R.drawable.blank,"Mahadev Medical and General Store" ) );
        set.add ( new shop ( R.drawable.blank,"Apple Pharmacy" ) );
        set.add ( new shop ( R.drawable.blank,"RadheshyamMedicalStore"));
        set.add ( new shop ( R.drawable.blank,"Sameer Medical Store"));
        set.add ( new shop ( R.drawable.blank,"NILESH MEDICAL STORE"));
        set.add ( new shop ( R.drawable.blank,"Navajeevan Medical & GeneralStores"));
        set.add ( new shop ( R.drawable.blank,"DIAMOND  Medical & GeneralStores"));
        set.add ( new shop ( R.drawable.blank,"Swastik Medical Store"));
        shopadapter shopadapter=new shopadapter ( set,getContext () );
        LinearLayoutManager layoutManager=new LinearLayoutManager ( getContext (),LinearLayoutManager.VERTICAL,false );
        shoprecyclerview.setLayoutManager ( layoutManager );
        shoprecyclerview.setNestedScrollingEnabled ( false );
        shoprecyclerview.setAdapter ( shopadapter );


        shoprecyclerview.addOnItemTouchListener ( new recycler ( getContext ( ), shoprecyclerview, new recycler.OnItemClickListener ( ) {
            @Override
            public void onItemClick(View view, int position) {
                switch (position){
                    case 0:
                        Intent intent=new Intent ( getActivity (), MainActivity5.class );
                        startActivity ( intent );
                        break;
                    case 1:
                        Intent intent1=new Intent (getActivity (), MainActivity6.class);
                        startActivity ( intent1 );
                        break;
                    case 2:
                        Intent intent2=new Intent ( getActivity (), MainActivity7.class );
                        startActivity ( intent2 );
                        break;
                    case 3:
                        Intent intent3=new Intent ( getActivity (), MainActivity8.class );
                        startActivity ( intent3 );
                        break;
                    case 4:
                        Intent intent4=new Intent ( getActivity (), MainActivity9.class );
                        startActivity ( intent4 );
                        break;
                    case 5:
                        Intent intent5=new Intent ( getActivity (), MainActivity10.class );
                        startActivity ( intent5 );
                        break;
                    case 6:
                        Intent intent6=new Intent ( getActivity (), MainActivity12.class );
                        startActivity ( intent6 );
                        break;
                    case 7:
                        Intent intent7=new Intent ( getActivity (), MainActivity13.class );
                        startActivity ( intent7 );
                        break;
                    case 8:
                        Intent intent8=new Intent ( getActivity (), MainActivity14.class );
                        startActivity ( intent8 );
                        break;
                    case 9:
                        Intent intent9=new Intent ( getActivity (), MainActivity16.class );
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