package com.example.viewpagerdeneme.onboardingfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpagerdeneme.R
import com.example.viewpagerdeneme.adapter.ViewPagerAdapter
import com.example.viewpagerdeneme.databinding.FragmentFirstBinding
import com.example.viewpagerdeneme.databinding.FragmentSplashBinding


class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)

        val fragmentList = arrayListOf<Fragment>(
            Onboarding1Fragment(),
            Onboarding2Fragment(),
            Onboarding3Fragment(),
            Onboarding4Fragment()
        )

        val adapter = ViewPagerAdapter(fragmentList,requireActivity().supportFragmentManager,lifecycle)
        binding.viewPager.adapter = adapter


        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}