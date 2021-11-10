package com.example.android.dagger.login

import com.example.android.dagger.di.ActivityScope
import com.example.android.dagger.di.AppSubComponents
import com.example.android.dagger.di.StorageModule
import dagger.Component
import dagger.Subcomponent
import javax.inject.Singleton

@ActivityScope
@Subcomponent
interface LoginComponent {
    @Subcomponent.Factory
    interface Factory{
        fun create(): LoginComponent
    }

    fun inject(activity: LoginActivity)
}