package com.utildev.samples.service

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv.setOnClickListener {
            startService(Intent(this, MyService::class.java))
        }
        tv1.setOnClickListener {
            stopService(Intent(this, MyService::class.java))
        }


        val result = add(10, 20)
        Log.d("aaa", "$result")
        val add = returnMeAddFunc()
        Log.d("aaa", "$add")
    }

    fun returnMeAddFunc(): ((Int, Int) -> Int) {
        return ::add
    }

    fun add(a: Int, b: Int) = a + b
}
