package com.mfws.plugins

import com.mfws.models.Game
import com.mfws.socket
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting(game: Game) {
    routing {
        socket(game)
    }
}
