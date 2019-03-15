package com.example.root.kotlinlandmarkbook

import android.graphics.Bitmap

class Globals{


    companion object ChosenImage {

        var chosenImage: Bitmap? = null

        fun returnImage():Bitmap{
            return chosenImage!! //we are sure the variable is not null !!
        }
    }





}