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

public class MainActivity16 extends FragmentActivity implements OnMapReadyCallback {
    GoogleMap map;
    private Object OnMapReadyCallback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main16 );
        SupportMapFragment mapFragment=(SupportMapFragment) getSupportFragmentManager ()
                .findFragmentById ( R.id.map );
        mapFragment.getMapAsync ( this );
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        map=googleMap;
        Intent intent = new Intent (android.content.Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com/maps/place/Swastik+Medical+Store/@21.7554198,72.1604192,17z/data=!4m9!1m2!2m1!1sSwastik+Medical+Store!3m5!1s0x395f5a6a2c4bdb6f:0x4f0cb5957ac20ba7!8m2!3d21.7554157!4d72.1626295!15sChVTd2FzdGlrIE1lZGljYWwgU3RvcmWSAQhwaGFybWFjeQ"));
        startActivity(intent);

//        LatLng SwastikMedicalStore=new LatLng (21.75547957361162, 72.16265081266076);
//        map.addMarker ( new MarkerOptions ().position (SwastikMedicalStore).title ( "Swastik Medical Store" ) );
//        map.moveCamera ( CameraUpdateFactory.newLatLng (SwastikMedicalStore ) );

    }
}