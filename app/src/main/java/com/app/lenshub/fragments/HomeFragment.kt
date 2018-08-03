package com.app.lenshub.fragments

// Created by app singh on 19/7/18.

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.lenshub.Item
import com.app.lenshub.R
import com.app.lenshub.SnapItem
import com.app.lenshub.adapter.SpanAdapter
import com.app.lenshub.callback.LHOnClickListener

import com.app.lenshub.callback.LHOnMoreClickListener
import com.app.lenshub.extensions.replaceFragment

class HomeFragment : Fragment(),LHOnMoreClickListener,LHOnClickListener {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        if (view is RecyclerView) {
            view.setHasFixedSize(true)
            val mLayoutManager = LinearLayoutManager(activity)
            view.layoutManager = mLayoutManager
            view.adapter = SpanAdapter(requireContext(),getDummySnapData(),this,this)
        }
        return view
    }

    override fun onClick(o: Any) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onMoreClick(o: Any) {
        activity?.supportFragmentManager?.replaceFragment(R.id.container, MoreItemListFragment())
    }

    private fun getDummySnapData():ArrayList<SnapItem>{
        val apps = getItems();
        var snapList:ArrayList<SnapItem> = ArrayList()
        snapList.add(SnapItem("Category 1", apps as ArrayList<Item>))
        snapList.add(SnapItem("Category 2", apps as ArrayList<Item>))
        snapList.add(SnapItem("Category 3", apps as ArrayList<Item>))
        snapList.add(SnapItem("Category 4", apps as ArrayList<Item>))
        snapList.add(SnapItem("Category 5", apps as ArrayList<Item>))
        snapList.add(SnapItem("Category 6", apps as ArrayList<Item>))
        snapList.add(SnapItem("Category 7", apps as ArrayList<Item>))
        return snapList
    }

    private fun getItems(): List<Item> {
        val apps = ArrayList<Item>()
        apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
        apps.add(Item("Gmail", R.drawable.ic_gmail_48dp, "4.8"))
        apps.add(Item("Inbox", R.drawable.ic_inbox_48dp, "4.5"))
        apps.add(Item("Google Keep", R.drawable.ic_keep_48dp, "4.2"))
        apps.add(Item("Google Drive", R.drawable.ic_drive_48dp, "4.6"))
        apps.add(Item("Hangouts", R.drawable.ic_hangouts_48dp, "39"))
        apps.add(Item("Google Photos", R.drawable.ic_photos_48dp, "4.6"))
        apps.add(Item("Messenger", R.drawable.ic_messenger_48dp, "4.2"))
        apps.add(Item("Sheets", R.drawable.ic_sheets_48dp, "4.2"))
        apps.add(Item("Slides", R.drawable.ic_slides_48dp, "4.2"))
        apps.add(Item("Docs", R.drawable.ic_docs_48dp, "4.2"))
        return apps
    }
}
