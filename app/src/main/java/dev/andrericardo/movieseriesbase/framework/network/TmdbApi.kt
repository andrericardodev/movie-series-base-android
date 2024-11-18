package dev.andrericardo.movieseriesbase.framework.network

import dev.andrericardo.movieseriesbase.framework.network.response.MovieListPopularResponse
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface TmdbApi {
    @GET("movie/popular")
    suspend fun getMovieListPopular(
        @QueryMap
        queries: Map<String, String>,
    ): MovieListPopularResponse
}
