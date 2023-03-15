package com.example.myapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class   MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomView = findViewById<BottomNavigationView>(R.id.bottom_nav)


        val navController =findNavController(R.id.container)


        navController.removeOnDestinationChangedListener { _, destination, _ ->
            if (destination.id == R.id.createanimesfragment){
                bottomView.visibility = View.GONE
            } else bottomView.visibility = View.VISIBLE

            //        bottomView.visibility = if(destination.id == R.id.createanimesfragment) View.GONE else View.VISIBLE
        }
        AppBarConfiguration(
            navController.graph
        )


        bottomView.setupWithNavController(navController)


    }


}