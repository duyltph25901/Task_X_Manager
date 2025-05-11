package com.note.todo.task.x.managger.presentation.login.di

import com.note.todo.task.x.managger.database.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object LoginModule {
    @Provides
    @Singleton
    fun provideUserDao( appDb: AppDatabase) =
        appDb.userDao()

}