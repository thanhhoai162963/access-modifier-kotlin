package com.example.visibilitymodifiers

import android.util.Log

class Student : Person() {
    fun showInfo(){
        Log.d("bbb",name)
        Log.d("bbb",age.toString())
    }
    showInfoPerson()