package com.noor.core.database.entity

data class ProfileEntity(
    val id: String,
    val userId: String,
    val name: String,
    val bio: String,
    val photo: String?,
    val cvHtml: String?,
    val skills: String,
    val education: String,
    val experience: String
)
