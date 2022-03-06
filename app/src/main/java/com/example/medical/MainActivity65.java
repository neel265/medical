package com.example.medical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.medical.adapter.subadapter;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class MainActivity65 extends AppCompatActivity {
    SliderView sliderView;
    int[] images = {R.drawable.jdf,
            R.drawable.kdf,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main65 );
        getSupportActionBar ().hide ();
        sliderView=findViewById ( R.id.image_slider );

        subadapter subadapter=new subadapter ( images );
        sliderView.setSliderAdapter ( subadapter);
        sliderView.setIndicatorAnimation ( IndicatorAnimationType.WORM );
        sliderView.setSliderTransformAnimation ( SliderAnimations.DEPTHTRANSFORMATION );
        sliderView.startAutoCycle ();
    }
}