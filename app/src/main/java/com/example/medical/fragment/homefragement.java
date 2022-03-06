package com.example.medical.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.medical.R;
import com.example.medical.adapter.adapterhome;
import com.example.medical.adapter.dashboradadapter;
import com.example.medical.adapter.slideradapter;
import com.example.medical.classes.recycler;
import com.example.medical.model.dashborad;
import com.example.medical.model.recipe;
import com.example.medical.userhomeactivity;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;


public class homefragement extends Fragment{



    SliderView sliderView;
    int[] images = {R.drawable.one,
            R.drawable.two,
            R.drawable.three,
            R.drawable.four,
//            R.drawable.ghj,
            R.drawable.six};
    RecyclerView recyclerview,dashboradrv;
    Button he,bat;
    ArrayList <recipe> list;
    ArrayList<dashborad> dash;
    



    public homefragement() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate ( R.layout.fragment_home, container, false );

       sliderView=view.findViewById ( R.id.image_slider );

        slideradapter slideradapter=new slideradapter ( images );
        sliderView.setSliderAdapter ( slideradapter );
        sliderView.setIndicatorAnimation ( IndicatorAnimationType.WORM );
        sliderView.setSliderTransformAnimation ( SliderAnimations.DEPTHTRANSFORMATION );
        sliderView.startAutoCycle ();
        recyclerview = view.findViewById ( R.id.recyclerview );




        list = new ArrayList <> ( );
        list.add ( new recipe ( R.drawable.p, "paracetamol ratiopharm 500mg MRP 199.0" ) );
        list.add ( new recipe ( R.drawable.k, "Piroxicam 20mg  MRP 199.0" ) );
        list.add ( new recipe ( R.drawable.le, "Paracetamol Dolo-650 MRP 149" ) );
        list.add ( new recipe ( R.drawable.h, "Cough & Fever Relief" ) );
        list.add ( new recipe ( R.drawable.lk, "N-95 Mask MRP 20" ) );
        list.add ( new recipe ( R.drawable.v, "Sanitizer  100ml MRP 50" ) );


        adapterhome adapterhome = new adapterhome ( list, getContext ( ) );

        LinearLayoutManager layoutManager = new LinearLayoutManager ( getContext ( ), LinearLayoutManager.HORIZONTAL, false );
        recyclerview.setLayoutManager ( layoutManager );
        recyclerview.setNestedScrollingEnabled ( false );
        recyclerview.setAdapter ( adapterhome );




        dashboradrv=view.findViewById ( R.id.dashboradrv );
        dash=new ArrayList <> (  );
        dash.add ( new dashborad ( R.drawable.sp,"Person Care" ) );
        dash.add ( new dashborad ( R.drawable.sh,"Home Care" ) );
        dash.add ( new dashborad ( R.drawable.ss,"Skin Care" ) );

        dash.add ( new dashborad ( R.drawable.sa,"Ayurvedic Care" ) );
        dash.add ( new dashborad ( R.drawable.sb,"Diabetic Care." ) );
        dash.add ( new dashborad ( R.drawable.se,"Elderly Care" ) );
        dash.add ( new dashborad ( R.drawable.sd,"Health Devi.." ) );





        dashboradadapter dashboradadapter=new dashboradadapter (dash, getContext ());
        GridLayoutManager layoutManager1=new GridLayoutManager ( getContext (),2);
        dashboradrv.setLayoutManager ( layoutManager1 );
        dashboradrv.setNestedScrollingEnabled ( false );
        dashboradrv.setAdapter ( dashboradadapter );

        he=view.findViewById ( R.id.he );
        bat=view.findViewById ( R.id.bat );
        he.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Fragment healthfr=new healthfr ();
                FragmentTransaction fragmentTransaction=getActivity ().getSupportFragmentManager ().beginTransaction ();
                fragmentTransaction.replace ( R.id.contanier, healthfr ).commit ();
            }
        } );
       bat.setOnClickListener ( new View.OnClickListener ( ) {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent ( getActivity (), userhomeactivity.class );
              startActivity ( intent );
           }
       } );

        dashboradrv.addOnItemTouchListener ( new recycler ( getContext ( ), dashboradrv, new recycler.OnItemClickListener ( ) {
            @Override
            public void onItemClick(View view, int position) {
            switch (position){
                case 0:
                 Fragment personfragment=new personfragment ();
                 FragmentTransaction ft=getActivity ().getSupportFragmentManager ().beginTransaction ();
                 ft.replace ( R.id.contanier,personfragment ).commit ();

                break;
                case 1:
                    Fragment hfragement=new hfragment ();
                    FragmentTransaction fth=getActivity ().getSupportFragmentManager ().beginTransaction ();
                    fth.replace ( R.id.contanier,hfragement ).commit ();

                break;

                case 2:
                    Fragment skinFragment=new skinFragment ();
                    FragmentTransaction fts=getActivity ().getSupportFragmentManager ().beginTransaction ();
                    fts.replace ( R.id.contanier,skinFragment ).commit ();
                    break;

                case 3:
                    Fragment ayfragment=new ayfragment ();
                    FragmentTransaction fta=getActivity ().getSupportFragmentManager ().beginTransaction ();
                    fta.replace ( R.id.contanier,ayfragment ).commit ();
                    break;
                case 4:
                    Fragment dcfragment=new dcfragment ();
                    FragmentTransaction ftd=getActivity ().getSupportFragmentManager ().beginTransaction ();
                    ftd.replace ( R.id.contanier,dcfragment).commit ();
                    break;
                case 5:
                    Fragment efragement=new efragment ();
                    FragmentTransaction fte=getActivity ().getSupportFragmentManager ().beginTransaction ();
                    fte.replace ( R.id.contanier,efragement).commit ();
                    break;
                case 6:
                    Fragment hdfragment=new hdfragment ();
                    FragmentTransaction f=getActivity ().getSupportFragmentManager ().beginTransaction ();
                    f.replace ( R.id.contanier,hdfragment).commit ();
                    break;

            }
            }

            @Override
            public void onItemLongClick(View view, int position) {

            }
        }

        ) );
        return view;

    }
}