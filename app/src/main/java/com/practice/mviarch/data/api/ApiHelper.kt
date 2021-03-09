package com.practice.mviarch.data.api

import com.practice.mviarch.data.model.User

interface ApiHelper {
    suspend fun getUsers(): List<User>
}