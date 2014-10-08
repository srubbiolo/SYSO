package com.ues21.ferreteria.usuarios;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
			 //session.createQuery("INSERT INTO Usuarios (dni, email, contraseña, tipo) VALUES ('"+user.getDni()+"','"+user.getEmail()+"','"+user.getContraseña()+"','"+user.getTipo()+"');");
			 
			 //session.createQuery("INSERT INTO Usuarios (dni, email, contraseña, tipo)" + "select stock_code, stock_name from backup_stock");
			 String sql = "INSERT INTO Usuarios(dni, email, contraseña, tipo, id_permiso) VALUES(18845885,'ivanbailetti@hotmail.com','holamundo','adm', 1)";
			 Query query = (Query)session.createSQLQuery(sql);
			 query.executeUpdate();
			 //session.save(user);
			 return user;
	 }

}
