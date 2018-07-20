package com.sachin.lenshub;

// Created by sachin singh on 19/7/18.

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sachin.lenshub.adapter.HomeListAdapter;
import com.sachin.lenshub.callback.LHOnClickListener;
import com.sachin.lenshub.model.Data;

import java.util.ArrayList;

public class HomeFragment extends Fragment{

    private LHOnClickListener mLHOnClickListener;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof LHOnClickListener){
            mLHOnClickListener = (LHOnClickListener) context;
        }else{
            throw new RuntimeException(context.toString()+" must implement LHOnClickListener");
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container,false);
        if (view instanceof RecyclerView){
            RecyclerView recyclerView = (RecyclerView) view;
            recyclerView.setHasFixedSize(true);
            final LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
            recyclerView.setLayoutManager(mLayoutManager);
            recyclerView.setAdapter(new HomeListAdapter(getDummyData()));
        }
        return view;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mLHOnClickListener = null;
    }

    private ArrayList<Data> getDummyData(){
        ArrayList<Data> dataArrayList = new ArrayList<>();
        for (int j = 0; j<= 5; j++){
            Data data1 = new Data();
            data1.setTitle("Header");
            data1.setSection(true);
            dataArrayList.add(data1);

            for (int i = 0; i<= 10 ; i++){
                Data data = new Data();
                data.setTitle("Sub Item");
                data.setTitle("24 rs per h");
                data.setSection(false);
                dataArrayList.add(data);
            }
        }
        return dataArrayList;
    }
}
