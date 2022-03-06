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
import com.example.medical.model.home;

import java.util.ArrayList;

public class hadapater extends RecyclerView.Adapter <hadapater.viewholder>
{
    ArrayList <home> her;
    Context context;

    public hadapater(ArrayList <home> her, Context context) {
        this.her = her;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from ( context ).inflate ( R.layout.h_activity,parent,false);
        return new viewholder (view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        home mh=her.get ( position );
        holder.imh.setImageResource ( mh.getImh () );
        holder.tmh.setText ( mh.getTmh ());
    }

    @Override
    public int getItemCount() {
        return her.size ();
    }

    public  class viewholder extends RecyclerView.ViewHolder{

        ImageView imh;
        TextView tmh;
        public viewholder(@NonNull View itemView) {
            super ( itemView );
            imh=itemView.findViewById ( R.id.hah );
            tmh =itemView.findViewById ( R.id.tas );
        }
    }
}
