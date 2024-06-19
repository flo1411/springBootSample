package com.example.mdw.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MdwController {
    @GetMapping
    fun index(): String {
        return "Hello World!"
    }
}