package com.lupa.cowboyshoot.ui.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.lupa.cowboyshoot.R
import com.lupa.cowboyshoot.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {

    private val binding: ActivityMenuBinding by lazy {
        ActivityMenuBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.hide()

        val name = intent.getStringExtra("name")

        binding.tvTitleMenu.text = "Hi ${name}!"
        binding.tvVsComputer.text = "$name vs Computer"
        binding.tvVsPlayer.text = "$name vs Player"


        Snackbar.make(binding.menuActivity, "Welcom to the game $name", Snackbar.LENGTH_LONG)
            .setAction("Close") {}.show()
    }
}