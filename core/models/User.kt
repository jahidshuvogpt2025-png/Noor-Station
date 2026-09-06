package com.noor.core.models

data class User(
    val id: String,
    val username: String,
    val email: String,
    val avatar: String?,
    val createdAt: Long,
    val updatedAt: Long
)
