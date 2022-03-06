package com.example.medical.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.medical.MainActivity11;
import com.example.medical.MainActivity15;
import com.example.medical.MainActivity17;
import com.example.medical.MainActivity18;
import com.example.medical.MainActivity19;
import com.example.medical.MainActivity2;
import com.example.medical.MainActivity20;
import com.example.medical.MainActivity21;
import com.example.medical.MainActivity22;
import com.example.medical.MainActivity23;
import com.example.medical.R;
import com.example.medical.adapter.personadapter;
import com.example.medical.adapter.slideradapter;
import com.example.medical.classes.recycler;
import com.example.medical.model.person;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;

public class personfragment extends Fragment {


    RecyclerView rec;
    ArrayList<person> per;
    public personfragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view= inflater.inflate ( R.layout.fragment_personfragment, container, false );
        rec=view.findViewById ( R.id.rec);

        per=new ArrayList <> (  );
        per.add ( new person ( R.drawable.cd,"Dr Morepen Active Smile Charcol MRP 90" ) );
        per.add ( new person ( R.drawable.cs,"Beardo Hair Fall Control Shampoo...MRP 301" ) );
        per.add ( new person ( R.drawable.cb,"Scalepe Plus Anti Dandruff Shampoo.. MRP 208" ) );
        per.add ( new person ( R.drawable.cx,"Himalaya Neeam & Turmeric soap MRP 37" ) );
        per.add ( new person ( R.drawable.cl,"Selsum Shampoo 120 ml MRP 265" ) );
        per.add ( new person ( R.drawable.ck,"Colgate Strong Teeth Dental MRP 19" ) );
        per.add ( new person ( R.drawable.ch,"Himalaya Purifying Neeam Fash Wash MRP 130" ) );
        per.add ( new person ( R.drawable.cj,"Indulekha Bringha Hair Oil Bottle MRP 208" ) );
        per.add ( new person ( R.drawable.cp,"Venusia MAX iNTENSIVE Moisture MRP 701" ) );
        per.add ( new person ( R.drawable.cz,"Parachute 100% puru coconunt oil" ) );

         personadapter personadapter=new personadapter (per , getContext ());
        LinearLayoutManager layoutManager=new LinearLayoutManager ( getContext (),LinearLayoutManager.VERTICAL,false );
      rec.setLayoutManager ( layoutManager );
      rec.setNestedScrollingEnabled ( false );
      rec.setAdapter ( personadapter );



rec.addOnItemTouchListener ( new recycler ( getContext ( ), rec, new recycler.OnItemClickListener ( ) {
    @Override
    public void onItemClick(View view, int position) {
        switch (position){
            case 0:
            Intent intent=new Intent ( getActivity (), MainActivity2.class );
            startActivity ( intent );
            break;
            case 1:
                Intent intent1=new Intent ( getActivity (), MainActivity11.class );
                startActivity ( intent1 );
                break;
            case 2:
                Intent intent2=new Intent ( getActivity (), MainActivity15.class );
                startActivity ( intent2 );
                break;
            case 3:
                Intent intent3=new Intent ( getActivity (), MainActivity17.class );
                startActivity ( intent3 );
                break;
            case 4:
                Intent intent4=new Intent ( getActivity (), MainActivity18.class );
                startActivity ( intent4 );
                break;
            case 5:
                Intent intent5=new Intent ( getActivity (), MainActivity19.class );
                startActivity ( intent5 );
                break;
            case 6:
                Intent intent6=new Intent ( getActivity (), MainActivity20.class );
                startActivity ( intent6 );
                break;
            case 7:
                Intent intent7=new Intent ( getActivity (), MainActivity21.class );
                startActivity ( intent7 );
                break;
            case 8:
                Intent intent8=new Intent ( getActivity (), MainActivity22.class );
                startActivity ( intent8 );
                break;
            case 9:
                Intent intent9=new Intent ( getActivity (), MainActivity23.class );
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