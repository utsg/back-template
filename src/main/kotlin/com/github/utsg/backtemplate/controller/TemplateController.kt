package com.github.utsg.backtemplate.controller

import com.github.utsg.backtemplate.configuration.TemplateConfiguration
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TemplateController(private val configuration: TemplateConfiguration) {
    @GetMapping("/")
    fun getHello() : String {
        return "Hello! " + configuration.podName
    }
}