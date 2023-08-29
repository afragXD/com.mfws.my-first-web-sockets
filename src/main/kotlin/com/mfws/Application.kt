package com.mfws

import com.mfws.models.Game
import com.mfws.plugins.*
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    val game = Game()
    configureSockets()
    configureSerialization()
    configureMonitoring()
    configureRouting(game)
}
