package com.amaurypm.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.amaurypm.recycler.databinding.ElementoListaBinding
import com.amaurypm.recycler.model.Anime

class AnimeAdapter(private val animes: ArrayList<Anime>, private val onAnimeClicked: (Anime) -> Unit): RecyclerView.Adapter<AnimeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        val binding = ElementoListaBinding.inflate(LayoutInflater.from(parent.context))
        return AnimeViewHolder(binding)
    }

    override fun getItemCount(): Int = animes.size

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {

        val anime = animes[position]

        holder.bind(anime)

        /*holder.itemView.setOnClickListener {
            onAnimeClicked(anime)
        }*/

        holder.ivIcon.setOnClickListener {
            onAnimeClicked(anime)
        }

        holder.tvTitulo.setOnClickListener {
            onAnimeClicked(anime)
        }

    }
}