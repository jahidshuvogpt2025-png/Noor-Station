package com.noor.core.database.dao

import com.noor.core.database.entity.ProfileEntity

interface ProfileDao {

    fun insert(profile: ProfileEntity)

    fun getProfile(id: String): ProfileEntity?

    fun update(profile: ProfileEntity)

    fun delete(id: String)

}
