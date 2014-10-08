package com.ues21.ferreteria.pedidos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/pedidos")
public class PerdidosController {
@Autowired private PedidosDAO pedidosDAO;
	
	@RequestMapping(method = RequestMethod.GET)
	  public String listaPedidos(Model model) {
		
	    List<Pedidos> pedidos = pedidosDAO.listaPedidos();
	    model.addAttribute("pedidos", pedidos);
	    
	    return "pedidos";
	  }
	  
}
