package com.noor.core.models

data class LibraryItem(
    val id: String,
    val userId: String,
    val title: String,
    val type: String,
    val filePath: String?,
    val thumbnail: String?,
    val category: String?,
    val tags: List<String>,
    val createdAt: Long
)
