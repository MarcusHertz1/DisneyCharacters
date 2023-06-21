package com.example.disneycharacters.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.disneycharacters.databinding.StartLayoutBinding

class StartFragment : Fragment() {
    private lateinit var binding: StartLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = StartLayoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.getStartedBT.setOnClickListener {
            val action =
                StartFragmentDirections.actionStartFragmentToMainFragment()
            findNavController().navigate(action)
        }
    }
}