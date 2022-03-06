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
import com.example.medical.model.elderly;

import java.util.ArrayList;

public class eadapter extends RecyclerView.Adapter<eadapter.viewholder>
{
    ArrayList<elderly> er;
    Context context;

    public eadapter(ArrayList <elderly> er, Context context) {
        this.er = er;
        this.context = context;
    }



    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from ( context ).inflate ( R.layout.dc_activity,parent,false);
        return new viewholder ( view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        elderly ep=er.get ( position );
        holder.iae.setImageResource ( ep.getIae () );
        holder.tae.setText ( ep.getTae () );
    }

    @Override
    public int getItemCount() {
        return er.size ();
    }

    public  class viewholder extends RecyclerView.ViewHolder{

        ImageView iae;
        TextView tae;
        public viewholder(@NonNull View itemView) {
            super ( itemView );
            iae=itemView.findViewById ( R.id.hah );
            tae =itemView.findViewById ( R.id.tas );
        }
    }
}
