package com.example.medical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.medical.adapter.slideradapter;
import com.example.medical.adapter.subadapter;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class MainActivity2 extends AppCompatActivity {
    SliderView sliderView;
    int[] images = {R.drawable.scd,
            R.drawable.xcd,
           };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main2 );
        getSupportActionBar ().hide ();
        sliderView=findViewById ( R.id.image_slider );

        subadapter subadapter=new subadapter ( images );
        sliderView.setSliderAdapter ( subadapter);
        sliderView.setIndicatorAnimation ( IndicatorAnimationType.WORM );
        sliderView.setSliderTransformAnimation ( SliderAnimations.DEPTHTRANSFORMATION );
        sliderView.startAutoCycle ();

    }
}