package com.ues21.ferreteria.pedidos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class PedidosDAO {

	 @Autowired private SessionFactory sessionFactory;
	 @SuppressWarnings("unchecked")
	 @Transactional
	public List<Pedidos> listaPedidos(){
		 Session session = sessionFactory.getCurrentSession();
		 @SuppressWarnings("rawtypes")
		 List pedidos = session.createQuery("from Pedidos").list();
		 
		 return pedidos;
	 }
	 
	 
}
