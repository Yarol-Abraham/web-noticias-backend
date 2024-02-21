package com.noticas.webnews.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.noticas.webnews.entity.UsuarioEntity;

@Repository
public interface UsuarioRepository  extends JpaRepository<UsuarioEntity, Integer>  {

	public Optional<UsuarioEntity> findByUsuario(String Usuario);
	
}
