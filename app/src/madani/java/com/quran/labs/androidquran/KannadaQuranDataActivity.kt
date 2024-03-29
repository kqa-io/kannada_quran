package com.quran.labs.androidquran

import android.graphics.Color
import android.os.Bundle
import android.view.View
import com.quran.labs.androidquran.widget.QuranMaxImageView


class KannadaQuranDataActivity : QuranDataActivity() {
    private lateinit var mSplashView: QuranMaxImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       /* setContentView(R.layout.splash_screen)

        mSplashView = findViewById<View>(R.id.splashview) as QuranMaxImageView
        mSplashView.setLayerType(View.LAYER_TYPE_HARDWARE, null)

        try {
            mSplashView.setImageResource(R.drawable.splash)
        } catch (error: OutOfMemoryError) {
            mSplashView.setBackgroundColor(Color.BLACK)
        }*/
    }
}
