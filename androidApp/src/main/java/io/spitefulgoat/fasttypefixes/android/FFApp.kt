package io.spitefulgoat.fasttypefixes.android

import android.app.Application
import io.spitefulgoat.fasttypefixes.startSharedKoin
import org.koin.android.ext.koin.androidContext

class FFApp : Application() {
    override fun onCreate() {
        super.onCreate()

        startSharedKoin {
            androidContext(this@FFApp)
            modules(dep)
        }
    }
}