package com.example.springsecuritydemo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    @GetMapping("/")
    fun home(): String {
        return("<h1> Welcome Ivy </h1>")
    }
}