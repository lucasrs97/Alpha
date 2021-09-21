package br.com.alphaapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alphaapi.model.ItemPedido;
import br.com.alphaapi.repository.ItemPedidoRepository;

@RestController
@RequestMapping(value="/")
@CrossOrigin(origins="*")
public class ItemPedidoController {
	
	@Autowired
	ItemPedidoRepository itemPedidoRepository;
	
	@GetMapping("/item-pedido")
	public List<ItemPedido> listarItensPedido() {
		return itemPedidoRepository.findAll();
	}
	
	@PostMapping("/item-pedido")
	public ResponseEntity<?> salvarItemPedido(@RequestBody ItemPedido itemPedido) {
		itemPedidoRepository.save(itemPedido);
		return new ResponseEntity<>(itemPedido, HttpStatus.OK);
	}

}
