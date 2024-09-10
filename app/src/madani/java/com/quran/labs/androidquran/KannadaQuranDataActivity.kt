package com.quran.labs.androidquran

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowInsetsController
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.quran.labs.androidquran.widget.QuranMaxImageView


class KannadaQuranDataActivity : QuranDataActivity() {
    private lateinit var mSplashView: QuranMaxImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        mSplashView = findViewById<View>(R.id.splashview) as QuranMaxImageView
        mSplashView.setLayerType(View.LAYER_TYPE_HARDWARE, null)

        try {
            mSplashView.setImageResource(R.drawable.splash)
        } catch (error: OutOfMemoryError) {
            mSplashView.setBackgroundColor(Color.BLACK)
        }

        /* KQA Hide status bar nad navigation bar  */

        // Check for API level before using WindowInsetsControllerCompat
       /* if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            val controller = WindowCompat.getInsetsController(window, window.decorView)
            controller?.let {
                it.hide(WindowInsetsCompat.Type.statusBars() or WindowInsetsCompat.Type.navigationBars())
                it.systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
            }
        } else {
            // For API levels below 30, use deprecated SYSTEM_UI_FLAG_* flags
            @Suppress("DEPRECATION")
            window.decorView.apply {
                systemUiVisibility = (
                        View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                                or View.SYSTEM_UI_FLAG_FULLSCREEN
                                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                                or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        )
            }
        }*/
        // remove this if not required
        /* KQA Hide status bar nad navigation bar  */
    }
}
