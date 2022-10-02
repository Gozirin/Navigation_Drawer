package com.example.navigation_draewer_app.ui.uicontent.settingscontent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.navigation_draewer_app.databinding.FragmentSettingContentMenuBinding

class SettingsContentFragment : Fragment() {

    private var _binding: FragmentSettingContentMenuBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(SettingsContentViewModel::class.java)

        _binding = FragmentSettingContentMenuBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.settingContentTextView
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
