package com.app.lenshub.callback

import com.android.volley.VolleyError
import org.json.JSONObject


// Created by sachin singh on 21/9/18.

interface ResponseCallBack{
    fun onResponse(jsonObject: JSONObject);
    fun onError(volleyError: VolleyError);
}