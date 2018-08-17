package com.app.lenshub.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.app.lenshub.model.Item
import com.app.lenshub.R
import com.app.lenshub.callback.LHOnClickListener
import com.bumptech.glide.Glide


// Created by app singh on 25/7/18.
//Commit test

class ItemAdapterGrid(private val list:ArrayList<Item>, private val lhOnClickListener: LHOnClickListener) :RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    var contex:Context? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view:View = LayoutInflater.from(parent.context).inflate(R.layout.list_item_adapter_grid,parent,false)
        contex = parent.context
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val itemViewHolder:ItemViewHolder = holder as ItemViewHolder
        bind(itemViewHolder,position)
    }

    fun bind(itemViewHolder: ItemViewHolder,position: Int){
        val item = list.get(position);
        itemViewHolder.textViewName.text = item.name
        itemViewHolder.textViewPrice.text = item.price
        Glide.with(contex!!).load(item.drawable).into( itemViewHolder.imageViewAppPhoto)
        itemViewHolder.itemView.setOnClickListener{lhOnClickListener.onClick(position)}
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ItemViewHolder(view:View):RecyclerView.ViewHolder(view){
        val textViewName:TextView = view.findViewById(R.id.textViewAppName)
        val textViewPrice:TextView = view.findViewById(R.id.textViewSize)
        val imageViewAppPhoto:ImageView = view.findViewById(R.id.imageView)

    }

}