package io.spitefulgoat.fasttypefixes

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform