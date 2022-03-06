package com.example.medical;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity5 extends FragmentActivity implements OnMapReadyCallback {
    GoogleMap map;
    private Object OnMapReadyCallback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main5 );
        SupportMapFragment mapFragment=(SupportMapFragment) getSupportFragmentManager ()
                .findFragmentById ( R.id.map );
        mapFragment.getMapAsync ( this );
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        map=googleMap;

            Intent intent = new Intent (android.content.Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com/maps/place/Aarogya+Setu+Medical+Store/@21.7399614,70.4448539,17z/data=!3m1!4b1!4m5!3m4!1s0x39581f59e9e601e5:0x29d1f7ec8735e48!8m2!3d21.7399445!4d70.4470509"));
        startActivity(intent);
//        LatLng Aarogyamedicalstore =new LatLng (21.767087109366376, 72.14384390591943);
//        map.addMarker ( new MarkerOptions ().position ( Aarogyamedicalstore).title ( "Aarogya setu medical store" ) );
//        map.moveCamera ( CameraUpdateFactory.newLatLng ( Aarogyamedicalstore ) );Aarogyamedicalstore

    }
}