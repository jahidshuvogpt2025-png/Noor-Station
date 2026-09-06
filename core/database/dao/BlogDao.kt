package com.noor.core.database.dao

import com.noor.core.database.entity.BlogEntity

interface BlogDao {

    fun insert(post: BlogEntity)

    fun getPost(id: String): BlogEntity?

    fun getUserPosts(userId: String): List<BlogEntity>

    fun update(post: BlogEntity)

    fun delete(id: String)

}

