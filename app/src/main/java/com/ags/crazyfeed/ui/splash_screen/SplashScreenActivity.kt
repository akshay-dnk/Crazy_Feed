package com.ags.crazyfeed.ui.splash_screen

import android.content.Intent
import android.os.Bundle
import android.view.animation.AccelerateDecelerateInterpolator
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.lifecycleScope
import com.ags.crazyfeed.MainActivity
import com.ags.crazyfeed.databinding.ActivitySplashScreenBinding
import com.ags.crazyfeed.ui.base_screen.BaseActivity
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreenActivity : BaseActivity() {

    private lateinit var binding: ActivitySplashScreenBinding
    private val splashTime: Long = 3000 // 3 seconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Apply insets
        applyWindowInsets(binding.main)

        val logo = binding.ivSplashLogo
        val appName = binding.tvAppName

        // Start animation
        logo.animate()
            .alpha(1f)
            .scaleX(1.2f)
            .scaleY(1.2f)
            .setDuration(1000)
            .setInterpolator(AccelerateDecelerateInterpolator())
            .withEndAction {
                appName.animate()
                    .alpha(1f)
                    .setDuration(800)
                    .start()
            }
            .start()

        lifecycleScope.launch {
            delay(splashTime)
            startActivity(Intent(this@SplashScreenActivity, MainActivity::class.java))
            finish()
        }
    }
}