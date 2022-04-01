package com.desafiofc.testbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cadastro-estabelecimento")
public class CadastroEstabelecimentoController {

    @GetMapping
    public String teste() {
        return "teste ok";
    }
    
}
