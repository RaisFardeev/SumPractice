package com.example.myapplication.second

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentUsersBinding
import com.google.android.material.snackbar.Snackbar

class ProfileFragment: Fragment(R.layout.fragment_users) {
    private var _binding: FragmentUsersBinding? = null
    private val binding get() = _binding!!
    private var adapter: UserAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentUsersBinding.bind(view)
        adapter = UserAdapter(UserRepository.users, {
            Snackbar.make(binding.root,"User id:${it.id};    User name:${it.name}\nDescription:${it.description}",Snackbar.LENGTH_LONG).show()})
        binding.rvUsers.adapter = adapter
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}