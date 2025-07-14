package com.ags.crazyfeed.ui.feed_screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ags.crazyfeed.databinding.FragmentFeedScreenBinding

class FeedFragment : Fragment() {

    private var _binding: FragmentFeedScreenBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFeedScreenBinding.inflate(inflater, container, false)

        // Add your fragment-specific logic here

        return binding.root
    }
}