package com.app.lenshub.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.app.lenshub.Item
import com.app.lenshub.R
import com.app.lenshub.callback.LHOnClickListener
import com.app.lenshub.callback.LHOnMoreClickListener


//Created by app singh on 25/7/18.
//Commit test

class CategoriesAdapter(private val list:Array<String>,private val lhOnClickListener: LHOnClickListener) :RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view:View = LayoutInflater.from(parent.context).inflate(R.layout.list_category_adapter,parent,false)
        return CategoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val itemViewHolder:CategoryViewHolder = holder as CategoryViewHolder
        bind(itemViewHolder,position)
    }

    fun bind(itemViewHolder: CategoryViewHolder,position: Int){
        val item = list.get(position);
        itemViewHolder.textViewName.text = item
        itemViewHolder.itemView.setOnClickListener{lhOnClickListener.onClick(position)}
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class CategoryViewHolder(view:View):RecyclerView.ViewHolder(view){
        val textViewName:TextView = view.findViewById(R.id.textViewCategory)

    }

}