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
import com.example.medical.model.dc;

import java.util.ArrayList;

public class dcadapter extends RecyclerView.Adapter<dcadapter.viewholder>
{
    ArrayList<dc> der;
    Context context;

    public dcadapter(ArrayList <dc> der, Context context) {
        this.der = der;
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
        dc dp=der.get ( position );
        holder.iad.setImageResource ( dp.getIad () );
        holder.tad.setText ( dp.getTad () );

    }

    @Override
    public int getItemCount() {
        return der.size ();
    }

    public  class viewholder extends RecyclerView.ViewHolder{

        ImageView iad;
        TextView tad;
        public viewholder(@NonNull View itemView) {
            super ( itemView );
            iad=itemView.findViewById ( R.id.hah );
            tad =itemView.findViewById ( R.id.tas );
        }
    }
}
