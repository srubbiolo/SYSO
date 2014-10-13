package com.ues21.ferreteria.marca;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/marcas")
public class MarcaController {

	@Autowired private MarcaDAO marcaDAO;
	
	@RequestMapping(method = RequestMethod.GET)
	  public String listaMarcas(Model model) {
		//String nombre = "Stanley";
	    List<Marcas> marcas = marcaDAO.listaMarcas();
	    model.addAttribute("marcas", marcas);
	    return "marcas";
	  }
	
	@RequestMapping(value = "buscaMarcas", method = RequestMethod.POST)
	public String listaMarcas(Model model, @ModelAttribute String nombre) {
	    List<Marcas> marcas = marcaDAO.listaMarcas(nombre);
	    model.addAttribute("marcas", marcas);
	    return "marcas";
	  }
	/*
	@RequestMapping(value = "searchProduct", method = RequestMethod.POST)
	  public String searchProduct(@ModelAttribute Marcas marca,@ModelAttribute String nombre,
	      @ModelAttribute("cart") List<Marcas> cart) {
	    cart.add(marca);
	    return "redirect:/";
	  }
	
	@RequestMapping(value = "searchProduct", method = RequestMethod.POST)
	  public String searchProduct(Model model, @ModelAttribute String nombre) {
	    List<Marcas> marcas = marcaDAO.listaMarcas(nombre);
	    model.addAttribute("marcas", marcas);
	    return "marcas";
	  }*/
}
