package com.kiro.hm1_m4.ui.single_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.kiro.hm1_m4.R
import com.kiro.hm1_m4.databinding.ActivityMainBinding
import com.kiro.hm1_m4.ui.adapter.Rv_adapter

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

}