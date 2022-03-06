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
import com.example.medical.model.person;

import java.util.ArrayList;

public class personadapter extends RecyclerView.Adapter<personadapter.viewholder>
{
    ArrayList<person> per;
    Context context;

    public personadapter(ArrayList <person> per, Context context) {
        this.per = per;
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
    person mp=per.get ( position );
    holder.imp.setImageResource ( mp.getIp () );
    holder.tmp.setText ( mp.getTp () );
    }

    @Override
    public int getItemCount() {
        return per.size ();
    }

    public  class viewholder extends RecyclerView.ViewHolder{

        ImageView imp;
        TextView tmp;
        public viewholder(@NonNull View itemView) {
            super ( itemView );
            imp=itemView.findViewById ( R.id.hah );
            tmp =itemView.findViewById ( R.id.tas );
        }
    }
}
