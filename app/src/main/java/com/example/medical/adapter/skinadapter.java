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
import com.example.medical.model.skin;

import java.util.ArrayList;

public class skinadapter extends RecyclerView.Adapter<skinadapter.viewholder>
{
    ArrayList<skin> ser;
    Context context;

    public skinadapter(ArrayList <skin> ser, Context context) {
        this.ser = ser;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from ( context ).inflate ( R.layout.skin_activity,parent,false);
        return new viewholder ( view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        skin sp=ser.get ( position );
        holder.ims.setImageResource ( sp.getIms () );
        holder.tms.setText ( sp.getTms () );
    }

    @Override
    public int getItemCount() {

        return ser.size ();
    }

    public  class viewholder extends RecyclerView.ViewHolder{

        ImageView ims;
        TextView tms;
        public viewholder(@NonNull View itemView) {
            super ( itemView );
            ims=itemView.findViewById ( R.id.hah );
            tms =itemView.findViewById ( R.id.tas );
        }
    }
}
