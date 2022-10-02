package com.example.navigation_draewer_app.ui.uifragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigation_draewer_app.R
import com.example.navigation_draewer_app.databinding.AppBarMainFloatingbuttonBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class AppBarFloatingbuttonfragment : Fragment() {
    private lateinit var binding: AppBarMainFloatingbuttonBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = AppBarMainFloatingbuttonBinding.inflate(inflater, container, false)
        return binding.root
    }

    @Deprecated("Deprecated in Java")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setupFab()
    }

    private fun setupFab() {
        activity?.findViewById<FloatingActionButton>(R.id.fab)?.let {
            it.setOnClickListener {
                findNavController().navigate(R.id.action_appBarFloatingbuttonfragment_to_floatingButtonMessageFragment)
            }
        }
    }
}

