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
import com.example.medical.model.recipe;

import java.util.ArrayList;

public class adapterhome extends RecyclerView.Adapter<adapterhome.viewholder> {
    ArrayList<recipe> list;
    Context context;

    public adapterhome(ArrayList<recipe> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from ( context ).inflate ( R.layout.sample_activity,parent,false);
        return new viewholder ( view );

    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        recipe model=list.get ( position );
        holder.image.setImageResource ( model.getPic () );
        holder.te.setText ( model.getText () );

    }

    @Override
    public int getItemCount() {
        return list.size ();
    }

    public class viewholder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView te;
        public viewholder(@NonNull View itemView) {
            super ( itemView );
            image=itemView.findViewById ( R.id.image);
            te =itemView.findViewById ( R.id.te);
        }
    }
}
