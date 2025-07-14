package com.ags.crazyfeed.ui.my_zone_screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ags.crazyfeed.databinding.FragmentMyZoneScreenBinding

class MyZoneFragment : Fragment() {

    private var _binding: FragmentMyZoneScreenBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMyZoneScreenBinding.inflate(inflater, container, false)

        // Add your fragment-specific logic here

        return binding.root
    }
}