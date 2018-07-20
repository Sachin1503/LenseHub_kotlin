package com.sachin.lenshub.adapter;

// Created by sachin singh on 20/7/18.

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sachin.lenshub.R;
import com.sachin.lenshub.model.Data;
import com.sachin.lenshub.utils.Constants;

import java.util.ArrayList;

public class HomeListAdapter extends RecyclerView.Adapter {

    private ArrayList<Data> mDataArrayList;

    public HomeListAdapter(ArrayList<Data> dataArrayList){
        mDataArrayList = dataArrayList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        if (viewType == Constants.VIEW_TYPE_SECTION){
            return new SectionViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_adapter_section,parent,false));
        }else {
            return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_adapter_normal, parent, false));
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
       if (getItemViewType(position) == Constants.VIEW_TYPE_SECTION){
           SectionViewHolder sectionViewHolder = (SectionViewHolder) holder;
           sectionViewHolder.textViewTitle.setText(mDataArrayList.get(position).getTitle());
       }else {
           ViewHolder viewHolder = (ViewHolder) holder;
           viewHolder.textViewTitle.setText(mDataArrayList.get(position).getTitle());
           viewHolder.textViewPrice.setText(mDataArrayList.get(position).getPrice());
       }
    }

    @Override
    public int getItemCount() {
        return mDataArrayList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return mDataArrayList.get(position).getSection() ? Constants.VIEW_TYPE_SECTION : Constants.VIEW_TYPE_NORMAL;
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        private TextView textViewTitle;
        private TextView textViewPrice;

        public ViewHolder(View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);
        }
    }

    class SectionViewHolder extends RecyclerView.ViewHolder{

        private TextView textViewTitle;

        public SectionViewHolder(View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
        }
    }
}
