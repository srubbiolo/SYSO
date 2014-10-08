package com.ues21.ferreteria.marca;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
}
