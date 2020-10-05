package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        setListener()
    }

    private fun setListener(){
        binding.apply {
            goBiasActivity.setOnClickListener {
                //인텐드
               startActivity(BaisActivity::class.java)

            }

            goChainActivity.setOnClickListener {
                startActivity(ChainActivity::class.java)
            }

            goWidthActivity.setOnClickListener {
                startActivity(WidthActivity::class.java)
            }

        }
    }

   private fun startActivity(target:Class<*>){
        startActivity(
            Intent(
                this,target
            )
        )
    }


}