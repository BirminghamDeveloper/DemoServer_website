package com.example

import io.ktor.server.application.*
import io.ktor.server.response.respondText
import io.ktor.server.routing.routing
import io.ktor.server.routing.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureRouting()
}

fun Application.module2(){
    routing {
        get("/book") {
            call.respondText("Hello, Books Sections")
        }
    }
}