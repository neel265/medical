package com.example.medical.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.medical.MainActivity44;
import com.example.medical.MainActivity45;
import com.example.medical.MainActivity46;
import com.example.medical.MainActivity47;
import com.example.medical.MainActivity48;
import com.example.medical.MainActivity49;
import com.example.medical.MainActivity50;
import com.example.medical.MainActivity51;
import com.example.medical.MainActivity52;
import com.example.medical.MainActivity53;
import com.example.medical.R;
import com.example.medical.adapter.ayadapter;
import com.example.medical.classes.recycler;
import com.example.medical.model.ay;
import com.example.medical.model.person;

import java.util.ArrayList;


public class ayfragment extends Fragment {

    RecyclerView rec;
    ArrayList <ay> aer;

    public ayfragment() {

    }

   


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view= inflater.inflate ( R.layout.fragment_ayfragment, container, false );


        rec=view.findViewById ( R.id.rec);

        aer=new ArrayList <> (  );
        aer.add ( new ay ( R.drawable.raf,"Smw'S Iron Tonic Heamzo Fill Natural Multi Vitamins  MRP 165" )  );
        aer.add ( new ay ( R.drawable.as,"Calcimax Forte Plus Strip of 30 Tablets MRP 208" )  );
        aer.add ( new ay ( R.drawable.at,"Himalya Sepilin Tablets -60's MRP 123" )  );
        aer.add ( new ay ( R.drawable.afo,"Himalya Liv.52Ds Tablets MRP 119" )  );
        aer.add ( new ay ( R.drawable.afi,"Himalya Liv.52 Tablets=100's MRP 95" )  );
        aer.add ( new ay ( R.drawable.asi,"Himalya  Gasx Tablets-100's MRP 105" )  );
        aer.add ( new ay ( R.drawable.rase," Everhub Karela Jamun Juice MRP 195" )  );
        aer.add ( new ay ( R.drawable.ae,"Volin Pain Relif  Spray Bottle MRP 55" )  );
        aer.add ( new ay ( R.drawable.an,"Himalya Septlin Syrup -200ml MRP 100" )  );
        aer.add ( new ay ( R.drawable.ate,"Volin Pain Rlif Gel-30gm MRP 90" )  );
        ayadapter ayadapter=new ayadapter ( aer,getContext () );
        LinearLayoutManager layoutManager=new LinearLayoutManager ( getContext (),LinearLayoutManager.VERTICAL,false );
        rec.setLayoutManager ( layoutManager );
        rec.setNestedScrollingEnabled ( false );
        rec.setAdapter ( ayadapter );

        rec.addOnItemTouchListener ( new recycler ( getContext ( ), rec, new recycler.OnItemClickListener ( ) {
            @Override
            public void onItemClick(View view, int position) {
                switch (position){
                    case 0:
                        Intent intent=new Intent ( getActivity (), MainActivity44.class );
                        startActivity ( intent );
                        break;
                    case 1:
                        Intent intent1=new Intent ( getActivity (), MainActivity45.class );
                        startActivity ( intent1 );
                        break;
                    case 2:
                        Intent intent2=new Intent ( getActivity (), MainActivity46.class );
                        startActivity ( intent2 );
                        break;
                    case 3:
                        Intent intent3=new Intent ( getActivity (), MainActivity47.class );
                        startActivity ( intent3 );
                        break;
                    case 4:
                        Intent intent4=new Intent ( getActivity (), MainActivity48.class );
                        startActivity ( intent4 );
                        break;
                    case 5:
                        Intent intent5=new Intent ( getActivity (), MainActivity49.class );
                        startActivity ( intent5 );
                        break;
                    case 6:
                        Intent intent6=new Intent ( getActivity (), MainActivity50.class );
                        startActivity ( intent6 );
                        break;
                    case 7:
                        Intent intent7=new Intent ( getActivity (), MainActivity51.class );
                        startActivity ( intent7);
                        break;
                    case 8:
                        Intent intent8=new Intent ( getActivity (), MainActivity52.class );
                        startActivity ( intent8 );
                        break;
                    case 9:
                        Intent intent9=new Intent ( getActivity (), MainActivity53.class );
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