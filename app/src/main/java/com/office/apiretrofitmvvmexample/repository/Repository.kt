package com.office.apiretrofitmvvmexample.repository

import com.office.apiretrofitmvvmexample.model.Post
import com.office.apiretrofitmvvmexample.utils.RetrofitInstance

class Repository {
    suspend fun getPost(): Post {
       return RetrofitInstance.api.getPost()
    }
}