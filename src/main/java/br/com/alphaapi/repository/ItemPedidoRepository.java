package br.com.alphaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alphaapi.model.ItemPedido;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {

}
