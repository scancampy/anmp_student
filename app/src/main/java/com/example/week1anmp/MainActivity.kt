package com.example.week1anmp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.example.week1anmp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var navController:NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // WIP - Game Setup

        navController = (supportFragmentManager.findFragmentById(R.id.hostFragment)
                as NavHostFragment).navController
        NavigationUI.setupActionBarWithNavController(this, navController,
            binding.drawerLayout)

        // establish connection navcontroller with bottom bar
        binding.bottomNav.setupWithNavController(navController)

        // establish connection navController with Drawer
        NavigationUI.setupWithNavController(binding.navView, navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navController, binding.drawerLayout)
                || super.onSupportNavigateUp()
    }
}