package com.noor.core.database.entity

data class UserEntity(
    val id: String,
    val username: String,
    val email: String,
    val avatar: String?,
    val createdAt: Long,
    val updatedAt: Long
)
