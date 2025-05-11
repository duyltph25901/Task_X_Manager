package com.note.todo.task.x.managger.presentation.login.database.database.repository

import com.note.todo.task.x.managger.presentation.login.database.database.dao.UserDao
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepository @Inject constructor(
    private val dao: UserDao
) {
}