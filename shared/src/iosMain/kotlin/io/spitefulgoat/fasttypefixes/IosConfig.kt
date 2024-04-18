package io.spitefulgoat.fasttypefixes

import org.koin.core.context.startKoin

class IosConfig {
    fun koin() = apply {
        startKoin {
            modules(dependencies)
        }
    }

    fun build() {}
}