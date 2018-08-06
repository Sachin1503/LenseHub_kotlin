package com.app.lenshub.adapter

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.LinearSnapHelper
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.SnapHelper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.app.lenshub.R
import com.app.lenshub.Category
import com.app.lenshub.callback.LHOnClickListener
import com.app.lenshub.callback.LHOnMoreClickListener


// Created by app singh on 23/7/18.

class CategorySnapAdapter(val context: Context, private val snapList:ArrayList<Category>, private val lhOnMoreClickListener: LHOnMoreClickListener, private val lhOnClickListener: LHOnClickListener) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_snap_adapter,parent,false)
        return MYViewHolder(view);
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val myHolder:MYViewHolder = holder as MYViewHolder
        bind(myHolder,position)
    }

    fun bind(myViewHolder: MYViewHolder,position: Int){
        val snapItem = snapList.get(position);
        myViewHolder.textViewTitle.text = snapItem.title
        myViewHolder.recyclerView.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        myViewHolder.recyclerView.adapter = ItemAdapterGrid(snapItem.itemList,lhOnClickListener);
        myViewHolder.recyclerView.onFlingListener =  null
        val snapHelper:SnapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(myViewHolder.recyclerView)
        myViewHolder.textViewMore.setOnClickListener{lhOnMoreClickListener.onMoreClick(position)}
    }

    override fun getItemCount(): Int {
      return snapList.size
    }

    class MYViewHolder(view :View) : RecyclerView.ViewHolder(view) {
        val textViewTitle :TextView = view.findViewById(R.id.textViewSnapTitle)
        val textViewMore :TextView = view.findViewById(R.id.textViewMore)
        val recyclerView :RecyclerView = view.findViewById(R.id.recyclerViewSnap)


    }

}