package com.example.myapp.ui.animes


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapp.databinding.FragmentCreateAnimeBinding

class Createanimesfragment: Fragment(){

    private var binding:FragmentCreateAnimeBinding? = null



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCreateAnimeBinding.inflate(
            LayoutInflater.from(requireContext()),
            container,
            false
        )


        return binding!!.root
    }
}