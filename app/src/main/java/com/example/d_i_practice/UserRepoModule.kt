package com.example.d_i_practice

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class UserRepoModule {

//    @Named("firebase")
    @Provides
    fun getFirebaseRepo(): UserRepo{
        return FirebaseRepository()
    }
}