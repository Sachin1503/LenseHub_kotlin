package com.app.lenshub.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.app.lenshub.HomeActivity
import com.app.lenshub.model.Item
import com.app.lenshub.R
import com.app.lenshub.adapter.ItemAdapterList
import com.app.lenshub.callback.LHOnClickListener
import android.support.v7.widget.DividerItemDecoration


// Created by sachin singh on 1/8/18.

class MoreItemListFragment:Fragment(),LHOnClickListener{

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_more_item_list,container,false)
        init(view)
        return view;
    }

    private fun init(view: View){

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewMoreItem)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.addItemDecoration(DividerItemDecoration(context,
                DividerItemDecoration.VERTICAL))
        recyclerView.adapter = ItemAdapterList(getItems(),this)
    }

    private fun getItems(): ArrayList<Item> {

        var items = ArrayList<Item>()

        if (activity is HomeActivity){
            val homeActivity = activity as HomeActivity
            items = homeActivity.getCategory().itemList
            return items
        }

        return items
    }

    override fun onClick(o: Any) {
        Toast.makeText(activity,getString(R.string.not_implemented), Toast.LENGTH_SHORT).show()
    }

}