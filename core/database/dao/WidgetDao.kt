package com.noor.core.database.dao

import com.noor.core.database.entity.WidgetEntity

interface WidgetDao {

    fun insert(widget: WidgetEntity)

    fun getWidget(id: String): WidgetEntity?

    fun getUserWidgets(userId: String): List<WidgetEntity>

    fun update(widget: WidgetEntity)

    fun delete(id: String)

}
