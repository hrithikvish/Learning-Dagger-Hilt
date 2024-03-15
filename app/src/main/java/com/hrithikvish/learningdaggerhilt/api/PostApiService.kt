package com.hrithikvish.learningdaggerhilt.api

import com.hrithikvish.learningdaggerhilt.model.PostItem
import retrofit2.http.GET

interface PostApiService {
    @GET("posts")
    suspend fun getPosts():List<PostItem>
}