package com.noor.core.models

data class VaultItem(
    val id: String,
    val userId: String,
    val encryptedData: String,
    val fileReference: String?,
    val securityLevel: String,
    val createdAt: Long
)
