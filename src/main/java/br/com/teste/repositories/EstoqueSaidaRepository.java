package br.com.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.teste.models.EstoqueSaida;

@Repository
public interface EstoqueSaidaRepository extends JpaRepository<EstoqueSaida, Long>{

}
