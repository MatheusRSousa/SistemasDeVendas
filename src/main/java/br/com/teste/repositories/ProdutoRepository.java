package br.com.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.teste.models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
