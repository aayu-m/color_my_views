package com.kotlinapps.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.kotlinapps.colormyviews.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setListeners();
    }

    private fun setListeners() {
        val views : List<View> = listOf(binding.boxOneText, binding.boxTwo, binding.boxThree, binding.boxFour, binding.boxFive, binding.root, binding.red, binding.Blue, binding.yellow)

        for(item in views){
            item.setOnClickListener{makeColour(it)}
        }
    }

    private fun makeColour(view : View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_three -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five -> view.setBackgroundResource(android.R.color.holo_green_light)

            R.id.red -> binding.boxThree.setBackgroundResource(R.color.my_red)
            R.id.yellow -> binding.boxFour.setBackgroundResource(R.color.my_yellow)
            R.id.Blue -> binding.boxFive.setBackgroundResource(R.color.my_blue)


            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}