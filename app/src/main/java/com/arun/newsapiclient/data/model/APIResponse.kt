package com.arun.newsapiclient.data.model


import com.google.gson.annotations.SerializedName

data class APIResponse(
    @SerializedName("articles")
    val articles: List<Article>,
    @SerializedName("totalArticles")
    val totalResults: Int
)