package com.ues21.ferreteria.home;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ues21.ferreteria.productos.Productos;
import com.ues21.ferreteria.productos.ProductosDAO;

@Controller
public class HomeController  {
	
	@Autowired private ProductosDAO productosDAO;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	  public String listaHome(Model model) {
	    model.addAttribute("home", null);
	    return "home";
	  }

}
