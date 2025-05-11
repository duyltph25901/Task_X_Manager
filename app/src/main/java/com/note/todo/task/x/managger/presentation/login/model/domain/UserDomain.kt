package com.note.todo.task.x.managger.presentation.login.model.domain

data class UserDomain(
    var userName: String = "",
    var password: String = "",
    var confirmPassword: String = ""
) {

    fun isUserNameIsValid() =
        userName.length >= 2

    fun isPasswordIsValid() =
        password.length >= 6

    fun isMatchesPassword() =
        password == confirmPassword

}