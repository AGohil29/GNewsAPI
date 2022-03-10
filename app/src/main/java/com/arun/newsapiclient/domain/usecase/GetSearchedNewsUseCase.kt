package com.arun.newsapiclient.domain.usecase

import com.arun.newsapiclient.data.model.APIResponse
import com.arun.newsapiclient.data.util.Resource
import com.arun.newsapiclient.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {
     suspend fun execute(country:String,searchQuery:String,page:Int): Resource<APIResponse>{
         return newsRepository.getSearchedNews(country,searchQuery,page)
     }
}