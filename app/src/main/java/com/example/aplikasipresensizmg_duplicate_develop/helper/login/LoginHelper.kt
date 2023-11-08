package com.example.aplikasipresensizmg_duplicate_develop.helper.login

import com.example.aplikasipresensizmg_duplicate_develop.helper.sharedpreferences.SharedPreferencesHelper

class LoginHelper {
    companion object {
        fun checkLogin(): Boolean {
            //check apakah shared
            return SharedPreferencesHelper.prefs.contains(SharedPreferencesHelper.ACCESS_TOKEN)
        }
    }
}