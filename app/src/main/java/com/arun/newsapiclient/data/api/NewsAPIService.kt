package com.arun.newsapiclient.data.api

import com.arun.newsapiclient.data.model.APIResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPIService {
  @GET("v4/top-headlines")
  suspend fun getTopHeadlines(
      @Query("country")
      country:String,
      @Query("page")
      page:Int,
      @Query("lang")
      lang:String = "en",
      @Query("token")
      apiKey:String = "1d5a3bbe914759816a53189bbf78f55b"
  ): Response<APIResponse>

    @GET("v4/search")
    suspend fun getSearchedTopHeadlines(
        @Query("country")
        country:String,
        @Query("q")
        searchQuery:String,
        @Query("page")
        page:Int,
        @Query("lang")
        lang:String = "en",
        @Query("token")
        apiKey:String = "1d5a3bbe914759816a53189bbf78f55b"
    ): Response<APIResponse>

}