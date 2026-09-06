package com.noor.core.database.entity

data class WorkspaceEntity(
    val id: String,
    val userId: String,
    val layoutData: String,
    val theme: String?,
    val settings: String?
)
