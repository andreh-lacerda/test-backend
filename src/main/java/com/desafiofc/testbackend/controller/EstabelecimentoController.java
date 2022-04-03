package com.desafiofc.testbackend.controller;

import java.util.List;

import com.desafiofc.testbackend.model.Estabelecimento;
import com.desafiofc.testbackend.repository.EstabelecimentoRepository;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/estabelecimento")
@AllArgsConstructor
public class EstabelecimentoController {

    private EstabelecimentoRepository estabelecimentoRepository;

    @PostMapping("/salvar")
    public void cadastraEstabelecimento(@RequestBody Estabelecimento estabelecimento) {
        estabelecimentoRepository.save(estabelecimento);
    }

    @RequestMapping(value="/busca/{id}")
    public ResponseEntity<List<Estabelecimento>> buscaEstabelecimentoPeloId(@PathVariable("id") Long id) {
        List<Estabelecimento> estabelecimentos = estabelecimentoRepository.findAllByIdEstabelecimento(id);
        return new ResponseEntity<>(estabelecimentos, HttpStatus.OK);
    }

    @GetMapping("/todos")
    public ResponseEntity<List<Estabelecimento>> buscaTodosEstabelecimentos(){
        List<Estabelecimento> estabelecimentos = estabelecimentoRepository.findAll();
        return new ResponseEntity<>(estabelecimentos, HttpStatus.OK);
    }

    
    
}
