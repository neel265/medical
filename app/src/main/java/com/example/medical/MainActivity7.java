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

public class MainActivity7 extends FragmentActivity implements OnMapReadyCallback {
    GoogleMap map;
    private Object OnMapReadyCallback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main7 );
        SupportMapFragment mapFragment=(SupportMapFragment) getSupportFragmentManager ()
                .findFragmentById ( R.id.map );
        mapFragment.getMapAsync ( this );
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        map=googleMap;
        Intent intent = new Intent (android.content.Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com/maps/place/Mahadev+Medical+and+General+store/@21.7447907,72.1127091,13z/data=!4m9!1m2!2m1!1sMahadev+Medical+and+General+Store!3m5!1s0x395f5b2ee8836bb7:0x9a8752f62c7b6a72!8m2!3d21.7447907!4d72.147728!15sCiFNYWhhZGV2IE1lZGljYWwgYW5kIEdlbmVyYWwgU3RvcmVaIyIhbWFoYWRldiBtZWRpY2FsIGFuZCBnZW5lcmFsIHN0b3JlkgEJZHJ1Z3N0b3Jl"));
        startActivity(intent);

//        LatLng MahadevMedicalandGeneralStore =new LatLng (21.7836743023532, 72.1516732751724);
//        map.addMarker ( new MarkerOptions ().position ( MahadevMedicalandGeneralStore).title ( "Mahadev Medical and General Store" ) );
//        map.moveCamera ( CameraUpdateFactory.newLatLng ( MahadevMedicalandGeneralStore ) );

    }
}