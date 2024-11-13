package com.example.d_i_practice

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService : UserRegistrationService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val component =  Dagg
        val component = (application as UserApplication).userRegistrationComponent
//            .notificationServiceModule(NotificationServiceModule(3))
//            .build()
        component.inject(this)
        userRegistrationService.registerUser("abc@gmil.com", "11111")
    }
}