package com.example.navigation_draewer_app.ui.share

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.navigation_draewer_app.databinding.FragmentShareBinding

class ShareFragment : Fragment() {

    private var _binding: FragmentShareBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val shareViewModel =
            ViewModelProvider(this).get(ShareViewModel::class.java)

        _binding = FragmentShareBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.shareTextview
        shareViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
