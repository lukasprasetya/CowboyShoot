package com.lupa.cowboyshoot.ui.onboarding.entername

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.lupa.cowboyshoot.R
import com.lupa.cowboyshoot.databinding.FragmentEnterNameBinding
import com.lupa.cowboyshoot.ui.menu.MenuActivity
import com.lupa.cowboyshoot.ui.onboarding.OnFinishNavigationListener
import com.lupa.cowboyshoot.ui.onboarding.OnboardingActivity

class EnterNameFragment : Fragment(), OnFinishNavigationListener {

    private lateinit var binding: FragmentEnterNameBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEnterNameBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onFinishNavigateListener() {
        val name = binding.edtName.text.toString().trim()
        if (name.isEmpty()) {
            Toast.makeText(requireContext(), "Please input your name!", Toast.LENGTH_SHORT).show()
        } else {
            navigateToMenu(name)
        }
    }

    private fun navigateToMenu(name: String) {
        val intent = Intent(activity, MenuActivity::class.java)
        intent.putExtra("name", name)
        startActivity(intent)
    }
}

