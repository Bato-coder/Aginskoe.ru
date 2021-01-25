package com.bato.aginskoeru

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bato.aginskoeru.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mBinding.root
        setContentView(view)
    }
}