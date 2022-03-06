package com.example.medical.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.medical.R;
import com.example.medical.adminhomeactivity;
import com.example.medical.adminsignupactivity;
import com.example.medical.homeActivity;
import com.example.medical.mainactivity;
import com.example.medical.signupactivity;
;


public class accountFragment extends Fragment {
    Button us,admin;


    public accountFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate ( R.layout.fragment_account, container, false );
        us=view.findViewById ( R.id.us);
        admin=view.findViewById ( R.id.admin);
        us.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
               Intent intent=new Intent ( getActivity (), signupactivity.class );
               startActivity ( intent );
            }
        } );


        admin.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent ( getActivity (), adminsignupactivity.class );
                startActivity ( intent );
            }
        } );



        return view;
    }
}




