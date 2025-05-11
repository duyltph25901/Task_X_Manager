package com.note.todo.task.x.managger.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.note.todo.task.x.managger.commons.AppConst.DATABASE_VER
import com.note.todo.task.x.managger.presentation.login.database.database.dao.UserDao
import com.note.todo.task.x.managger.presentation.login.model.entity.UserEntity

@Database(
    entities = [
        UserEntity::class
    ],
    version = DATABASE_VER,
    exportSchema = false
)
abstract class AppDatabase: RoomDatabase() {
    abstract fun userDao(): UserDao
}