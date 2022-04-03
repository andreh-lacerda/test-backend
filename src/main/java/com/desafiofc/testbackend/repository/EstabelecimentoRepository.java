package com.desafiofc.testbackend.repository;

import java.util.List;

import com.desafiofc.testbackend.model.Estabelecimento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, Long> {
    List<Estabelecimento> findAllByIdEstabelecimento(@Param("id") Long id);
}
