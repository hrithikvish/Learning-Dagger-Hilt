package com.hrithikvish.learningdaggerhilt.repo

import com.hrithikvish.learningdaggerhilt.api.PostApiServiceImpl
import com.hrithikvish.learningdaggerhilt.model.PostItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class PostRepository @Inject constructor(private val postApiServiceImpl: PostApiServiceImpl) {

    fun getPosts():Flow<List<PostItem>> = flow {
        val response = postApiServiceImpl.getPosts()
        emit(response)
    }.flowOn(Dispatchers.IO)

}