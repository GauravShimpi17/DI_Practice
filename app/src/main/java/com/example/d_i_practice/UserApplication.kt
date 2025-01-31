package com.example.d_i_practice

import android.app.Application

class UserApplication : Application() {
    lateinit var userRegistrationComponent: UserRegistrationComponent
    override fun onCreate() {
        super.onCreate()
        userRegistrationComponent = DaggerUserRegistrationComponent.factory().create(3)
    }
}