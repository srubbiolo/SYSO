package com.ues21.ferreteria.usuarios;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ues21.ferreteria.permisos.Permisos;

@Repository
@SuppressWarnings({"unchecked", "rawtypes"})

public class UsuariosDAO {
	@Autowired private SessionFactory sessionFactory;	   
	  /**
	   * @Transactional annotation below will trigger Spring Hibernate transaction manager to automatically create
	   * a hibernate session. See src/main/webapp/WEB-INF/servlet-context.xml
	   */
	 @Transactional
	public List<Usuarios> listaUsuarios(){
		 Session session = sessionFactory.getCurrentSession();
		 List usuarios = session.createQuery("from Usuarios").list();
		 
		 return usuarios;
	 }
	 
	 @Transactional
	 public Usuarios agregarUsuario(Usuarios user){
		 
			 Session session = sessionFactory.getCurrentSession();
			 
			 List permisos = session.createQuery("from Permisos").list();
			 int id_permiso = 3;
			 for(Iterator<Permisos> i = permisos.iterator(); i.hasNext(); ) {
				    Permisos permiso = i.next();
				    if (permiso.getTipo() == user.getTipo().substring(0,3))
				    {
				    	id_permiso = permiso.getIdPermiso();
				    }
				}
			 String sql = "INSERT INTO Usuarios(dni, email, contraseña, tipo, id_permiso) VALUES("+user.getDni()+",'"+user.getEmail()+"','"+user.getContrasena()+"','"+user.getTipo().substring(0,3)+"',"+id_permiso+")";
			 
			 Query query = (Query)session.createSQLQuery(sql);
			 query.executeUpdate();
			 //session.save(user);
			 return user;
	 }

}
