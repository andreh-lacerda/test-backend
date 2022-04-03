package com.desafiofc.testbackend.controller;

import com.desafiofc.testbackend.model.Veiculo;
import com.desafiofc.testbackend.repository.VeiculoRepository;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/veiculo")
@AllArgsConstructor
public class VeiculoController {

    private VeiculoRepository veiculoRepository;

    @RequestMapping(value="/placa/{placa}")
    public ResponseEntity<Veiculo> buscaEstabelecimentoPeloId(@PathVariable("placa") String placa){
        Veiculo veiculo = veiculoRepository.findByPlaca(placa);
        return new ResponseEntity<>(veiculo, HttpStatus.OK);
    }
    
    @PostMapping("/salvar")
    public void cadastraVeiculo(@RequestBody Veiculo veiculo) {
        this.veiculoRepository.save(veiculo);
    }
}
