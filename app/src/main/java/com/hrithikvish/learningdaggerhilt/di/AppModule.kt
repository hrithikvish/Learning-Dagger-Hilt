package com.hrithikvish.learningdaggerhilt.di

import com.hrithikvish.learningdaggerhilt.api.PostApiService
import com.hrithikvish.learningdaggerhilt.util.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun getRetrofitInstance():Retrofit =
        Retrofit.Builder()
            .baseUrl(Constants.BASE_POST_API_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    @Provides
    fun getPostApiService(retrofit: Retrofit):PostApiService =
        retrofit.create(PostApiService::class.java)

}