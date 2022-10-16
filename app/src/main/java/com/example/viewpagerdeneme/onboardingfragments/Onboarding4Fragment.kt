package com.example.viewpagerdeneme.onboardingfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.viewpagerdeneme.R
import com.example.viewpagerdeneme.databinding.FragmentOnboarding3Binding
import com.example.viewpagerdeneme.databinding.FragmentOnboarding4Binding


class Onboarding4Fragment : Fragment() {

    private var _binding : FragmentOnboarding4Binding?= null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOnboarding4Binding.inflate(inflater,container,false)
        binding.viewpagerButton4.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_homeFragment)
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}