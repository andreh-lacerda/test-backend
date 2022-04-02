package com.desafiofc.testbackend.controller;

import java.util.List;

import com.desafiofc.testbackend.model.Estabelecimento;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cadastro-estabelecimento")
public class EstabelecimentoController {

    @GetMapping
    public List<Estabelecimento> lista() {
        return null;
    }
    
}
