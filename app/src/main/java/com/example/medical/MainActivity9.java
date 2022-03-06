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

public class MainActivity9 extends FragmentActivity implements OnMapReadyCallback {
    GoogleMap map;
    private Object OnMapReadyCallback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main9 );
        SupportMapFragment mapFragment=(SupportMapFragment) getSupportFragmentManager ()
                .findFragmentById ( R.id.map );
        mapFragment.getMapAsync ( this );
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        map=googleMap;

        Intent intent = new Intent (android.content.Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com/maps/place/Radheshyam+Medical+Store/@21.7447907,72.1127091,13z/data=!4m9!1m2!2m1!1sRadheshyamMedicalStore!3m5!1s0x395f5a830dd4e1a9:0xbe78357f2b8b754e!8m2!3d21.7766534!4d72.1457532!15sChZSYWRoZXNoeWFtTWVkaWNhbFN0b3JlkgEIcGhhcm1hY3k"));
        startActivity(intent);

//        LatLng RadheshyamMedicalStore=new LatLng (21.77737074822586, 72.14566736937152);
//        map.addMarker ( new MarkerOptions ().position ( RadheshyamMedicalStore).title ( "Radheshyam Medical Store" ) );
//        map.moveCamera ( CameraUpdateFactory.newLatLng (RadheshyamMedicalStore  ) );
    }
}