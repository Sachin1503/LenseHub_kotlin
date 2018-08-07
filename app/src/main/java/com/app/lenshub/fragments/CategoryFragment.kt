package com.app.lenshub.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.lenshub.HomeActivity
import com.app.lenshub.R
import com.app.lenshub.adapter.CategoriesAdapter
import com.app.lenshub.callback.LHOnClickListener
import com.app.lenshub.extensions.replaceFragmentWithBackStack
import com.app.lenshub.model.Category
import com.app.lenshub.utils.ItemOffsetDecoration


import com.app.lenshub.utils.MasterData
import com.app.lenshub.utils.Utils


// Created by sachin singh on 3/8/18.

class CategoryFragment : Fragment() ,LHOnClickListener{

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view:View = inflater.inflate(R.layout.fragment_category,container,false)

        init(view)
        return view;
    }

    private fun init(view: View){
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewCategories)
        recyclerView.layoutManager = GridLayoutManager(context,Utils.calculateNoOfColumns(context!!)+1)
        val itemDecoration = ItemOffsetDecoration(context!!, R.dimen.item_offset)
        recyclerView.addItemDecoration(itemDecoration)
        recyclerView.adapter = CategoriesAdapter(MasterData.getCategoryData(),this)
    }

    override fun onClick(o: Any) {
        if (activity is HomeActivity){
            val homeActivity  = activity as HomeActivity
            homeActivity.setCategory(o as Category)
            activity?.supportFragmentManager?.replaceFragmentWithBackStack(R.id.container, MoreItemListFragment())
        }
    }
}