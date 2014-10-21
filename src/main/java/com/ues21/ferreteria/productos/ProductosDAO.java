package com.ues21.ferreteria.productos;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ues21.ferreteria.marca.Marcas;

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
	 public Productos agregarProducto(Productos producto){
		 
			Session session = sessionFactory.getCurrentSession();
			 /*
			 List marcas = session.createQuery("from Marcas").list();
			 int id_marca = 3;
			 for(Iterator<Marcas> i = marcas.iterator(); i.hasNext(); ) {
				    Marcas marca = i.next();
				    if (producto.getMarca().getId_marca() == marca.getId_marca())
				    {
				    	id_marca = producto.getMarca().getId_marca();
				    }
				}
			 */
			 Marcas marca = producto.getMarca();
			 int id_marca = marca.getId_marca();
			
			 String sql = "INSERT INTO Productos(nombre, descripcion, id_marca, precio, stock) VALUES('"+producto.getNombre()+"','"+producto.getDescripcion()+"',"+id_marca+","+producto.getPrecio()+","+producto.getStock()+")";
			 
			 Query query = (Query)session.createSQLQuery(sql);
			 query.executeUpdate();
			 //session.save(user);
			 return producto;
	 } 
}

