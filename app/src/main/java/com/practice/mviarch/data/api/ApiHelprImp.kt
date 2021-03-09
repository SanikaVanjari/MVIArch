package com.practice.mviarch.data.api

import com.practice.mviarch.data.model.User

class ApiHelprImp(private val apiService: ApiService) : ApiHelper {
    override suspend fun getUsers(): List<User> {
        return apiService.getUsers()
    }
}