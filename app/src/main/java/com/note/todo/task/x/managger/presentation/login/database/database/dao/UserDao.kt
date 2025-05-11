package com.note.todo.task.x.managger.presentation.login.database.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.note.todo.task.x.managger.presentation.login.model.entity.UserEntity

@Dao
interface UserDao {

    @Insert(entity = UserEntity::class, onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveRecordUser(entity: UserEntity)

    @Query("select * from user_entity where userName like :userName and password like :password limit 1")
    suspend fun searchUserByAccount(
        userName: String,
        password: String
    ): UserEntity?

    @Update(entity = UserEntity::class, onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateRecordUser(entity: UserEntity)

    @Delete(entity = UserEntity::class)
    suspend fun deleteRecordUser(entity: UserEntity)

}