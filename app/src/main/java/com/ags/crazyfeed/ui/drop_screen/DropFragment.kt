package com.ags.crazyfeed.ui.drop_screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ags.crazyfeed.databinding.FragmentDropScreenBinding

class DropFragment : Fragment() {

    private var _binding: FragmentDropScreenBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDropScreenBinding.inflate(inflater, container, false)

        // Add your fragment-specific logic here

        return binding.root
    }
}