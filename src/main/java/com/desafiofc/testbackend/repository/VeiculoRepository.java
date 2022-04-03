package com.desafiofc.testbackend.repository;

import com.desafiofc.testbackend.model.Veiculo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
    Veiculo findByPlaca(@Param("placa") String placa);
}
