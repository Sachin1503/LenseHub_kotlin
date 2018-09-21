package com.app.lenshub.ws

import android.content.Context
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.app.lenshub.callback.ResponseCallBack
import org.json.JSONObject


// Created by sachin singh on 21/9/18.

class LHVolley(context: Context) {


    private var requestQueue:RequestQueue? = null

    init {
        requestQueue = Volley.newRequestQueue(context)
    }

    companion object {

        private var instance:LHVolley? = null

        fun getInstance(context: Context):LHVolley =
            instance ?: synchronized(this){
                instance ?: LHVolley(context).also { instance = it }
            }
    }

    fun addToQueue(jsonObjectRequest: JsonObjectRequest){
        requestQueue?.add(jsonObjectRequest)
    }

    fun createJsonObjectRequest(url:String,jsonRequest: JSONObject,responseCallBack: ResponseCallBack): JsonObjectRequest {
        return JsonObjectRequest(Request.Method.POST,url,jsonRequest,Response.Listener<JSONObject> {
            responseCallBack.onResponse(it)
        }, Response.ErrorListener {
            responseCallBack.onError(it)
        })
    }
}