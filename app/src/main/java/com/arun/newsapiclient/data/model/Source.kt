package com.arun.newsapiclient.data.model


import com.google.gson.annotations.SerializedName

data class Source(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)