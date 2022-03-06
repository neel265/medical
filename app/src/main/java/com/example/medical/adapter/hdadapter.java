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
import com.example.medical.model.hd;

import java.util.ArrayList;

public class hdadapter extends RecyclerView.Adapter<hdadapter.viewholder>
{
    ArrayList <hd> her;
    Context context;

    public hdadapter(ArrayList <hd> her, Context context) {
        this.her = her;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from ( context ).inflate ( R.layout.person_activity,parent,false);
        return new viewholder ( view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        hd hp=her.get ( position );
        holder.iah.setImageResource ( hp.getIah () );
        holder.tah.setText ( hp.getTah () );
    }

    @Override
    public int getItemCount() {
        return her.size ();
    }

    public  class viewholder extends RecyclerView.ViewHolder{

        ImageView iah;
        TextView tah;
        public viewholder(@NonNull View itemView) {
            super ( itemView );
            iah=itemView.findViewById ( R.id.hah );
            tah =itemView.findViewById ( R.id.tas );
        }
    }
}
