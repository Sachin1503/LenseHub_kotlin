package com.app.lenshub.utils

import android.content.Context
import com.app.lenshub.model.Item
import com.app.lenshub.R
import com.app.lenshub.model.Category


// Created by sachin singh on 6/8/18.

object MasterData{

    fun getCategoryData():ArrayList<Category>{

        val snapList:ArrayList<Category> = ArrayList()
        snapList.add(Category("Camera", getItems(Constants.CATEGORY_TYPE_CAMERA)))
        snapList.add(Category("Lens", getItems(Constants.CATEGORY_TYPE_LENS)))
        snapList.add(Category("Lights", getItems(Constants.CATEGORY_TYPE_LIGHTS)))
        snapList.add(Category("Equipments", getItems(Constants.CATEGORY_TYPE_EQUIPMENTS)))
        snapList.add(Category("Flashes", getItems(Constants.CATEGORY_TYPE_FLASHES)))
        snapList.add(Category("Audio Sound", getItems(Constants.CATEGORY_TYPE_AUDIO_SOUND)))
        snapList.add(Category("Monitors", getItems(Constants.CATEGORY_TYPE_MONITORS)))
        snapList.add(Category("Cases and Bags", getItems(Constants.CATEGORY_TYPE_CASES_BAGS)))
        snapList.add(Category("Filters", getItems(Constants.CATEGORY_TYPE_FILTER)))
        return snapList
    }

    private fun getItems(categoryType:Int): ArrayList<Item> {
        val apps = ArrayList<Item>()

        when (categoryType) {
            Constants.CATEGORY_TYPE_CAMERA -> {
                apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
                apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
                apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
                apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
                apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
                apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
            }
            Constants.CATEGORY_TYPE_LENS ->{
                apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
                apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
                apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
                apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
            }
            Constants.CATEGORY_TYPE_LIGHTS ->{
                apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
                apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
                apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
                apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
            }
            Constants.CATEGORY_TYPE_EQUIPMENTS ->{
                apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
                apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
                apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
                apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
            }
            Constants.CATEGORY_TYPE_FLASHES ->{
                apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
                apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
                apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
                apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
            }
            Constants.CATEGORY_TYPE_AUDIO_SOUND ->{
                apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
                apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
                apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
                apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
            }
            Constants.CATEGORY_TYPE_MONITORS ->{
                apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
                apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
                apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
                apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
            }

            Constants.CATEGORY_TYPE_CASES_BAGS ->{
                apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
                apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
                apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
                apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
            }
            Constants.CATEGORY_TYPE_FILTER ->{
                apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
                apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
                apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
                apps.add(Item("Google+", R.drawable.ic_google_48dp, "4.6"))
            }

        }
        return apps
    }

}