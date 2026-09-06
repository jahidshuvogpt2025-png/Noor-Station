package com.noor.core.database.dao

import com.noor.core.database.entity.UserEntity

interface UserDao {

    fun insert(user: UserEntity)

    fun getUser(id: String): UserEntity?

    fun delete(id: String)

}
