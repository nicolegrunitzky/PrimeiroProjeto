package com.example.atividadesspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PalindromoController {
    //atividade4
    @GetMapping("palindromo/{palavra}")
    public String verificarPalindromo(@PathVariable String palavra){
        String palavraInvertida = "";
        for (int i = palavra.length()-1; i>=0; i--) {
            palavraInvertida += palavra.charAt(i);
        }
            if (palavra.equals(palavraInvertida)) {
                return "É um palíndromo";
            } else {
                return "Não é um palíndromo";
            }
        }
    }
