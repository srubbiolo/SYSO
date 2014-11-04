package com.ues21.ferreteria.productos;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ues21.ferreteria.marca.Marcas;
import com.ues21.ferreteria.usuarios.Usuarios;

@Repository
public class ProductosDAO {
	
	@Autowired private SessionFactory sessionFactory;
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Productos> listaProductos(){
		 Session session = sessionFactory.getCurrentSession();
		 @SuppressWarnings("rawtypes")
		 List productos = session.createQuery("from Productos").list();
		 
		 return productos;
	 }
	
	@Transactional
	public List<Productos> listaProductos(String nombre){
		 Session session = sessionFactory.getCurrentSession();
		 @SuppressWarnings("rawtypes")
		 List resultProductos = session.createQuery("from Productos where nombre = '"+nombre+"'").list();
		 
		 return resultProductos;
	 }
	
	@Transactional
	public Productos getProducto(int id_producto){
		 Session session = sessionFactory.getCurrentSession();
		 @SuppressWarnings("rawtypes")
		 List resultProductos = session.createQuery("from Productos where id_producto= '"+id_producto+"'").list();
		 
		 for(Iterator<Productos> i = resultProductos.iterator(); i.hasNext(); ) {
			    Productos producto = i.next();
			    if (producto.getId_producto() == id_producto)
			    {
			    	return producto;
			    }
			}
		 return null;
	 }
	
	 @Transactional
	 public String agregarProducto(Productos producto){
		 			
		 String ret="";
			
			try {
				Session session = sessionFactory.getCurrentSession();
				session.save(producto);
				ret="success";
			} catch (Exception e) {
				ret="failed";
			} 
			
			return ret;
	 }
}

