package com.example.investments.crud.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/foos"])
class FooController {
    @GetMapping(value = ["/{id}"])
    fun findOne(@PathVariable id: Long?): String = "123123123123123"
}