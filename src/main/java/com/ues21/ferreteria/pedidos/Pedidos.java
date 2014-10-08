package com.ues21.ferreteria.pedidos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ues21.ferreteria.usuarios.Usuarios;

@Entity
@Table(name = "Pedidos")
public class Pedidos {
	
	private int id_pedido;
	private String tipo;
	private Usuarios id_usuario;
	private String estado;
	private String fecha_abierto;
	private String fecha_vencimiento;
	private String fecha_entrega;
	
	@Id	@GeneratedValue
	public int getId_pedido() {
		return id_pedido;
	}
	public void setId_pedido(int id_pedido) {
		this.id_pedido = id_pedido;
	}
	@Column(name="tipo")
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@ManyToOne//(cascade = {CascadeType.ALL})
	@JoinColumn(name="id_usuario")
	public Usuarios getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(Usuarios id_usuario) {
		this.id_usuario = id_usuario;
	}
	@Column(name="estado")
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Column(name="fecha_abierto")
	public String getFecha_abierto() {
		return fecha_abierto;
	}
	public void setFecha_abierto(String fecha_abierto) {
		this.fecha_abierto = fecha_abierto;
	}
	@Column(name="fecha_vencimiento")
	public String getFecha_vencimiento() {
		return fecha_vencimiento;
	}
	public void setFecha_vencimiento(String fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}
	@Column(name="fecha_entrega")
	public String getFecha_entrega() {
		return fecha_entrega;
	}
	public void setFecha_entrega(String fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}
}
