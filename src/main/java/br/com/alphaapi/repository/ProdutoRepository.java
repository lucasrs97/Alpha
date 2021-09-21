package br.com.alphaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alphaapi.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
