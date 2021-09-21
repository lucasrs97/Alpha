package br.com.alphaapi.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alphaapi.model.Usuario;
import br.com.alphaapi.repository.UsuarioRepository;

@RestController
@RequestMapping(value="/")
@CrossOrigin(origins="*")
public class UsuarioController {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@GetMapping("/login")
	public ResponseEntity<?> login(@RequestBody Usuario usuario) {
		
		Optional<Usuario> usuarioBanco = usuarioRepository.findById(usuario.getId());
		
		if(usuarioBanco.isPresent()) {
			if(usuario.getId() == usuarioBanco.get().getId()) {
				if(usuario.getSenha().equals(usuarioBanco.get().getSenha())) {
					return new ResponseEntity<>(usuarioBanco, HttpStatus.OK);
				}
				return new ResponseEntity<>("Login inválido.", HttpStatus.NOT_ACCEPTABLE);
			} else {
				return new ResponseEntity<>("Login inválido.", HttpStatus.NOT_ACCEPTABLE);
			}
		} else {
			return new ResponseEntity<>("Login inválido.", HttpStatus.NOT_ACCEPTABLE);
		}
		
	}

}