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

public class MainActivity8 extends FragmentActivity implements OnMapReadyCallback {
    GoogleMap map;
    private Object OnMapReadyCallback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main8 );
        SupportMapFragment mapFragment=(SupportMapFragment) getSupportFragmentManager ()
                .findFragmentById ( R.id.map );
        mapFragment.getMapAsync ( this );
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        map=googleMap;

        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com/maps/place/Apple+Pharmacy/@21.7553041,72.1453942,17z/data=!3m1!4b1!4m5!3m4!1s0x395f5a71354607fb:0xec28dec2331425b2!8m2!3d21.7552991!4d72.1475883"));
        startActivity(intent);
//        LatLng ApplePharmacy=new LatLng (21.755588060965884, 72.14757756848002);
//        map.addMarker ( new MarkerOptions ().position ( ApplePharmacy).title ( "Apple Pharmacy" ) );
//        map.moveCamera ( CameraUpdateFactory.newLatLng ( ApplePharmacy ) );
    }
}