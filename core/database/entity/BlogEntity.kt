package com.noor.core.database.entity

data class BlogEntity(
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
