package com.example.aplikasipresensizmg_duplicate_develop.helper

import android.content.Context
import android.content.Intent
import com.example.aplikasipresensizmg_duplicate_develop.TampilErrorActivity

class RedirectToTampilErrorActivity(context: Context, message:String, tag:String) {
    init {
        var i : Intent = Intent(context, TampilErrorActivity::class.java)
        i.putExtra("errorMessage",message)
        i.putExtra("tag",tag)
        context.startActivity(i)
    }
}