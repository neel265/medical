package com.example.medical.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.medical.R;
import com.smarteist.autoimageslider.SliderViewAdapter;

public class slideradapter extends SliderViewAdapter<slideradapter.vieholder>
{

    int[] images;

    public slideradapter(int[] images){

        this.images = images;

    }


    @Override
    public vieholder onCreateViewHolder(ViewGroup parent) {
        View view= LayoutInflater.from ( parent.getContext () ).inflate ( R.layout.slider_activity,parent,false );
        return new vieholder ( view );
    }

    @Override
    public void onBindViewHolder(vieholder viewHolder, int position) {
        viewHolder.imageView.setImageResource(images[position]);
    }

    @Override
    public int getCount() {
        return images.length;
    }

    public class vieholder extends SliderViewAdapter.ViewHolder
    {
        ImageView imageView;
        public vieholder(View itemView)
        {
            super ( itemView );
            imageView=itemView.findViewById ( R.id.image_view );
        }
    }
}
