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

public class MainActivity10 extends FragmentActivity implements OnMapReadyCallback {
    GoogleMap map;
    private Object OnMapReadyCallback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main10 );
        SupportMapFragment mapFragment=(SupportMapFragment) getSupportFragmentManager ()
                .findFragmentById ( R.id.map );
        mapFragment.getMapAsync ( this );
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        map=googleMap;

        Intent intent = new Intent (android.content.Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com/maps/place/Sameer+Medical+Store/@21.743624,71.0233224,8z/data=!4m9!1m2!2m1!1sSameer+Medical+Store!3m5!1s0x395f5a8275bdde3d:0xaf7bb2ca96e3fc98!8m2!3d21.778309!4d72.1417126!15sChRTYW1lZXIgTWVkaWNhbCBTdG9yZZIBCHBoYXJtYWN5"));
        startActivity(intent);
//        LatLng SameerMedicalStore=new LatLng (21.778546536233893, 72.14167961080825);
//        map.addMarker ( new MarkerOptions ().position ( SameerMedicalStore).title ( "Sameer Medical Store" ) );
//        map.moveCamera ( CameraUpdateFactory.newLatLng (SameerMedicalStore  ) );

    }
}