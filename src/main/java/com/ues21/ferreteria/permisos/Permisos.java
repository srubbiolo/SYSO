package com.ues21.ferreteria.permisos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Permisos")
public class Permisos {
	
	private int id_permiso;
	private String tipo;
	private String descripcion;
	
	@Column(name = "id_permiso")
	@Id @GeneratedValue
	public int getIdPermiso() {
		return id_permiso;
	}
	public void setIdPermiso(int id_permiso) {
		this.id_permiso = id_permiso;
	}
	
	@Column(name = "tipo")
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Column(name = "descripcion")
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
