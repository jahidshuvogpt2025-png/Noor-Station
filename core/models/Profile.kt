package com.noor.core.models

data class Profile(
    val id: String,
    val userId: String,
    val name: String,
    val bio: String,
    val photo: String?,
    val cvHtml: String?,
    val skills: List<String>,
    val education: List<String>,
    val experience: List<String>
)
