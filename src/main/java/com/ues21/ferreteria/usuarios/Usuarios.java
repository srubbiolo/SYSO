package com.ues21.ferreteria.usuarios;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ues21.ferreteria.permisos.Permisos;

@Entity
@Table(name="Usuarios")
public class Usuarios {
	
	private int id_usuario;
	private int dni;
	private String email;
	private String contraseña;
	private String tipo;
	private Permisos id_permiso;
	
	@Id @GeneratedValue
	public int getId_Usuario() {
		return id_usuario;
	}
	public void setId_Usuario(int id) {
		this.id_usuario = id;
	}
	@Column (name = "dni")
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	@Column (name = "email")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Column (name = "contraseña")
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	@Column (name = "tipo")
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@ManyToOne
	@JoinColumn(name = "id_permiso")
	public Permisos getId_permiso() {
		return id_permiso;
	}
	public void setId_permiso(Permisos id_permiso) {
		this.id_permiso = id_permiso;
	}
	
}
