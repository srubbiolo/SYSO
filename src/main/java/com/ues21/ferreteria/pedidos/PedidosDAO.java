package com.ues21.ferreteria.pedidos;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ues21.ferreteria.detalle_pedido.detalle_pedido;
import com.ues21.ferreteria.usuarios.Usuarios;

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

	 @Transactional
	public String crearPedido(Pedidos pedido) {
		 String ret="";
		 /*
			Session session = sessionFactory.getCurrentSession();
			session.save(pedido);
		*/
			
			try {
				Session session = sessionFactory.getCurrentSession();
				session.save(pedido);
				ret="success";
			} catch (Exception e) {
				ret="failed";
			} 
			
			/*
			String sql = "INSERT INTO Pedidos(tipo, id_usuario, estado, fecha_abierto, fecha_vencimiento, fecha_entrega) VALUES('"+pedido.getTipo()+"',"+pedido.getId_usuario()+",'"+pedido.getEstado()+"',"+pedido.getFecha_abierto()+","+pedido.getFecha_vencimiento()+","+pedido.getFecha_entrega()+")";
			 
			 Query query = (Query)session.createSQLQuery(sql);
			 query.executeUpdate();
			 */
			 //return marca;
		return ret;
	}
	 
	 @Transactional 
	 public Pedidos getPedido(int dni){
		 Session session = sessionFactory.getCurrentSession();
		 
		 List pedidos = session.createQuery("from Pedidos").list();
		 
		 for(Iterator<Pedidos> i = pedidos.iterator(); i.hasNext(); ) {
			    Pedidos pedido = i.next();
			    if (pedido.getId_usuario().getDni() == dni)
			    {
			    	return pedido;
			    }
			}
		 return null;
	 }

	 @Transactional
	public String asociarDetalle(detalle_pedido detalle) {
			
		 String ret="";
			
			try {
				Session session = sessionFactory.getCurrentSession();
				session.save(detalle);
				ret="success";
			} catch (Exception e) {
				ret="failed";
			} 
			
			return ret;
			
	} 
	 
}
