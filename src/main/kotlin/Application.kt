package com.example

import io.ktor.server.application.*
import io.ktor.server.http.content.resource
import io.ktor.server.http.content.static
import io.ktor.server.response.respondText
import io.ktor.server.routing.routing
import io.ktor.server.routing.*
//import io.ktor.features.CallLogging

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureRouting()
}

fun Application.module2(){
//    install(CallLogging)
    routing {
        static{
            resource("facebook.html")
            resource("static/file.txt")
            resource("static/hani.jpeg")
        }
        get("/book") {
            call.respondText("Hello, Books Sections")
        }
    }
}