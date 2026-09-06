package com.noor.core.database.dao

import com.noor.core.database.entity.VaultEntity

interface VaultDao {

    fun insert(item: VaultEntity)

    fun getItem(id: String): VaultEntity?

    fun getUserVault(userId: String): List<VaultEntity>

    fun update(item: VaultEntity)

    fun delete(id: String)

}
