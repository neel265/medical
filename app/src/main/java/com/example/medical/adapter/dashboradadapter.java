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
import com.example.medical.model.dashborad;
import com.example.medical.model.recipe;

import java.util.ArrayList;

public class dashboradadapter extends RecyclerView.Adapter<dashboradadapter.viewholder> {
    ArrayList<dashborad> dash;
    Context context;

    public dashboradadapter(ArrayList <dashborad> dash, Context context) {
        this.dash = dash;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from ( context ).inflate ( R.layout.dashborad_activity,parent,false);
        return new viewholder ( view );
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
          dashborad mo=dash.get ( position );
        holder.profile.setImageResource ( mo.getProfile () );
        holder.tex.setText ( mo.getTex () );

    }

    @Override
    public int getItemCount() {
        return dash.size ();
    }

    public class viewholder extends RecyclerView.ViewHolder{

        ImageView profile;
        TextView tex;
        public viewholder(@NonNull View itemView) {
            super ( itemView );
            profile=itemView.findViewById ( R.id.profile);
            tex =itemView.findViewById ( R.id.tex);
        }
    }
}
