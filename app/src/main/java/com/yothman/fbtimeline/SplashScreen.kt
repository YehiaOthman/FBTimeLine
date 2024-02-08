package com.yothman.fbtimeline

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.yothman.fbtimeline.databinding.SplashActivityBinding

class SplashScreen : AppCompatActivity(){
    lateinit var binding: SplashActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SplashActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler(Looper.getMainLooper()).postDelayed({
            var intent = Intent(this,FaceBookTimeLine::class.java)
            startActivity(intent)
            finish()
        },2000)
    }


}