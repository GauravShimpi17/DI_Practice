package com.example.d_i_practice

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface NotificationService{
    fun send(to: String, from : String, body: String)
}

@Singleton
class EmailService @Inject constructor() : NotificationService{
    override fun send(to: String, from : String, body: String){
        Log.d("Demo", "Sent Successfully")
    }
}

class MessageService(private val retryCount : Int): NotificationService{
    override fun send(to: String, from : String, body: String){
        Log.d("Demo", "Message Sent Successfully - Retry Count $retryCount")
    }
}