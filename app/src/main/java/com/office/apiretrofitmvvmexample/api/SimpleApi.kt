package com.office.apiretrofitmvvmexample.api

import com.office.apiretrofitmvvmexample.model.Post
import retrofit2.http.GET

interface SimpleApi {
    @GET("posts/1")
    suspend fun getPost(): Post
}