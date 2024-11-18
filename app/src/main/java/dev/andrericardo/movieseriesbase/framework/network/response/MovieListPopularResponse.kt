package dev.andrericardo.movieseriesbase.framework.network.response

import com.google.gson.annotations.SerializedName

data class MovieListPopularResponse(
    val page: Int,
    val results: List<MovieResponse>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int,
)
