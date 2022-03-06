package com.example.medical.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.medical.R;
import com.example.medical.model.ay;

import java.util.ArrayList;

public class ayadapter extends RecyclerView.Adapter<ayadapter.viewholder> {
    ArrayList <ay> aer;
    Context context;

    public ayadapter(ArrayList <ay> aer, Context context) {
        this.aer = aer;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from ( context ).inflate ( R.layout.ay_activity,parent,false);
        return new viewholder ( view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        ay ap=aer.get ( position );
        holder.ia.setImageResource ( ap.getIa () );
        holder.ta.setText ( ap.getTa () );

    }

    @Override
    public int getItemCount() {
        return aer.size ();
    }

    public class viewholder extends RecyclerView.ViewHolder {

        ImageView ia;
        TextView ta;

        public viewholder(@NonNull View itemView) {
            super ( itemView );
            ia = itemView.findViewById ( R.id.hah );
            ta = itemView.findViewById ( R.id.tas );
        }
    }
}
