package com.example.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    ArrayList<Brands> brandsArrayList;

    public MyAdapter(Context context, ArrayList<Brands> newsArrayList) {
        this.context = context;
        this.brandsArrayList = newsArrayList;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {

        Brands brands= brandsArrayList.get(position);
        holder.header.setText(brands.heading);
        holder.titleImage.setImageResource(brands.image);



    }

    @Override
    public int getItemCount() {
        return brandsArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView header;
        ShapeableImageView titleImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            header=itemView.findViewById(R.id.header);
            titleImage=itemView.findViewById(R.id.title_image);
        }
    }
}
