package com.app.lenshub

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
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
        search.setSearchListener(MySearchListener())
        search.toggleSearch()

        for (x in 0..9) {
            val option = SearchResult("Result " + Integer.toString(x), resources.getDrawable(R.drawable.ic_history))
            search.addSearchable(option)
        }

    }

    private fun handleBackPress(){
        finish()
    }


    class MySearchListener : SearchBox.SearchListener {
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
        }

    }
}