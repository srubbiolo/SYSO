package com.ues21.ferreteria.productos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/productos")

public class ProductosController {
	
	@Autowired private ProductosDAO productosDAO;
	
	@RequestMapping(method = RequestMethod.GET)
	  public String listaProductos(Model model) {
	    List<Productos> productos = productosDAO.listaProductos();
	    model.addAttribute("productos", productos);
	    return "productos";
	  }
	/*
	@RequestMapping(value = "/productos", method = RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute Productos producto, Model model) {
        model.addAttribute("producto", producto);
        return "resultProductos";
    }
    */
}
