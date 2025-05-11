package com.note.todo.task.x.managger.commons

import android.util.Log

object Logger {
    fun logD(tag: String, msg: String) =
        Log.d(tag, msg)

    fun logE(tag: String, msg: String) =
        Log.e(tag, msg)
}