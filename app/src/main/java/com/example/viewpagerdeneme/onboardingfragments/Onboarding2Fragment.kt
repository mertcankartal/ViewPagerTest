package com.example.viewpagerdeneme.onboardingfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpagerdeneme.R
import com.example.viewpagerdeneme.databinding.FragmentFirstBinding
import com.example.viewpagerdeneme.databinding.FragmentOnboarding2Binding


class Onboarding2Fragment : Fragment() {

    private var _binding : FragmentOnboarding2Binding?= null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOnboarding2Binding.inflate(inflater,container,false)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        binding.viewpagerButton2.setOnClickListener {
            viewPager?.currentItem = 2
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}