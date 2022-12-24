package com.example.daggerhilt

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.daggerhilt.databinding.ItemCryptoBinding

class CryptocurrencyAdapter(private val cryptocurrency: List<Cryptocurrency>): RecyclerView.Adapter<CryptocurrencyAdapter.ViewHolder>() {
    class ViewHolder(val binding: ItemCryptoBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(index: Cryptocurrency) {
            // Here, we are using Glide library to
            // load the image into ImageView
            Glide.with(itemView.context)
                .load(index.image).dontAnimate()
                .into(binding.image)
            // Setting name of cryptocurrency to TextView
            binding.cryptocurrency.text = index.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflate = LayoutInflater.from(parent.context)
        return ViewHolder(ItemCryptoBinding.inflate(layoutInflate,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(cryptocurrency[position])
    }

    override fun getItemCount(): Int {
        return cryptocurrency.size
    }
}