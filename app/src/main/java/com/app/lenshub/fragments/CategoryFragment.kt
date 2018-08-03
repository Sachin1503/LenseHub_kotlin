package com.app.lenshub.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.lenshub.R
import com.app.lenshub.adapter.CategoriesAdapter
import com.app.lenshub.callback.LHOnClickListener
import android.util.DisplayMetrics
import com.app.lenshub.utils.LHItemDecorator
import com.app.lenshub.utils.ItemOffsetDecoration




// Created by sachin singh on 3/8/18.

class CategoryFragment : Fragment() ,LHOnClickListener{

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view:View = inflater.inflate(R.layout.fragment_category,container,false)

        init(view)
        return view;
    }

    private fun init(view: View){
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewCategories)
        recyclerView.layoutManager = GridLayoutManager(context,calculateNoOfColumns())
        val itemDecoration = ItemOffsetDecoration(context!!, R.dimen.item_offset)
        recyclerView.addItemDecoration(itemDecoration)
        recyclerView.adapter = CategoriesAdapter(resources.getStringArray(R.array.category_array),this)
    }

    override fun onClick(o: Any) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun calculateNoOfColumns(): Int {
        val displayMetrics = context?.getResources()?.getDisplayMetrics()
        val dpWidth = displayMetrics!!.widthPixels / displayMetrics.density
        return (dpWidth / 180).toInt()
    }
    private fun convertDPToPixels(dp: Int): Float {
        val metrics = DisplayMetrics()
        activity?.getWindowManager()?.defaultDisplay?.getMetrics(metrics)
        val logicalDensity = metrics.density
        return dp * logicalDensity
    }


}