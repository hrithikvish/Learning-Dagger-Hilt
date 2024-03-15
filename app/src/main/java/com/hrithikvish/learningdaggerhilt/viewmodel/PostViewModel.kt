package com.hrithikvish.learningdaggerhilt.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.hrithikvish.learningdaggerhilt.model.PostItem
import com.hrithikvish.learningdaggerhilt.repo.PostRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.catch
import javax.inject.Inject

@HiltViewModel
class PostViewModel @Inject constructor(private val postRepository: PostRepository):ViewModel() {

    val postLiveData:LiveData<List<PostItem>> = postRepository.getPosts()
        .catch {
            Log.d("VIEW MODEL", "${it.message}")
        }.asLiveData()

}