package com.noor.core.models

data class Workspace(
    val id: String,
    val userId: String,
    val layoutData: String,
    val theme: String?,
    val settings: String?
)
