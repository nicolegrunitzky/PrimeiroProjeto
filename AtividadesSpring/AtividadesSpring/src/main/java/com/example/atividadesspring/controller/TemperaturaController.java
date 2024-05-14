package com.example.atividadesspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemperaturaController {
    //atividade5
    @GetMapping("celsiusToF/{temperatura}")
    public String converterTemperatura(@PathVariable int temperatura){
        return (1.8 * temperatura + 32) + "";
    }
}
