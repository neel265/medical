package com.example.medical.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.medical.MainActivity34;
import com.example.medical.MainActivity35;
import com.example.medical.MainActivity36;
import com.example.medical.MainActivity37;
import com.example.medical.MainActivity38;
import com.example.medical.MainActivity39;
import com.example.medical.MainActivity40;
import com.example.medical.MainActivity41;
import com.example.medical.MainActivity42;
import com.example.medical.MainActivity43;
import com.example.medical.R;
import com.example.medical.adapter.skinadapter;
import com.example.medical.classes.recycler;
import com.example.medical.model.person;
import com.example.medical.model.skin;

import java.util.ArrayList;


public class skinFragment extends Fragment {
    RecyclerView rec;
    ArrayList <skin> ser;



    public skinFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate ( R.layout.fragment_skin, container, false );
        rec=view.findViewById ( R.id.rec);

        ser=new ArrayList <> (  );
        ser.add ( new skin ( R.drawable.fskf,"Soulflower Heble Vitamin MRP 1000" ) );
        ser.add ( new skin ( R.drawable.rsks,"Venusla Max Intensive Mosture MRP 393" ) );
        ser.add ( new skin ( R.drawable.rsks,"Venusla Max Intensive Mositure MRP 427" ) );
        ser.add ( new skin ( R.drawable.skf,"Dettol Original germ Protection MRP 240" ) );
        ser.add ( new skin ( R.drawable.skfi,"Dettol Instance Cool Bathing shop MRP 212" ) );
        ser.add ( new skin ( R.drawable.sksi,"Himalya Neeam &Tumaric Soap MRP 46 " ) );
        ser.add ( new skin ( R.drawable.skse,"Episoft Ac spf 30 Cream 75gm MRP 471" ) );
        ser.add ( new skin ( R.drawable.ske,"Seband Clear Face Foam-150ml MRP 551" ) );
        ser.add ( new skin ( R.drawable.skn,"Tetmedosol Medicat Soap MRP 54" ) );
        ser.add ( new skin ( R.drawable.skte,"ACwash Deep Cleanse Face MRP 100" ) );

        skinadapter skinadapter=new skinadapter ( ser,getContext () );
        LinearLayoutManager layoutManager=new LinearLayoutManager ( getContext (),LinearLayoutManager.VERTICAL,false );
        rec.setLayoutManager ( layoutManager );
        rec.setNestedScrollingEnabled ( false );
        rec.setAdapter ( skinadapter );

        rec.addOnItemTouchListener ( new recycler ( getContext ( ), rec, new recycler.OnItemClickListener ( ) {
            @Override
            public void onItemClick(View view, int position) {
                switch (position){
                    case 0:
                        Intent intent=new Intent ( getActivity (), MainActivity34.class );
                        startActivity ( intent );
                        break;
                    case 1:
                        Intent intent1=new Intent ( getActivity (), MainActivity35.class );
                        startActivity ( intent1 );
                        break;
                    case 2:
                        Intent intent2=new Intent ( getActivity (), MainActivity36.class );
                        startActivity ( intent2 );
                        break;
                    case 3:
                        Intent intent3=new Intent ( getActivity (), MainActivity37.class );
                        startActivity ( intent3 );
                        break;
                    case 4:
                        Intent intent4=new Intent ( getActivity (), MainActivity38.class );
                        startActivity ( intent4);
                        break;
                    case 5:
                        Intent intent5=new Intent ( getActivity (), MainActivity39.class );
                        startActivity ( intent5 );
                        break;
                    case 6:
                        Intent intent6=new Intent ( getActivity (), MainActivity40.class );
                        startActivity ( intent6 );
                        break;
                    case 7:
                        Intent intent7=new Intent ( getActivity (), MainActivity41.class );
                        startActivity ( intent7 );
                        break;
                    case 8:
                        Intent intent8=new Intent ( getActivity (), MainActivity42.class );
                        startActivity ( intent8 );
                        break;
                    case 9:
                        Intent intent9=new Intent ( getActivity (), MainActivity43.class );
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