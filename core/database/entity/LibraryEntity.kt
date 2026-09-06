package com.noor.core.database.entity

data class LibraryEntity(
    val id: String,
    val userId: String,
    val title: String,
    val type: String,
    val filePath: String?,
    val thumbnail: String?,
    val category: String?,
    val tags: String,
    val createdAt: Long
)
