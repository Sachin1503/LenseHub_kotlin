package com.app.lenshub.model

import android.os.Parcel
import android.os.Parcelable


// Created by app singh on 25/7/18.

class Item(var name: String,
           var brand: String,
           var model: String,
           var category: String,
           var purchaedYear: String,
           var address: String,
           var drawable: Int,
           var rent: String): Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readInt(),
            parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(brand)
        parcel.writeString(model)
        parcel.writeString(category)
        parcel.writeString(purchaedYear)
        parcel.writeString(address)
        parcel.writeInt(drawable)
        parcel.writeString(rent)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Item> {
        override fun createFromParcel(parcel: Parcel): Item {
            return Item(parcel)
        }

        override fun newArray(size: Int): Array<Item?> {
            return arrayOfNulls(size)
        }
    }


}