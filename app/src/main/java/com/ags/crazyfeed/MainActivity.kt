package com.ags.crazyfeed

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.ags.crazyfeed.databinding.ActivityMainBinding
import com.ags.crazyfeed.ui.base_screen.BaseActivity

class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Apply insets
        applyWindowInsets(binding.main)

        // Find NavController from NavHostFragment
        val navController = findNavController(R.id.nav_host_fragment)

        // Connect bottom nav with NavController
        binding.bottomNav.setupWithNavController(navController)
    }

    // Handle Up navigation
    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}