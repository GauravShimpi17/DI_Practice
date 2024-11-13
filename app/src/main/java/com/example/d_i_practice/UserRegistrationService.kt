package com.example.d_i_practice

import javax.inject.Inject
import javax.inject.Named

class UserRegistrationService @Inject constructor(
    private val userRepo: UserRepo,
    @MessageQualifier private val notificationService: NotificationService
) {
    fun registerUser(email : String, password: String){
        userRepo.saveUser(email,password)
        notificationService.send(email, "noreply@gmail.com", "User Registered")
    }
}