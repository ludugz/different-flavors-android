package com.example.differentflavorspractice.di

import com.example.differentflavorspractice.helpers.CHTitleTextStrategy
import com.example.differentflavorspractice.helpers.TitleTextStrategy
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object CountrySpecificModule {
    @Provides
    fun provideTitleTextStrategy(): TitleTextStrategy {
        return CHTitleTextStrategy()
    }
}