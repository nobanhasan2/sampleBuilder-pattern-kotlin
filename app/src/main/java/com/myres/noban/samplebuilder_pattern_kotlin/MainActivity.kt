package com.myres.noban.samplebuilder_pattern_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Order1 = Order.Builder()
            .name("Hilsha Fry")
            .quantity("50")
            .price("20$")
            .total_price("100$")
            .build();

        val Order2 = Order.Builder()
            .name("Rui Fry")
            .total_price("100$")
            .build();

    }
}
