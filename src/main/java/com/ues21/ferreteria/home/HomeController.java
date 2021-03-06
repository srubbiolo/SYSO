package com.ues21.ferreteria.home;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ues21.ferreteria.productos.Productos;
import com.ues21.ferreteria.productos.ProductosDAO;
import com.ues21.ferreteria.usuarios.Usuarios;

@Controller
@RequestMapping(value = "/home")
public class HomeController  {
	
	@Autowired private ProductosDAO productosDAO;
	
	@RequestMapping(method = RequestMethod.GET)
	public String listaHome(Model model) {
	    model.addAttribute("home", null);
	    return "home";
	  }
	 

}
