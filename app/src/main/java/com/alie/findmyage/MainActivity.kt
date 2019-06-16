package com.alie.findmyage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //findAgeBtn.setOnClickListener {
            /*val yearOfBirth:Int = yearOfBirthTxt.text.toString().toInt()
            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
            val myAge = currentYear - yearOfBirth
            showAgeTxt.text = "You age is $myAge years"*/
        //}
    }

    fun findAgeEvent(view:View) {
        val yearOfBirth:Int = yearOfBirthTxt.text.toString().toInt()
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val myAge = currentYear - yearOfBirth
        showAgeTxt.text = "You age is $myAge years"
    }
}
