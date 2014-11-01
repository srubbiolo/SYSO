package com.ues21.ferreteria.productos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ues21.ferreteria.marca.Marcas;

@Entity
@Table(name = "Productos")
public class Productos {

	private int id_producto;
	private String nombre;
	private String descripcion;
	private Marcas id_marca;
	private double precio;
	private int stock;
		
	@Id @GeneratedValue
	public int getId_producto() {
		return id_producto;
	}
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	
	@Column(name = "nombre")
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Column(name = "descripcion")
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	@ManyToOne//(cascade = {CascadeType.ALL})
	@JoinColumn(name="id_marca")
	public Marcas getMarca() {
		return id_marca;
	}
	public void setMarca(Marcas marca) {
		this.id_marca = marca;
	}
	
	public void setMarca(String nombre){
		this.id_marca = new Marcas(nombre);
	}
	
	@Column(name = "precio")
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	@Column(name = "stock")
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
}