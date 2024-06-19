package com.example.mdw.controller

import com.example.mdw.model.PokemonResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.getForObject

@RestController
class PokemonController {

    var restTemplate: RestTemplate = RestTemplate()

    private val url = "https://pokeapi.co/api/v2/pokemon"
/*
    @GetMapping("/pokemon")
    fun getPokemon(): PokemonResponse? {
        val result: PokemonResponse? = restTemplate.getForObject(url, PokemonResponse::class.java)
        return result
    }

 */

    @GetMapping("/pokemon")
    fun getPokemonString(): String? {
        return restTemplate.getForObject(url, String::class.java)
    }
}