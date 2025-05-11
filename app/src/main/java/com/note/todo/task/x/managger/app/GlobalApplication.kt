package com.note.todo.task.x.managger.app

import android.app.Application
import com.note.todo.task.x.managger.commons.SharedCommon
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class GlobalApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        SharedCommon.init(this)
    }
}