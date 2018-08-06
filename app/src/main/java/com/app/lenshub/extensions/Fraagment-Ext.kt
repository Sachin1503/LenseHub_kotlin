package com.app.lenshub.extensions

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import com.app.lenshub.R


// Created by sachin singh on 2/8/18.


fun FragmentManager.replaceFragmentWithBackStack(container: Int, fragment: Fragment){
    val manager = this
    val ft = manager.beginTransaction()
    ft?.replace(container, fragment)
    ft?.setCustomAnimations(android.R.anim.slide_in_left,android.R.anim.slide_out_right)
    ft?.addToBackStack(null)
    ft?.commit()
}

fun FragmentManager.replaceFragmentWithOutBackStack(container: Int, fragment: Fragment){
    val manager = this
    val ft = manager.beginTransaction()
    ft?.replace(container, fragment)
    ft?.setCustomAnimations(android.R.anim.slide_in_left,android.R.anim.slide_out_right)
    ft?.commit()
}