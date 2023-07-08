package com.islamzadais.bottomnavtest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bundle : SecondFragmentArgs by navArgs()
        val name = bundle.name
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

}