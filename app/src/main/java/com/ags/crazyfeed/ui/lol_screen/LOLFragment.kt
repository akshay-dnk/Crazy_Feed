package com.ags.crazyfeed.ui.lol_screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ags.crazyfeed.databinding.FragmentLolScreenBinding

class LOLFragment : Fragment() {

    private var _binding: FragmentLolScreenBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLolScreenBinding.inflate(inflater, container, false)

        // Add your fragment-specific logic here

        return binding.root
    }
}