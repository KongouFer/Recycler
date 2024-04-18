package com.amaurypm.recycler

import androidx.recyclerview.widget.RecyclerView
import com.amaurypm.recycler.databinding.ElementoListaBinding
import com.amaurypm.recycler.model.Anime

class AnimeViewHolder(private val binding: ElementoListaBinding) :
    RecyclerView.ViewHolder(binding.root) {

        val ivIcon = binding.ivIcon
        val tvTitulo = binding.tvTitulo

        fun bind(anime: Anime){
            binding.apply {
                tvTitulo.text = anime.titulo
                tvTipo.text = anime.tipo
                tvFecha.text = anime.fecha
            }
        }
}