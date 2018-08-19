package com.app.lenshub.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.app.lenshub.R
import com.app.lenshub.model.Item
import com.bumptech.glide.Glide

/**
 * Created by sachinsingh on 18/08/18.
 */
class DetailFragment : Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_detail,container,false)
        init(view)
        return view
    }

    private fun init(view: View){
        val tvRent =  view.findViewById<TextView>(R.id.tvRent)
        val tvDescription =  view.findViewById<TextView>(R.id.tvDescription)
        val tvCategory =  view.findViewById<TextView>(R.id.tvCategory)
        val tvBrand =  view.findViewById<TextView>(R.id.tvBrand)
        val tvModel =  view.findViewById<TextView>(R.id.tvModelName)
        val tvPurchasedYear =  view.findViewById<TextView>(R.id.tvPurchasedYear)

        val ivCenter =  view.findViewById<ImageView>(R.id.ivCenter)
        val ivPreview1 =  view.findViewById<ImageView>(R.id.ivPreview1)
        val ivPreview2 =  view.findViewById<ImageView>(R.id.ivPreview2)
        val ivPreview3 =  view.findViewById<ImageView>(R.id.ivPreview3)
        val ivPreview4 =  view.findViewById<ImageView>(R.id.ivPreview4)

        val btnViewProfile = view.findViewById<Button>(R.id.btnViewProfile)
        val btnRentNow = view.findViewById<Button>(R.id.btnRentNow)

        btnViewProfile.setOnClickListener { viewProfile() }
        btnRentNow.setOnClickListener { rentNow() }

        val bundle = this.arguments
        val item:Item? = bundle?.getParcelable("item")

        tvRent.text = item?.name + " "+item?.rent
        tvDescription.text = "Description"
        tvCategory.text = item?.category
        tvBrand.text = item?.brand
        tvModel.text = item?.model
        tvPurchasedYear.text = item?.purchaedYear

        activity?.let { Glide.with(it).load(item?.drawable).into(ivCenter) }
        activity?.let { Glide.with(it).load(item?.drawable).into(ivPreview1) }

        activity?.title = item?.name

    }

    private fun rentNow(){
        Toast.makeText(activity,R.string.not_implemented,Toast.LENGTH_SHORT).show()
    }

    private fun viewProfile(){
        Toast.makeText(activity,R.string.not_implemented,Toast.LENGTH_SHORT).show()
    }

}