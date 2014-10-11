package com.ues21.ferreteria.login;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ues21.ferreteria.usuarios.Usuarios;

@Repository
@SuppressWarnings({"unchecked", "rawtypes"})

public class LoginDAO {
	@Autowired private SessionFactory sessionFactory;	
	  /**
	   * @Transactional annotation below will trigger Spring Hibernate transaction manager to automatically create
	   * a hibernate session. See src/main/webapp/WEB-INF/servlet-context.xml
	   */  

	@Transactional
	 public Login verificarUsuario(Login user){ 
		 
		 Session session = sessionFactory.getCurrentSession();
			 
			 List usuarios = session.createQuery("from Usuarios").list();
			 
			 if(user==null)return null;
			 
			 for(Iterator<Usuarios> i = usuarios.iterator(); i.hasNext(); ) {
				    Usuarios usuario = i.next();
				    if (user.getDni() == usuario.getDni() && user.getContrasena().equalsIgnoreCase(usuario.getContrasena()))
				    {
				    	return user;
				    }
				}
			 
			 return null;
	 }
	
}
