package dev.andrericardo.movieseriesbase.presentation.home

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import dev.andrericardo.core.domain.model.Movie

class MoviesAdapter : ListAdapter<Movie, MoviesViewHolder>(diffCallback) {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): MoviesViewHolder = MoviesViewHolder.create(parent)

    override fun onBindViewHolder(
        holder: MoviesViewHolder,
        position: Int,
    ) {
        holder.bind(getItem(position))
    }

    companion object {
        private val diffCallback =
            object : DiffUtil.ItemCallback<Movie>() {
                override fun areItemsTheSame(
                    oldItem: Movie,
                    newItem: Movie,
                ): Boolean = oldItem.title == newItem.title

                override fun areContentsTheSame(
                    oldItem: Movie,
                    newItem: Movie,
                ): Boolean = oldItem == newItem
            }
    }
}
