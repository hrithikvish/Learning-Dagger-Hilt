package com.hrithikvish.learningdaggerhilt.api

import com.hrithikvish.learningdaggerhilt.model.PostItem
import javax.inject.Inject

class PostApiServiceImpl @Inject constructor(private val postApiService: PostApiService) {
    suspend fun getPosts():List<PostItem> = postApiService.getPosts()
}