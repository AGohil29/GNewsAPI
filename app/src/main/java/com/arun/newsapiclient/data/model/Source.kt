package com.arun.newsapiclient.data.model


import com.google.gson.annotations.SerializedName

data class Source(
    @SerializedName("name")
    val name: String,
    @SerializedName("nurlame")
    val url: String
)