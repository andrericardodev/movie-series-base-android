package dev.andrericardo.movieseriesbase.presentation.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import dev.andrericardo.core.domain.model.Movie
import dev.andrericardo.movieseriesbase.databinding.FragmentHomeBinding

@AndroidEntryPoint
class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private val moviesAdapter = MoviesAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ) = FragmentHomeBinding
        .inflate(
            inflater,
            container,
            false,
        ).apply {
            _binding = this
        }.root

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?,
    ) {
        super.onViewCreated(view, savedInstanceState)

        initMoviesAdapter()

        moviesAdapter.submitList(
            listOf(
                Movie(
                    "Venom: The Last Dance",
                    "https://image.tmdb.org/t/p/w500/3V4kLQg0kSqPLctI5ziYWabAZYF.jpg",
                ),
                Movie(
                    "Gladiator II",
                    "https://image.tmdb.org/t/p/w500/8mjYwWT50GkRrrRdyHzJorfEfcl.jpg",
                ),
                Movie(
                    "The Wild Robot",
                    "https://image.tmdb.org/t/p/w500/v9acaWVVFdZT5yAU7J2QjwfhXyD.jpg",
                ),
                Movie(
                    "Transformers: O Início",
                    "https://image.tmdb.org/t/p/w500/2h9yTYWTb909J28bzNTIE7dyNqP.jpg",
                ),
            ),
        )
    }

    private fun initMoviesAdapter() {
        with(binding.recyclerMovies) {
            setHasFixedSize(true)
            adapter = moviesAdapter
        }
    }
}
