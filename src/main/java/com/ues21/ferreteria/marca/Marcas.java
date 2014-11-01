package com.ues21.ferreteria.marca;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Marcas")
public class Marcas {
	
	@Id @GeneratedValue private int id_marca;
	private String nombre;
	private String tel_contacto;
	private String email_contacto;
	
	public Marcas(){
		this.id_marca = 0;
		this.nombre = "";
		this.tel_contacto = "";
		this.email_contacto = "";		
	}
	
	public Marcas(String nombre){
		this.id_marca = 0;
		this.nombre = nombre;
		this.tel_contacto = "";
		this.email_contacto = "";
	}
	
	public Marcas(int id_marca, String nombre, String tel_contacto, String email_contacto){
		this.id_marca = id_marca;
		this.nombre = nombre;
		this.tel_contacto = tel_contacto;
		this.email_contacto = email_contacto;		
	}
	
	@Column (name = "id_marca")
	public int getId_marca() {
		return id_marca;
	}
	public void setId_marca(int id_marca) {
		this.id_marca = id_marca;
	}
	@Column (name = "nombre_marca")
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Column (name = "telefono")
	public String getTelefono() {
		return tel_contacto;
	}
	public void setTelefono(String tel_contacto) {
		this.tel_contacto = tel_contacto;
	}
	@Column (name = "email")
	public String getEmail() {
		return email_contacto;
	}
	public void setEmail(String email_contacto) {
		this.email_contacto = email_contacto;
	}

}
