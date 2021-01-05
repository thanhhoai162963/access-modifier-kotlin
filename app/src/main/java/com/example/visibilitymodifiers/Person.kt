package com.example.visibilitymodifiers

import android.util.Log

 open class Person(){
    internal var name:String = "123"
    protected var age:Int = 0
     var lastName = ""
     protected fun showInfoPerson(){
        Log.d("bbb",lastName)
    }
}