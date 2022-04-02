package com.desafiofc.testbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class Estabelecimento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String cnpj;

    @Column(nullable = false)
    private Endereco endereco;

    @Column(nullable = false)
    private String telefone;

    @Column(nullable = false)
    private int vagasMotos;

    @Column(nullable = false)
    private int vagasCarros;
    
}
