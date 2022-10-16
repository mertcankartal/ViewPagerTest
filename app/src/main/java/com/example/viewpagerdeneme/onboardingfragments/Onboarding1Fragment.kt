package com.example.viewpagerdeneme.onboardingfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpagerdeneme.R
import com.example.viewpagerdeneme.databinding.FragmentFirstBinding
import com.example.viewpagerdeneme.databinding.FragmentOnboarding1Binding


class Onboarding1Fragment : Fragment() {

    private var _binding : FragmentOnboarding1Binding?= null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOnboarding1Binding.inflate(inflater,container,false)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        binding.viewpagerButton1.setOnClickListener {
            viewPager?.currentItem = 1
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}