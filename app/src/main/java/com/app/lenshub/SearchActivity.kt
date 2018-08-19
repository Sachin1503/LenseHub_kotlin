package com.app.lenshub

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Toast
import com.app.lenshub.utils.MasterData
import com.quinny898.library.persistentsearch.SearchBox
import com.quinny898.library.persistentsearch.SearchResult


// Created by sachin singh on 9/8/18.

class SearchActivity :AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
        init()
    }

    private fun init(){
        val search = findViewById<SearchBox>(R.id.searchbox)
        search.setMenuListener { handleBackPress() }
        search.enableVoiceRecognition(this)
        search.setSearchListener(MySearchListener(this))
        search.toggleSearch()

        for (category in MasterData.getCategoryData()) {
            for (item in category.itemList){
                val option = SearchResult(item.name, resources.getDrawable(R.drawable.ic_history))
                search.addSearchable(option)
            }
        }

    }

    private fun handleBackPress(){
        finish()
    }


    class MySearchListener(val context: Context) : SearchBox.SearchListener {
        override fun onSearchOpened() {
        }

        override fun onSearchCleared() {
        }

        override fun onSearchClosed() {
        }

        override fun onSearchTermChanged(term: String?) {
        }

        override fun onSearch(result: String?) {
        }

        override fun onResultClick(result: SearchResult?) {
            Toast.makeText(context, context.getString(R.string.not_implemented), Toast.LENGTH_SHORT).show()
        }

    }
}