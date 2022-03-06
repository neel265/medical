package com.example.medical;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyviewHolder extends RecyclerView.ViewHolder {

    ImageView imageViewdemo;
    TextView tvdemo , des;
    View v;




    public MyviewHolder(@NonNull View itemView) {
        super(itemView);
        imageViewdemo = itemView.findViewById(R.id.imageViewdemo);
        tvdemo = itemView.findViewById(R.id.tvdemo);
        des=itemView.findViewById(R.id.descview);
        v=itemView;

    }
}
