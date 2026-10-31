package dev.helmy.kairo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
