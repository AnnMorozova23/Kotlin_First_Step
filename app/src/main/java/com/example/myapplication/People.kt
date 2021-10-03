package com.example.myapplication


class People(firstName: String, lastName: String, age: Int) : Person(firstName, lastName, age), SomeInterface {
    init {
        setInitValues()
    }

    override var someValue: String = "Hello"

    var index: Int = 2
        get() = field + 1
        private set(value) {
            println(value)
            field = value
        }

    override fun someCalc() {
        2 + 2
        someValue = "new value"
    }

}