package com.islamzadais.bottomnavtest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val string = "salam"
        val intent = FirstFragmentDirections.fromFirstToSecond(name = string)
        Navigation.findNavController(requireView()).navigate(intent)
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

}