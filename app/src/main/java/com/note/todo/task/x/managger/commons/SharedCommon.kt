package com.note.todo.task.x.managger.commons

import android.content.Context
import android.content.SharedPreferences
import com.note.todo.task.x.managger.commons.AppConst.KEY_PREF_IS_FIRST_INSTALL

object SharedCommon {
    private const val PREFERENCES_NAME = "MANAGER_X"
    private var sharePref: SharedPreferences? = null

    fun init(context: Context) {
        if (sharePref == null) {
            sharePref = context.getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE)
        }
    }

    fun setValue(keyName: String, value: Any?) {
        val editor = sharePref?.edit()
        when (value) {
            is Int -> editor?.putInt(keyName, value)
            is Float -> editor?.putFloat(keyName, value)
            is Long -> editor?.putLong(keyName, value)
            is Boolean -> editor?.putBoolean(keyName, value)
            is String -> editor?.putString(keyName, value)
        }
        editor?.apply()
    }

    fun <T> getValue(keyName: String, defaultValue: T): T = when (defaultValue) {
        is Int -> (sharePref?.getInt(keyName, defaultValue) ?: defaultValue) as T
        is Long -> (sharePref?.getLong(keyName, defaultValue) ?: defaultValue) as T
        is Float -> (sharePref?.getFloat(keyName, defaultValue) ?: defaultValue) as T
        is Boolean -> (sharePref?.getBoolean(keyName, defaultValue) ?: defaultValue) as T
        is String -> (sharePref?.getString(keyName, defaultValue) ?: defaultValue) as T
        else -> defaultValue
    }

    var isFirstInstall: Boolean
        get() = getValue(KEY_PREF_IS_FIRST_INSTALL, true)
        set(value) = setValue(KEY_PREF_IS_FIRST_INSTALL, value)
}