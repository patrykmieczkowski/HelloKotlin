package com.mieczkowskidev.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    val x: Int = 1
    var y: Int = 2
    val rower: Bike = Bike("asd", 23)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        print(rower.id + rower.size)

    }

    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun lista(mojaLista: Array<String>) {
        if (mojaLista.isEmpty()) return

        print("First argument: ${mojaLista[0]}")
    }

}
