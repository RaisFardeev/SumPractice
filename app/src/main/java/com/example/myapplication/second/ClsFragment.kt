package com.example.myapplication.second

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import com.google.android.material.snackbar.Snackbar

class ClsFragment: Fragment(R.layout.fragment_cls) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = arguments?.getString("ARG_TEXT").orEmpty()
        if(text.isNotEmpty()){
            Snackbar.make(view,text,Snackbar.LENGTH_LONG).show()
        }
    }
}