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

import br.com.alphaapi.model.Produto;
import br.com.alphaapi.repository.ProdutoRepository;

@RestController
@RequestMapping(value="/")
@CrossOrigin(origins="*")
public class ProdutoController {
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	@GetMapping("/produto")
	public List<Produto> listarProdutos() {
		return produtoRepository.findAll();
	}
	
	@PostMapping("/produto")
	public ResponseEntity<?> salvarProduto(@RequestBody Produto produto) {
		produtoRepository.save(produto);
		return new ResponseEntity<>(produto, HttpStatus.OK);
	}

}
