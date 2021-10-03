package com.example.myapplication

val applicationName = "MyApp"

fun getFullName(packageName: String, appName: String): String {
    return packageName + appName
}

open class Person(val firstName: String, var lastName: String, val age: Int) {
    private val c = 26
    private var name: String? = "Ann"
    private var surname: String? = null
    private lateinit var something: String
    private val list: List<String> = ArrayList()

    init {
        lastName = "Morozova"
        setInitValues()
    }

    fun setSurname(surname: String) {
        this.surname = surname
    }

    fun setInitValues(): String {
        name = "Lexa"

        surname = "Lebedev"


        val isTrue = false
        if (isTrue) sum(2, 5) else name = ""

        println(firstName)


        someFun(100, "a", "b")

        val appName = applicationName

        return name ?: "No name"
    }

    fun sum(a: Int, b: Int): Int {
        val primitiveInts = intArrayOf(1, 2)
        val array = arrayOf(1, 2)
        val array2 = emptyArray<Int>()
        val array3 = Array(5) { 0 }
        val arrayList = arrayListOf(1, 2, 3)
        val arrayList2 = arrayListOf<Int>()

        return a + b
    }

    fun someFun(sum: Int = 0, vararg strings: String) {
        val first = strings[0]
    }


    fun sum(a: Double, b: Double) = a + b


    inner class ViewHolder {
        fun doIt2() {
            name?.get(1)
        }
    }
}