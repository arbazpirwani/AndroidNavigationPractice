package com.example.fragmentnavigation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.fragmentnavigation.R
import com.example.fragmentnavigation.activity.MainActivity
import kotlinx.android.synthetic.main.fragment_splash_screen.*

class SplashScreen : BaseFragment(), View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_splash_screen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        if (requireActivity() is MainActivity) {
            (requireActivity() as MainActivity).showTab()
        }
        setListeners()
    }

    private fun setListeners() {
        textViewSplash.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            textViewSplash.id -> {
                findNavController().navigate(R.id.action_splashScreen_to_logInFragment)
            }
        }
    }


}