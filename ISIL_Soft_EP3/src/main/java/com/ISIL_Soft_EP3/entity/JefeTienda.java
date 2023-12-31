package com.ISIL_Soft_EP3.entity;

import javax.persistence.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Table(name="JefeTienda")
public class JefeTienda {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idJefeTienda")
	private int idJefeTienda;
	
	@Column(name="nombre")
	private String nombre;

	@Column(name="apellido_paterno")
	private String apellidoPaterno;
	
	@Column(name="apellido_materno")
	private String apellidoMaterno;
	
	@Column(name="dni")
	private String dni;

	public int getIdJefeTienda() {
		return idJefeTienda;
	}

	public void setIdJefeTienda(int idJefeTienda) {
		this.idJefeTienda = idJefeTienda;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

    // Constructor(s), getter(s), setter(s), y otros métodos según sea necesario

}
