package com.example.root.kotlinlandmarkbook

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val intent = intent


        val name = intent.getStringExtra("name")

        val chosen = Globals.ChosenImage

        val selectedImage = chosen.returnImage()

        imageView.setImageBitmap(selectedImage)

        



    }
}
