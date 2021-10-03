package com.example.myapplication

interface SomeInterface {
    var someValue: String

    fun someCalc()
    fun getData(): String = "Default implementation"
}