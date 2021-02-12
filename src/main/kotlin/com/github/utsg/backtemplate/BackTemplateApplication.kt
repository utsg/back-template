package com.github.utsg.backtemplate

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BackTemplateApplication

fun main(args: Array<String>) {
	runApplication<BackTemplateApplication>(*args)
}
