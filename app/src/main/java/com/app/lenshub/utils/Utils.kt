package com.app.lenshub.utils

import android.app.Activity
import android.content.Context
import android.support.v4.app.Fragment
import android.util.Log
import com.app.lenshub.R
import android.content.Context.INPUT_METHOD_SERVICE
import android.view.View
import android.view.inputmethod.InputMethodManager


// Created by app singh on 20/7/18.

object Utils{
    fun calculateNoOfColumns(context: Context): Int {
        val displayMetrics = context.resources?.displayMetrics
        val dpWidth = displayMetrics!!.widthPixels / displayMetrics.density
        return (dpWidth / 180).toInt()
    }

    fun hideKeyboard(activity: Activity) {
        val imm = activity.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        //Find the currently focused view, so we can grab the correct window token from it.
        var view = activity.getCurrentFocus()
        //If no view currently has focus, create a new one, just so we can grab a window token from it
        if (view == null) {
            view = View(activity)
        }
        imm.hideSoftInputFromWindow(view!!.getWindowToken(), 0)
    }
}

