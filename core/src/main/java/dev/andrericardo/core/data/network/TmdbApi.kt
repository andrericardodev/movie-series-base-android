package dev.andrericardo.core.data.network

import dev.andrericardo.core.data.network.response.MovieListPopularResponse
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface TmdbApi {
    @GET("movie/popular")
    suspend fun getMovieListPopular(
        @QueryMap
        queries: Map<String, String>,
    ): MovieListPopularResponse
}
