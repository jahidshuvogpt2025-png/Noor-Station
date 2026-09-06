package com.noor.core.database.dao

import com.noor.core.database.entity.WorkspaceEntity

interface WorkspaceDao {

    fun insert(workspace: WorkspaceEntity)

    fun getWorkspace(id: String): WorkspaceEntity?

    fun getUserWorkspace(userId: String): WorkspaceEntity?

    fun update(workspace: WorkspaceEntity)

    fun delete(id: String)

}
