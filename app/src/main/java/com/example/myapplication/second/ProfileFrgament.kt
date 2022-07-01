package com.example.myapplication.second

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentProfileBinding

class ProfileFragment: Fragment(R.layout.fragment_profile) {
    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentProfileBinding.bind(view)
        with(binding){
            btnCls.setOnClickListener {
                val bundle = Bundle()
                bundle.putString("ARG_TEXT","ProfileFragment")
                findNavController().navigate(R.id.action_profileFragment_to_clsFragment,bundle)
            }
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}