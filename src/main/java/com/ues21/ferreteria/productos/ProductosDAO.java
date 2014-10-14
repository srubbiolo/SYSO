package com.ues21.ferreteria.productos;

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
			 List permisos = session.createQuery("from Permisos").list();
			 int id_permiso = 3;
			 for(Iterator<Permisos> i = permisos.iterator(); i.hasNext(); ) {
				    Permisos permiso = i.next();
				    if (permiso.getTipo() == user.getTipo().substring(0,3))
				    {
				    	id_permiso = permiso.getIdPermiso();
				    }
				}
			*/
			 String sql = "INSERT INTO Productos(nombre, descripcion, id_marca, precio, stock) VALUES('"+producto.getNombre()+"','"+producto.getDescripcion()+"',"+producto.getMarca()+","+producto.getPrecio()+","+producto.getStock()+")";
			 
			 Query query = (Query)session.createSQLQuery(sql);
			 query.executeUpdate();
			 //session.save(user);
			 return producto;
	 } 
}

