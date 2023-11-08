package com.example.aplikasipresensizmg_duplicate_develop.model

class LoginModel {
    var status: Int = 0
     var message: String = ""
     var access_token: String = ""
     var token_type: String = ""
     lateinit var user : UserModel
}