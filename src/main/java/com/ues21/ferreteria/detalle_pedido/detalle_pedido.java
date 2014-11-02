package com.ues21.ferreteria.detalle_pedido;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ues21.ferreteria.pedidos.Pedidos;
import com.ues21.ferreteria.productos.Productos;

@SuppressWarnings("serial")
@Entity
@Table(name = "detalle_pedido")
public class detalle_pedido implements Serializable {

	private Pedidos id_pedido;
	private Productos id_producto;
	private int cantidad;
	
	@ManyToOne//(cascade = {CascadeType.ALL})
	@JoinColumn(name="id_pedido")
	@Id
	public Pedidos getId_pedido() {
		return id_pedido;
	}
	public void setId_pedido(Pedidos id_pedido) {
		this.id_pedido = id_pedido;
	}
	@ManyToOne//(cascade = {CascadeType.ALL})
	@JoinColumn(name="id_producto")
	@Id
	public Productos getId_producto() {
		return id_producto;
	}
	public void setId_producto(Productos id_producto) {
		this.id_producto = id_producto;
	}
	@Column(name="cantidad")
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}