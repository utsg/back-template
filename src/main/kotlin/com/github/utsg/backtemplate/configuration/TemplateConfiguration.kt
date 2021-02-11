package com.github.utsg.backtemplate.configuration

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "back-template")
class TemplateConfiguration {
    var podName = ""
}