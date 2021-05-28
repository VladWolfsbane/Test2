package com.example.application;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    ArrayList<Model> mList;
    Context context;

    public Adapter(Context context, ArrayList<Model> mList){
        this.mList = mList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.data_view, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MyViewHolder holder, int position) {
        Model model = mList.get(position);
        holder.number.setText(model.getNumber());
        holder.timestamp.setText(model.getTimestamp());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView number, timestamp;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            number = itemView.findViewById(R.id.numberText);
            timestamp = itemView.findViewById(R.id.timeStampText);

        }
    }
}
