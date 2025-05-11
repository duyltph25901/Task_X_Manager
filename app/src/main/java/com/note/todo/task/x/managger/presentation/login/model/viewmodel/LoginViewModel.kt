package com.note.todo.task.x.managger.presentation.login.model.viewmodel

import androidx.lifecycle.ViewModel
import com.note.todo.task.x.managger.presentation.login.database.database.repository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val userRepository: UserRepository
): ViewModel() {



}