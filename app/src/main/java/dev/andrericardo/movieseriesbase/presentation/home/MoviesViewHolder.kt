package dev.andrericardo.movieseriesbase.presentation.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import dev.andrericardo.core.domain.model.Movie
import dev.andrericardo.movieseriesbase.R
import dev.andrericardo.movieseriesbase.databinding.ItemMovieBinding

class MoviesViewHolder(
    itemMovieBinding: ItemMovieBinding
) : RecyclerView.ViewHolder(itemMovieBinding.root) {

    private val textTitle = itemMovieBinding.textTitle
    private val imageMovie = itemMovieBinding.imageMovie

    fun bind(movie: Movie) {
        textTitle.text = movie.title
        Glide.with(itemView)
            .load(movie.imageUrl)
            .fallback(R.drawable.ic_broken_image)
            .into(imageMovie)
    }

    companion object {
        fun create(parent: ViewGroup): MoviesViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val itemBinding = ItemMovieBinding.inflate(inflater, parent, false)
            return MoviesViewHolder(itemBinding)
        }
    }

}