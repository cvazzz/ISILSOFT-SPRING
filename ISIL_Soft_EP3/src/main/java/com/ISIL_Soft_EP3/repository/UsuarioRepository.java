package com.ISIL_Soft_EP3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ISIL_Soft_EP3.entity.Usuario;
import org.springframework.stereotype.Repository;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer>{
	Usuario findByCorreoAndPassword(String correo, String password);
}