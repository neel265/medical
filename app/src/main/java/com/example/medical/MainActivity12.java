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

public class MainActivity12 extends FragmentActivity implements OnMapReadyCallback {
    GoogleMap map;
    private Object OnMapReadyCallback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main12 );
        SupportMapFragment mapFragment=(SupportMapFragment) getSupportFragmentManager ()
                .findFragmentById ( R.id.map );
        mapFragment.getMapAsync ( this );
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        map=googleMap;
        Intent intent = new Intent (android.content.Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com/maps/place/Nilesh+Medical+Stores/@21.2123894,72.7900826,17z/data=!3m1!4b1!4m5!3m4!1s0x3be04c3b4b53c1c3:0x71bd86b297bb4ddc!8m2!3d21.212379!4d72.7922349"));
        startActivity(intent);


//        LatLng NileshMedicalStore=new LatLng (21.769718405117263, 72.14516121080807);
//        map.addMarker ( new MarkerOptions ().position ( NileshMedicalStore).title ( "Nilesh Medical Store" ) );
//        map.moveCamera ( CameraUpdateFactory.newLatLng (NileshMedicalStore  ) );


    }
}