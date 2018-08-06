package com.app.lenshub.fragments

// Created by app singh on 19/7/18.

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.lenshub.R
import com.app.lenshub.adapter.CategorySnapAdapter
import com.app.lenshub.callback.LHOnClickListener

import com.app.lenshub.callback.LHOnMoreClickListener

import com.app.lenshub.extensions.replaceFragmentWithBackStack
import com.app.lenshub.utils.MasterData


class HomeFragment : Fragment(),LHOnMoreClickListener,LHOnClickListener {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        if (view is RecyclerView) {
            view.setHasFixedSize(true)
            val mLayoutManager = LinearLayoutManager(activity)
            view.layoutManager = mLayoutManager
            view.adapter = CategorySnapAdapter(requireContext(),MasterData.getCategoryData(),this,this)
        }
        return view
    }

    override fun onClick(o: Any) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onMoreClick(o: Any) {
        activity?.supportFragmentManager?.replaceFragmentWithBackStack(R.id.container, MoreItemListFragment())
    }


}
