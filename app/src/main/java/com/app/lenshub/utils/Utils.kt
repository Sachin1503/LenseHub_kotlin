package com.app.lenshub.utils

import android.content.Context
import android.support.v4.app.Fragment
import android.util.Log
import com.app.lenshub.R

// Created by app singh on 20/7/18.

object Utils{
    fun calculateNoOfColumns(context: Context): Int {
        val displayMetrics = context.resources?.displayMetrics
        val dpWidth = displayMetrics!!.widthPixels / displayMetrics.density
        return (dpWidth / 180).toInt()
    }
}

