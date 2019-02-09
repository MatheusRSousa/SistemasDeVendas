package br.com.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.teste.models.EstoqueEntrada;

@Repository
public interface EstoqueEntradaRepository extends JpaRepository<EstoqueEntrada, Long>{

}
