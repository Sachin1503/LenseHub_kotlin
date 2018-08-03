package com.app.lenshub.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.lenshub.Item
import com.app.lenshub.R
import com.app.lenshub.adapter.ItemAdapter
import com.app.lenshub.callback.LHOnClickListener
import com.app.lenshub.callback.LHOnMoreClickListener


// Created by sachin singh on 1/8/18.

class MoreItemListFragment:Fragment(),LHOnClickListener{

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_more_item_list,container,false)
        init(view)
        return view;
    }

    fun init(view: View){
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewMoreItem)
        recyclerView.layoutManager = GridLayoutManager(activity,3)
        recyclerView.adapter = ItemAdapter(getItems(),this)
    }

    private fun getItems(): ArrayList<Item> {
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
        apps.add(Item("Docs", R.drawable.ic_docs_48dp, "4.2"))
        apps.add(Item("Docs", R.drawable.ic_docs_48dp, "4.2"))
        apps.add(Item("Docs", R.drawable.ic_docs_48dp, "4.2"))
        apps.add(Item("Docs", R.drawable.ic_docs_48dp, "4.2"))
        apps.add(Item("Docs", R.drawable.ic_docs_48dp, "4.2"))
        return apps
    }

    override fun onClick(o: Any) {

        val fragment = MoreItemListFragment();
        val backStateName = fragment.javaClass.name

        val manager = fragmentManager
        val fragmentPopped:Boolean? = manager?.popBackStackImmediate(backStateName, 0)

        if (!fragmentPopped!!) { //fragment not in back stack, create it.
            val ft = manager.beginTransaction()
            ft.replace(R.id.container, fragment)
            ft.addToBackStack(backStateName)
            ft.commit()
        }
    }

}