package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class NewActivity:AppCompatActivity() {
    private var name: EditText? = null
    private var height: EditText? = null
    private var weight: EditText? = null
    private var age: EditText? = null
    private var calculate: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        name = findViewById(R.id.tv_Name)
        height = findViewById(R.id.tv_Height)
        weight = findViewById(R.id.tv_Weight)
        age  = findViewById(R.id.tv_Age)
        calculate = findViewById(R.id.Calculate)
        calculate?.setOnClickListener{
            calculateClick("Button")}


    }

    override fun onStart() {
        super.onStart()
    }

    fun calculateClick(newstr:String){
        val n = name?.text.toString()
        val h = height?.text.toString().toInt()
        val w = weight?.text.toString().toDouble()
        val a = age?.text.toString().toInt()
        if (0>n.length || n.length>50 && h<0 || h>250 || w<0.0 || w>250.0 || a<0 || a>150){

            Toast.makeText(this,"данные введены не корректно",Toast.LENGTH_SHORT).show()

        }else{
            val sum = n.length + h + w + a
            Toast.makeText(this,"sum of letters in your name,ages,height and weight is:"+sum.toString(),Toast.LENGTH_SHORT).show()
        }
    }
}

