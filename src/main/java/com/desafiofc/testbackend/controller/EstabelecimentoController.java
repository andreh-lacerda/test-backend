package com.desafiofc.testbackend.controller;

import java.util.List;
import java.util.Optional;

import com.desafiofc.testbackend.model.Estabelecimento;
import com.desafiofc.testbackend.repository.EstabelecimentoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/estabelecimento")
public class EstabelecimentoController {

    @Autowired
    private EstabelecimentoRepository estabelecimentoRepository;

    @PostMapping("/salvar")
    @ResponseStatus(HttpStatus.CREATED)
    public Estabelecimento cadastraEstabelecimento(@RequestBody Estabelecimento estabelecimento) {
        return estabelecimentoRepository.save(estabelecimento);//falta realizar validacao
    }

    @GetMapping(value="/busca/{id}")
    public ResponseEntity<Estabelecimento> buscaEstabelecimentoPeloId(@PathVariable("id") Long id) {
        Optional<Estabelecimento> estabelecimento = estabelecimentoRepository.findById(id);
        return new ResponseEntity<>(estabelecimento.get(), HttpStatus.OK);
    }

    @GetMapping("/todos")
    public ResponseEntity<List<Estabelecimento>> buscaTodosEstabelecimentos(){
        List<Estabelecimento> estabelecimentos = estabelecimentoRepository.findAll();
        return new ResponseEntity<>(estabelecimentos, HttpStatus.OK);
    }

    
    
}
