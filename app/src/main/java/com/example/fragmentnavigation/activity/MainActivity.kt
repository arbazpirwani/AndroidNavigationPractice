package com.example.fragmentnavigation.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.navigation.findNavController
import com.example.fragmentnavigation.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window?.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        val navController = findNavController(R.id.fragmentNavigation)

        linearLayoutTab.setOnClickListener {
            navController.navigate(R.id.logInFragment)
        }
    }

    fun hideTab() {
        linearLayoutTab.visibility = View.GONE
    }

    fun showTab() {
        linearLayoutTab.visibility = View.VISIBLE
    }
}