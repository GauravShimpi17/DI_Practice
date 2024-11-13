package com.example.d_i_practice

import android.util.Log
import javax.inject.Inject

interface UserRepo{
    fun saveUser(email: String, password: String)
}

class SQLRepository @Inject constructor() : UserRepo{
    override fun saveUser(email : String, password : String){
        Log.d("Demo", "User Saved - Local")
    }
}

class FirebaseRepository @Inject constructor() : UserRepo{
    override fun saveUser(email : String, password : String){
        Log.d("Demo", "User Saved - firebase")
    }
}