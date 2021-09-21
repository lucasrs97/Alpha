package br.com.alphaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alphaapi.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	Usuario findById(long id);
	
	Usuario findByLogin(String email);
	
}
