package com.amaurypm.recycler

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.amaurypm.recycler.databinding.ActivityMainBinding
import com.amaurypm.recycler.model.Anime
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val animes = ArrayList<Anime>()

        for (i in 1..10000) {
            val animeTmp = Anime(
                i.toLong() + Random.nextLong(10000),
                "Título $i",
                "Tipo: $i",
                "Fecha $i"
            )
            animes.add(animeTmp)
        }

        val animesAdapter = AnimeAdapter(animes){ anime ->
            mensaje("Click en elemento con el títilo ${anime.titulo}")
        }

        binding.rvMain.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        binding.rvMain.apply {
            layoutManager = LinearLayoutManager(this@MainActivity, RecyclerView.VERTICAL, false)
            adapter = animesAdapter
        }


    }
}