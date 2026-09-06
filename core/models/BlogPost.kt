package com.noor.core.models

data class BlogPost(
    val id: String,
    val userId: String,
    val title: String,
    val content: String,
    val coverImage: String?,
    val category: String?,
    val likes: Int,
    val comments: Int,
    val createdAt: Long
)
