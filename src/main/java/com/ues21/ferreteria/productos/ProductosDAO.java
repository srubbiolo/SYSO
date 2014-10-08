package com.ues21.ferreteria.productos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
}

