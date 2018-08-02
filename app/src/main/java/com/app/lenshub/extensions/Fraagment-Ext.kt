package com.app.lenshub.extensions

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import com.app.lenshub.R


// Created by sachin singh on 2/8/18.


fun FragmentManager.replaceFragment(container: Int,fragment: Fragment){
    val manager = this
    val ft = manager?.beginTransaction()
    ft?.replace(container, fragment)
    ft?.setCustomAnimations(R.animator.slide_up,
            R.animator.slide_down,
            R.animator.slide_up,
            R.animator.slide_down)
    ft?.addToBackStack(null)
    ft?.commit()
}