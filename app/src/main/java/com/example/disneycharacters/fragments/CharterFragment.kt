package com.example.disneycharacters.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.disneycharacters.databinding.CharterLayoutBinding

class CharterFragment : Fragment() {
    private lateinit var binding: CharterLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = CharterLayoutBinding.inflate(inflater, container, false)
        return binding.root
    }


}