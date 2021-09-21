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

import br.com.alphaapi.model.Pedido;
import br.com.alphaapi.repository.PedidoRepository;

@RestController
@RequestMapping(value="/")
@CrossOrigin(origins="*")
public class PedidoController {
	
	@Autowired
	PedidoRepository pedidoRepository;
	
	@GetMapping("/pedido")
	public List<Pedido> listarPedidos() {
		return pedidoRepository.findAll();
	}
	
	@PostMapping("/pedido")
	public ResponseEntity<?> salvarPedido(@RequestBody Pedido pedido) {
		pedidoRepository.save(pedido);
		return new ResponseEntity<>(pedido, HttpStatus.OK);
	}

}
