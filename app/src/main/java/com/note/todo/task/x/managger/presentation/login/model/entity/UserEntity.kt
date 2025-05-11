package com.note.todo.task.x.managger.presentation.login.model.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.note.todo.task.x.managger.commons.AppConst.TABLE_USER_NAME

@Entity(tableName = TABLE_USER_NAME)
data class UserEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0L,
    var userName: String = "",
    var password: String = "",
    var createdAt: Long = System.currentTimeMillis(),
    var updatedAt: Long = createdAt
) {
}