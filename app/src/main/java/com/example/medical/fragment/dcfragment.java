package com.example.medical.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.medical.MainActivity54;
import com.example.medical.MainActivity55;
import com.example.medical.MainActivity56;
import com.example.medical.MainActivity57;
import com.example.medical.MainActivity58;
import com.example.medical.MainActivity59;
import com.example.medical.MainActivity60;
import com.example.medical.MainActivity61;
import com.example.medical.MainActivity62;
import com.example.medical.MainActivity63;
import com.example.medical.R;
import com.example.medical.adapter.dcadapter;
import com.example.medical.classes.recycler;
import com.example.medical.model.dc;
import com.example.medical.model.skin;

import java.util.ArrayList;


public class dcfragment extends Fragment {
    RecyclerView rec;
    ArrayList <dc> der;


    public dcfragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate ( R.layout.fragment_dcfragment, container, false );
        rec=view.findViewById ( R.id.rec);

        der=new ArrayList <> (  );
        der.add ( new dc ( R.drawable.df,"Dr  Morpen Gulco One Bg 03. MRP 500" ) );
        der.add ( new dc ( R.drawable.ds,"Accu-check Active Gulcometer test.. MRP 858" ) );
        der.add ( new dc ( R.drawable.dt,"Accu-check Instant Gulcometer Test.. MRP 890" ) );
        der.add ( new dc ( R.drawable.dfo,"Dr Morpen Bg 03  Gulcometer Test MRP 325 " ) );
        der.add ( new dc ( R.drawable.dfi,"One Touch Select Glucometer Test.. MRP 1000" ) );
        der.add ( new dc ( R.drawable.dsi,"Sugar Free Gold Sweetener Powder MRP 135" ) );
        der.add ( new dc ( R.drawable.dse,"Sugar Free Naturea Sweetener For Fit MRP 130" ) );
        der.add ( new dc ( R.drawable.de,"Suger Free Gld Sweetener Powde.. MRP 135" ) );
        der.add ( new dc ( R.drawable.dn,"Sugar Free Gold Sweetener Tablet.. MRP 175" ) );
        der.add ( new dc ( R.drawable.dte,"One Touch Ultra Glucometer Test.. MRP 1300" ) );

        dcadapter dcadapter=new dcadapter ( der,getContext () );
        LinearLayoutManager layoutManager=new LinearLayoutManager ( getContext (),LinearLayoutManager.VERTICAL,false );
        rec.setLayoutManager ( layoutManager );
        rec.setNestedScrollingEnabled ( false );
        rec.setAdapter ( dcadapter );
        rec.addOnItemTouchListener ( new recycler ( getContext ( ), rec, new recycler.OnItemClickListener ( ) {
            @Override
            public void onItemClick(View view, int position) {
                switch (position){
                    case 0:
                    Intent intent=new Intent ( getActivity (), MainActivity54.class );
                    startActivity ( intent );
                    break;
                    case 1:
                        Intent intent1=new Intent ( getActivity (), MainActivity55.class );
                        startActivity ( intent1 );
                        break;
                    case 2:
                        Intent intent2=new Intent ( getActivity (), MainActivity56.class );
                        startActivity ( intent2 );
                        break;
                    case 3:
                        Intent intent3=new Intent ( getActivity (), MainActivity57.class );
                        startActivity ( intent3);
                        break;
                    case 4:
                        Intent intent4=new Intent ( getActivity (), MainActivity58.class );
                        startActivity ( intent4 );
                        break;
                    case 5:
                        Intent intent5=new Intent ( getActivity (), MainActivity59.class );
                        startActivity ( intent5 );
                        break;
                    case 6:
                        Intent intent6=new Intent ( getActivity (), MainActivity60.class );
                        startActivity ( intent6);
                        break;
                    case 7:
                        Intent intent7=new Intent ( getActivity (), MainActivity61.class );
                        startActivity ( intent7 );
                        break;
                    case 8:
                        Intent intent8=new Intent ( getActivity (), MainActivity62.class );
                        startActivity ( intent8);
                        break;
                    case 9:
                        Intent intent9=new Intent ( getActivity (), MainActivity63.class );
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