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
import com.example.medical.model.shop;
import com.example.medical.model.skin;

import java.util.ArrayList;

public class shopadapter extends RecyclerView.Adapter<shopadapter.viewholder>
{
    ArrayList<shop> set;
    Context context;

    public shopadapter(ArrayList <shop> set, Context context) {
        this.set = set;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from ( context ).inflate ( R.layout.samplshop_activity,parent,false);
        return new viewholder ( view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        shop sh=set.get ( position );
        holder.hah.setImageResource (sh.getHah () );
        holder.tas.setText ( sh.getTas ());
    }

    @Override
    public int getItemCount() {
        return set.size ();
    }

    public  class viewholder extends RecyclerView.ViewHolder{

        ImageView hah;
        TextView tas;
        public viewholder(@NonNull View itemView) {
            super ( itemView );
            hah=itemView.findViewById ( R.id.hah );
            tas =itemView.findViewById ( R.id.tas );
        }
    }
}
