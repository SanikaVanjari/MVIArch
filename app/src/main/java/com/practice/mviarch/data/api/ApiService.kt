package com.practice.mviarch.data.api

import com.practice.mviarch.data.model.User
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers(): List<User>
}