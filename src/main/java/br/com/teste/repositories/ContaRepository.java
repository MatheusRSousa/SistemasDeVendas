package br.com.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.teste.models.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long>{

}
