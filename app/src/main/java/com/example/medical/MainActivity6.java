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

public class MainActivity6 extends FragmentActivity implements OnMapReadyCallback {
    GoogleMap map;
    private Object OnMapReadyCallback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main6 );
        SupportMapFragment mapFragment=(SupportMapFragment) getSupportFragmentManager ()
                .findFragmentById ( R.id.map );
        mapFragment.getMapAsync ( this );

    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        map=googleMap;

        Intent intent = new Intent (android.content.Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com/maps/place/Rupani+Medical+Store/@21.7586755,72.1503824,17z/data=!3m1!4b1!4m5!3m4!1s0x395f5a703b1ad799:0xe9e388e861a34338!8m2!3d21.7586705!4d72.1525765"));
        startActivity(intent);
//        LatLng RupaniMedicalStore =new LatLng (21.758829916614854, 72.15245848011877);
//        map.addMarker ( new MarkerOptions ().position ( RupaniMedicalStore).title ( "Rupani Medical Store" ) );
//        map.moveCamera ( CameraUpdateFactory.newLatLng ( RupaniMedicalStore ) );

    }
}