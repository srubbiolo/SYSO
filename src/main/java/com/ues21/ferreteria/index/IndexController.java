package com.ues21.ferreteria.index;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ues21.ferreteria.detalle_pedido.detalle_pedido;
import com.ues21.ferreteria.pedidos.Pedidos;
import com.ues21.ferreteria.pedidos.PedidosDAO;
import com.ues21.ferreteria.productos.Productos;
import com.ues21.ferreteria.productos.ProductosDAO;
import com.ues21.ferreteria.usuarios.UsuariosDAO;

@Controller
public class IndexController  {
	
	@Autowired private ProductosDAO productosDAO;
	@Autowired private PedidosDAO pedidosDAO;
	@Autowired private UsuariosDAO usuariosDAO;
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	  public String listaIndex(Model model) {
	    //List<Index> marcas = marcaDAO.listaMarcas();
	    model.addAttribute("index", null);
	    return "index";
	  }
	
	@RequestMapping(value ="/resultProductos", method = RequestMethod.POST)
    public String resultProductos(@ModelAttribute("nombre")String nombre,
    		@ModelAttribute("id_producto")String id_producto,
    		@ModelAttribute("cantidad")String cantidad,
                     BindingResult result,
                     Model model){		

	    List<Productos> productos = productosDAO.listaProductos(nombre);
	    model.addAttribute("resultProductos", productos);
       
        if(result.hasErrors()){
        	return"home";
        }else{
        	model.addAttribute("nombre",nombre);
        	
        	if (nombre != null && nombre.equalsIgnoreCase(""))
        	{
        		SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");
	        	Date date = new Date();
	        	String fecha = dt1.format(date);
	        	
	    		Pedidos pedido = new Pedidos();
	    		//pedido.setId_pedido(0);
	    		pedido.setTipo("venta");
	    		pedido.setId_usuario(usuariosDAO.getUsuario(18845885));
	    		pedido.setEstado("pedido");
	    		pedido.setFecha_abierto(fecha);
	    		pedido.setFecha_vencimiento(fecha);
	    		pedido.setFecha_entrega(fecha);
	    		
	    		System.out.println("tipo: " + pedido.getTipo());
	        	System.out.println("id usuario: " + pedido.getId_usuario().getDni());
	        	System.out.println("estado: " + pedido.getEstado());
	        	System.out.println("fec a: " + pedido.getFecha_abierto());
	        	System.out.println("fec b: " + pedido.getFecha_vencimiento());
	        	System.out.println("fec c: " + pedido.getFecha_entrega());
    		
	    		String resultset = pedidosDAO.crearPedido(pedido);
	    		
	    		detalle_pedido detalle = new detalle_pedido();
	        	detalle.setId_pedido(pedidosDAO.getPedido(18845885));
	        	detalle.setId_producto(productosDAO.getProducto(Integer.parseInt(id_producto)));
	        	detalle.setCantidad(Integer.parseInt(cantidad));
	        	
	        	System.out.println("id pedido: " + pedidosDAO.getPedido(18845885).getId_pedido());
	        	System.out.println("id producto: " + productosDAO.getProducto(Integer.parseInt(id_producto)));
	        	System.out.println("cantidad: " + cantidad);
	        	
	        	resultset = pedidosDAO.asociarDetalle(detalle);
	        	System.out.println(resultset);
        	}
        	
        	System.out.println("id_producto: " + id_producto);
        	System.out.println("cantidad: " + cantidad);
        	return"resultProductos";
        }
    }
	
	@RequestMapping(value ="/resultProductos", method = RequestMethod.GET)
    public String resultProductos(Model model){		

		//List<Index> marcas = marcaDAO.listaMarcas();
	    model.addAttribute("resultProductos", null);
	    return "resultProductos";
    }
	@RequestMapping(value ="/displayProduct", method = RequestMethod.GET)
    public String displayProduct(Model model){		

		//List<Index> marcas = marcaDAO.listaMarcas();
	    model.addAttribute("displayProduct", null);
	    return "displayProduct";
    }
	
	@RequestMapping(value ="/displayProduct", method = RequestMethod.POST)
    public String displayProduct(@ModelAttribute("nombre")String nombre,
    		@ModelAttribute("id_producto")String id_producto,
    		@ModelAttribute("cantidad")String cantidad,
                     BindingResult result,
                     Model model){		

	    List<Productos> productos = productosDAO.listaProductos(nombre);
	    model.addAttribute("displayProduct", productos);
       
        if(result.hasErrors()){
        	return"home";
        }else{
        	model.addAttribute("nombre",nombre);
        	
        		return"displayProduct";
        }
    }

}
