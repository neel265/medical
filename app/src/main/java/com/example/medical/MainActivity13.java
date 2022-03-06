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

public class MainActivity13 extends FragmentActivity implements OnMapReadyCallback {
    GoogleMap map;
    private Object OnMapReadyCallback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main13 );
        SupportMapFragment mapFragment=(SupportMapFragment) getSupportFragmentManager ()
                .findFragmentById ( R.id.map );
        mapFragment.getMapAsync ( this );
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        map=googleMap;

        Intent intent = new Intent (android.content.Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com/maps/place/Navajeevan+Medical+%26+General+Stores/@21.759396,72.1432545,17z/data=!3m1!4b1!4m5!3m4!1s0x395f5a77648faabd:0xc8d20a5d9c22fe72!8m2!3d21.7593833!4d72.1454661"));
        startActivity(intent);

//        LatLng NavajeevanMedicalGeneralStores=new LatLng (21.759689917100093, 72.14575973356418);
//        map.addMarker ( new MarkerOptions ().position (NavajeevanMedicalGeneralStores).title ( "Navajeevan Medical & General Stores" ) );
//        map.moveCamera ( CameraUpdateFactory.newLatLng (NavajeevanMedicalGeneralStores ) );

    }
}