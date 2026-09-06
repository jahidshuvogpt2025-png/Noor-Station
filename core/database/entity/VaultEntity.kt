package com.noor.core.database.entity

data class VaultEntity(
    val id: String,
    val userId: String,
    val encryptedData: String,
    val fileReference: String?,
    val securityLevel: String,
    val createdAt: Long
)
