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

public class MainActivity14 extends FragmentActivity implements OnMapReadyCallback {
    GoogleMap map;
    private Object OnMapReadyCallback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main14 );
        SupportMapFragment mapFragment=(SupportMapFragment) getSupportFragmentManager ()
                .findFragmentById ( R.id.map );
        mapFragment.getMapAsync ( this );

    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        map=googleMap;

        Intent intent = new Intent (android.content.Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com/maps/place/DIAMOND+MEDICAL+%26+GENERAL+STORE/@21.7689205,72.1428345,17z/data=!3m1!4b1!4m5!3m4!1s0x395f5a7e51a9a161:0xb3691f54314806a8!8m2!3d21.768907!4d72.1450289"));
        startActivity(intent);

//        LatLng DIAMONDMedicalGeneralStores=new LatLng (21.769194469831742, 72.144985681972);
//        map.addMarker ( new MarkerOptions ().position (DIAMONDMedicalGeneralStores).title ( "DIAMOND Medical & General Stores" ) );
//        map.moveCamera ( CameraUpdateFactory.newLatLng (DIAMONDMedicalGeneralStores ) );


    }
}