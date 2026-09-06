package com.noor.core.database.dao

import com.noor.core.database.entity.LibraryEntity

interface LibraryDao {

    fun insert(item: LibraryEntity)

    fun getItem(id: String): LibraryEntity?

    fun getUserLibrary(userId: String): List<LibraryEntity>

    fun update(item: LibraryEntity)

    fun delete(id: String)

}
