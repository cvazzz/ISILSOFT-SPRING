package com.ISIL_Soft_EP3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ISIL_Soft_EP3.entity.JefeTienda;

@Repository
public interface JefeTiendaRepository extends JpaRepository<JefeTienda,Integer>{
	List<JefeTienda> findAll();
	void deleteById(int idJefeTienda);
	JefeTienda findById(int idJefeTienda);
}
