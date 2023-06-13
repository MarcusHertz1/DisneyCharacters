package com.example.disneycharacters.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.disneycharacters.databinding.RecyclerViewItemLayoutBinding

class Adapter (private var itemsList: List<AdapterItem>): RecyclerView.Adapter<Adapter.ViewHolder>() {

    inner class ViewHolder(val binding: RecyclerViewItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = RecyclerViewItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            with(itemsList[position]) {

                binding.charterNameTV0.text = name
                /*binding.messageTV.text = image*/

                /*binding.container.setOnClickListener {
                    showNote(title, message)
                }*/
            }
        }
    }

    override fun getItemCount(): Int {
        return itemsList.size
    }
}