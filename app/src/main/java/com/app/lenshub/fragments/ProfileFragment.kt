package com.app.lenshub.fragments

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import com.app.lenshub.R
import com.app.lenshub.utils.Constants


// Created by sachin singh on 6/8/18.

class ProfileFragment : Fragment(){

    private var sharePreferences:SharedPreferences? = null
    var editTextName:EditText? = null
    var editTextEmail:EditText? = null
    var editTextMobile:EditText? = null
    var editTextAddress:EditText? = null
    var editTextZip:EditText? = null
    var editTextCity:EditText? = null
    var editTextCountry:EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activity?.title = getString(R.string.profile)
        sharePreferences = activity?.getSharedPreferences(Constants.SHARE_PREFERENCE_FILE,Context.MODE_PRIVATE)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view:View = inflater.inflate(R.layout.fragment_profile,container,false)
        init(view)
        return view;
    }

    private fun init(view: View){
         editTextName = view.findViewById<EditText>(R.id.editTextName)
         editTextEmail = view.findViewById<EditText>(R.id.editTextEmail)
         editTextMobile = view.findViewById<EditText>(R.id.editTextMobile)
         editTextAddress = view.findViewById<EditText>(R.id.editTextAddress)
         editTextZip = view.findViewById<EditText>(R.id.editTextZip)
         editTextCity = view.findViewById<EditText>(R.id.editTextCity)
         editTextCountry = view.findViewById<EditText>(R.id.editTextCountry)

        editTextName?.setText(sharePreferences?.getString(Constants.USER_NAME,""))
        editTextEmail?.setText(sharePreferences?.getString(Constants.USER_EMAIL,""))
        editTextMobile?.setText(sharePreferences?.getString(Constants.USER_MOBILE,""))
        editTextAddress?.setText(sharePreferences?.getString(Constants.USER_ADDRESS,""))
        editTextZip?.setText(sharePreferences?.getString(Constants.USER_ZIP,""))
        editTextCity?.setText(sharePreferences?.getString(Constants.USER_CITY,""))
        editTextCountry?.setText(sharePreferences?.getString(Constants.USER_COUNTRY,""))
    }

    override fun onPause() {
        super.onPause()
        val editor = sharePreferences?.edit()
        editor?.putString(Constants.USER_MOBILE,editTextMobile?.text.toString())
        editor?.putString(Constants.USER_ADDRESS,editTextAddress?.text.toString())
        editor?.putString(Constants.USER_ZIP,editTextZip?.text.toString())
        editor?.putString(Constants.USER_CITY,editTextCity?.text.toString())
        editor?.putString(Constants.USER_COUNTRY,editTextCountry?.text.toString())
        editor?.apply()
    }
}