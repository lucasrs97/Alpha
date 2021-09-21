package br.com.alphaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alphaapi.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
