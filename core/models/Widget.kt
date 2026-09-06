package com.noor.core.models

data class Widget(
    val id: String,
    val userId: String,
    val type: String,
    val title: String,
    val thumbnail: String?,
    val positionX: Int,
    val positionY: Int,
    val width: Int,
    val height: Int,
    val theme: String?,
    val content: String?,
    val visibility: String
)
