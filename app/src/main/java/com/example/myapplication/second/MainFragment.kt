package com.example.myapplication.second

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentMainBinding

class MainFragment: Fragment(R.layout.fragment_main) {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMainBinding.bind(view)
        with(binding){
            btnCls.setOnClickListener {
                val bundle = Bundle()
                bundle.putString("ARG_TEXT","MainFragment")
                findNavController().navigate(R.id.action_mainFragment_to_clsFragment,bundle)
            }
         }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}