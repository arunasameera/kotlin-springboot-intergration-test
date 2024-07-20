package com.kotlinspring.controller

import com.kotlinspring.service.GreetingService
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import mu.KLogging

@RestController
@RequestMapping("/v1/greetings")
class GreetingController (val greetingService: GreetingService){

    companion object : KLogging()

    @GetMapping("/{name}")
    fun retriveGreeting(@PathVariable("name")name: String): String {
        logger.info("Name is $name");
        return greetingService.retriveGreeting(name);

    }

}