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
                apps.add(Item("Sony A7","Sony","A7" ,"Camera","2017","Bangalore", R.drawable.cam_sony_a,"2000/day"))
                apps.add(Item("Arri Alexa","Alexa","A7" ,"Camera","2017", "Bangalore", R.drawable.cam_arri_alexa,"2000/day"))
                apps.add(Item("Canon 700D","Canon","A7" ,"Camera","2017", "Bangalore", R.drawable.cam_canon700d,"2000/day"))
                apps.add(Item("Red Scarlet","Scarlet", "A7" ,"Camera","2017","Bangalore", R.drawable.cam_red_scarlet,"2000/day"))
                apps.add(Item("Camera","Brand","Model" ,"Camera","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Camera","Brand","Model" ,"Camera","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Camera","Brand","Model" ,"Camera","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Camera","Brand","Model" ,"Camera","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Camera","Brand","Model" ,"Camera","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Camera","Brand","Model" ,"Camera","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Camera","Brand","Model" ,"Camera","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Camera","Brand","Model" ,"Camera","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Camera","Brand","Model" ,"Camera","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Camera","Brand","Model" ,"Camera","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Camera","Brand","Model" ,"Camera","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Camera","Brand","Model" ,"Camera","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Camera","Brand","Model" ,"Camera","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Camera","Brand","Model" ,"Camera","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Camera","Brand","Model" ,"Camera","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Camera","Brand","Model" ,"Camera","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))


            }
            Constants.CATEGORY_TYPE_LENS ->{
                apps.add(Item("Prime Ens","Canon","Ens" ,"Lens","2017", "Bangalore", R.drawable.len_canon_prime_ens,"2000/day"))
                apps.add(Item("Prime Ens","Canon","Ens" ,"Lens","2017", "Bangalore", R.drawable.len_canon_prime_ens,"2000/day"))
                apps.add(Item("Zoom Lens","Canon","Ens" ,"Lens","2017", "Bangalore", R.drawable.len_canon_zoom_lens,"2000/day"))
                apps.add(Item("Zoom Lens","Canon","Ens" ,"Lens","2017", "Bangalore", R.drawable.len_canon_zoom_lens,"2000/day"))
                apps.add(Item("Lens","Brand","Model" ,"Lens","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Lens","Brand","Model" ,"Lens","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Lens","Brand","Model" ,"Lens","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Lens","Brand","Model" ,"Lens","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Lens","Brand","Model" ,"Lens","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Lens","Brand","Model" ,"Lens","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Lens","Brand","Model" ,"Lens","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Lens","Brand","Model" ,"Lens","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Lens","Brand","Model" ,"Lens","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Lens","Brand","Model" ,"Lens","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Lens","Brand","Model" ,"Lens","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Lens","Brand","Model" ,"Lens","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Lens","Brand","Model" ,"Lens","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Lens","Brand","Model" ,"Lens","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Lens","Brand","Model" ,"Lens","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Lens","Brand","Model" ,"Lens","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))

            }
            Constants.CATEGORY_TYPE_LIGHTS ->{
                apps.add(Item("Lights","Brand","Model" ,"Lights","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Lights","Brand","Model" ,"Lights","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Lights","Brand","Model" ,"Lights","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Lights","Brand","Model" ,"Lights","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Lights","Brand","Model" ,"Lights","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Lights","Brand","Model" ,"Lights","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Lights","Brand","Model" ,"Lights","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Lights","Brand","Model" ,"Lights","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Lights","Brand","Model" ,"Lights","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Lights","Brand","Model" ,"Lights","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Lights","Brand","Model" ,"Lights","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Lights","Brand","Model" ,"Lights","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Lights","Brand","Model" ,"Lights","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Lights","Brand","Model" ,"Lights","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Lights","Brand","Model" ,"Lights","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Lights","Brand","Model" ,"Lights","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Lights","Brand","Model" ,"Lights","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Lights","Brand","Model" ,"Lights","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Lights","Brand","Model" ,"Lights","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Lights","Brand","Model" ,"Lights","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))

            }
            Constants.CATEGORY_TYPE_EQUIPMENTS ->{
                apps.add(Item("Drone","Brand","Model","Equpments","2016", "Bangalore", R.drawable.eq_drone,"2000/day"))
                apps.add(Item("Gimbal","Brand","Model","Equpments","2016", "Bangalore", R.drawable.eq_gimbal,"2000/day"))
                apps.add(Item("Track and dolly","Brand","Model","Equpments","2016", "Bangalore", R.drawable.eq_track_and_dolly,"2000/day"))
                apps.add(Item("Tripod","Brand","Model","Equpments","2016", "Bangalore", R.drawable.eq_tripod,"2000/day"))
                apps.add(Item("Equipments","Brand", "Model","Equpments","Year","Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Equipments","Brand", "Model","Equpments","Year","Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Equipments","Brand", "Model","Equpments","Year","Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Equipments","Brand", "Model","Equpments","Year","Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Equipments","Brand", "Model","Equpments","Year","Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Equipments","Brand", "Model","Equpments","Year","Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Equipments","Brand", "Model","Equpments","Year","Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Equipments","Brand", "Model","Equpments","Year","Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Equipments","Brand", "Model","Equpments","Year","Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Equipments","Brand", "Model","Equpments","Year","Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Equipments","Brand", "Model","Equpments","Year","Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Equipments","Brand", "Model","Equpments","Year","Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Equipments","Brand", "Model","Equpments","Year","Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Equipments","Brand", "Model","Equpments","Year","Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Equipments","Brand", "Model","Equpments","Year","Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Equipments","Brand", "Model","Equpments","Year","Bangalore", R.drawable.ic_launcher_web,"2000/day"))
            }
            Constants.CATEGORY_TYPE_FLASHES ->{
                apps.add(Item("Flashes","Brand","Model" ,"Flashes","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Flashes","Brand","Model" ,"Flashes","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Flashes","Brand","Model" ,"Flashes","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Flashes","Brand","Model" ,"Flashes","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Flashes","Brand","Model" ,"Flashes","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Flashes","Brand","Model" ,"Flashes","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Flashes","Brand","Model" ,"Flashes","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Flashes","Brand","Model" ,"Flashes","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Flashes","Brand","Model" ,"Flashes","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Flashes","Brand","Model" ,"Flashes","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Flashes","Brand","Model" ,"Flashes","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Flashes","Brand","Model" ,"Flashes","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Flashes","Brand","Model" ,"Flashes","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Flashes","Brand","Model" ,"Flashes","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Flashes","Brand","Model" ,"Flashes","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Flashes","Brand","Model" ,"Flashes","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Flashes","Brand","Model" ,"Flashes","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Flashes","Brand","Model" ,"Flashes","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))

            }
            Constants.CATEGORY_TYPE_AUDIO_SOUND ->{
                apps.add(Item("Sound","Brand", "Model","Sound","Year","Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Sound","Brand", "Model","Sound","Year","Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Sound","Brand", "Model","Sound","Year","Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Sound","Brand", "Model","Sound","Year","Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Sound","Brand", "Model","Sound","Year","Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Sound","Brand", "Model","Sound","Year","Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Sound","Brand", "Model","Sound","Year","Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Sound","Brand", "Model","Sound","Year","Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Sound","Brand", "Model","Sound","Year","Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Sound","Brand", "Model","Sound","Year","Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Sound","Brand", "Model","Sound","Year","Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Sound","Brand", "Model","Sound","Year","Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Sound","Brand", "Model","Sound","Year","Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Sound","Brand", "Model","Sound","Year","Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Sound","Brand", "Model","Sound","Year","Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Sound","Brand", "Model","Sound","Year","Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Sound","Brand", "Model","Sound","Year","Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Sound","Brand", "Model","Sound","Year","Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Sound","Brand", "Model","Sound","Year","Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Sound","Brand", "Model","Sound","Year","Bangalore", R.drawable.ic_launcher_web,"2000/day"))

            }
            Constants.CATEGORY_TYPE_MONITORS ->{
                apps.add(Item("Monitor","Brand","Model","Monitors","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Monitor","Brand","Model","Monitors","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Monitor","Brand","Model","Monitors","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Monitor","Brand","Model","Monitors","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Monitor","Brand","Model","Monitors","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Monitor","Brand","Model","Monitors","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Monitor","Brand","Model","Monitors","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Monitor","Brand","Model","Monitors","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Monitor","Brand","Model","Monitors","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Monitor","Brand","Model","Monitors","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Monitor","Brand","Model","Monitors","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Monitor","Brand","Model","Monitors","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Monitor","Brand","Model","Monitors","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Monitor","Brand","Model","Monitors","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Monitor","Brand","Model","Monitors","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Monitor","Brand","Model","Monitors","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Monitor","Brand","Model","Monitors","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Monitor","Brand","Model","Monitors","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Monitor","Brand","Model","Monitors","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
            }

            Constants.CATEGORY_TYPE_CASES_BAGS ->{
                apps.add(Item("Bags","Brand","Model","Cases and Bags","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Bags","Brand","Model","Cases and Bags","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Bags","Brand","Model","Cases and Bags","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Bags","Brand","Model","Cases and Bags","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Bags","Brand","Model","Cases and Bags","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Bags","Brand","Model","Cases and Bags","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Bags","Brand","Model","Cases and Bags","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Bags","Brand","Model","Cases and Bags","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Bags","Brand","Model","Cases and Bags","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Bags","Brand","Model","Cases and Bags","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Bags","Brand","Model","Cases and Bags","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Bags","Brand","Model","Cases and Bags","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Bags","Brand","Model","Cases and Bags","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Bags","Brand","Model","Cases and Bags","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Bags","Brand","Model","Cases and Bags","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Bags","Brand","Model","Cases and Bags","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Bags","Brand","Model","Cases and Bags","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Bags","Brand","Model","Cases and Bags","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Bags","Brand","Model","Cases and Bags","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Bags","Brand","Model","Cases and Bags","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Bags","Brand","Model","Cases and Bags","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Bags","Brand","Model","Cases and Bags","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Bags","Brand","Model","Cases and Bags","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Bags","Brand","Model","Cases and Bags","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
            }
            Constants.CATEGORY_TYPE_FILTER ->{
                apps.add(Item("Filter","Brand","Model","Filter","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Filter","Brand","Model","Filter","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Filter","Brand","Model","Filter","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Filter","Brand","Model","Filter","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Filter","Brand","Model","Filter","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Filter","Brand","Model","Filter","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Filter","Brand","Model","Filter","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Filter","Brand","Model","Filter","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Filter","Brand","Model","Filter","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Filter","Brand","Model","Filter","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Filter","Brand","Model","Filter","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Filter","Brand","Model","Filter","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Filter","Brand","Model","Filter","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Filter","Brand","Model","Filter","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Filter","Brand","Model","Filter","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Filter","Brand","Model","Filter","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Filter","Brand","Model","Filter","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Filter","Brand","Model","Filter","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Filter","Brand","Model","Filter","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Filter","Brand","Model","Filter","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Filter","Brand","Model","Filter","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Filter","Brand","Model","Filter","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Filter","Brand","Model","Filter","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
                apps.add(Item("Filter","Brand","Model","Filter","Year", "Bangalore", R.drawable.ic_launcher_web,"2000/day"))
            }

        }
        return apps
    }

}