package com.mfws

import com.mfws.models.Game
import io.ktor.server.routing.*
import io.ktor.server.websocket.*

fun Route.socket(game: Game){
    route("/play"){
        webSocket {
            
        }
    }
}