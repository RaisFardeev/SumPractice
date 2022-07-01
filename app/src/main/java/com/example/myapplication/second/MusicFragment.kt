package com.example.myapplication.second

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentMusicBinding
class MusicFragment: Fragment(R.layout.fragment_music) {
    private var _binding: FragmentMusicBinding? = null
    private val binding get() = _binding!!


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMusicBinding.bind(view)
        with(binding){
            btnCls.setOnClickListener {
                val bundle = Bundle()
                bundle.putString("ARG_TEXT","MusicFragment")
                findNavController().navigate(R.id.action_musicFragment_to_clsFragment,bundle)
            }
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}