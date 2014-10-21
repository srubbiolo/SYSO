package com.ues21.ferreteria.marca;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ues21.ferreteria.permisos.Permisos;
import com.ues21.ferreteria.usuarios.Usuarios;

@Repository
@SuppressWarnings({"unchecked", "rawtypes"})
public class MarcaDAO {

	 @Autowired private SessionFactory sessionFactory;	   
	  /**
	   * @Transactional annotation below will trigger Spring Hibernate transaction manager to automatically create
	   * a hibernate session. See src/main/webapp/WEB-INF/servlet-context.xml
	   */
	 @Transactional
	public List<Marcas> listaMarcas(){
		 Session session = sessionFactory.getCurrentSession();
		 List marcas = session.createQuery("from Marcas").list();
		 
		 return marcas;
	 }
	 
	 @Transactional
		public List<Marcas> listaMarcas(String nombre){
			 Session session = sessionFactory.getCurrentSession();
			 List marcas;
			 if (nombre == null || nombre == "" )
				 marcas = session.createQuery("from Marcas").list();
			 else
				 marcas = session.createQuery("from Marcas where nombre='"+nombre+"'").list();
			 
			 return marcas;
		 }
	 
	 @Transactional
		public Marcas getMarcaId(String nombre){
			 Session session = sessionFactory.getCurrentSession();
			 Marcas marca;
			 if (nombre == null || nombre == "" )
				 marca = null;
			 else
				 marca = (Marcas)session.createQuery("from Marcas where nombre='"+nombre+"'");
			 
			 return marca;
		 }
	 
	 @Transactional
	 public Marcas agregarMarca(Marcas marca){
		 
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
			 String sql = "INSERT INTO Marcas(nombre, tel_contacto, email_contacto) VALUES('"+marca.getNombre()+"','"+marca.getTelefono()+"','"+marca.getEmail()+"')";
			 
			 Query query = (Query)session.createSQLQuery(sql);
			 query.executeUpdate();
			 //session.save(user);
			 return marca;
	 } 
}
