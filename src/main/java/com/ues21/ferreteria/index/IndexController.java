package com.ues21.ferreteria.index;


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
public class IndexController  {
	
	@Autowired private ProductosDAO productosDAO;
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	  public String listaIndex(Model model) {
	    //List<Index> marcas = marcaDAO.listaMarcas();
	    model.addAttribute("index", null);
	    return "index";
	  }
	
	@RequestMapping(value ="/resultProductos", method = RequestMethod.POST)
    public String resultProductos(@ModelAttribute("nombre")String nombre,
                     BindingResult result,
                     Model model){		

	    List<Productos> productos = productosDAO.listaProductos(nombre);
	    model.addAttribute("resultProductos", productos);
       
        if(result.hasErrors()){
            return"home";
        }else{
           model.addAttribute("userId",nombre);
           return"resultProductos";
        }
    }
	
	@RequestMapping(value ="/resultProductos", method = RequestMethod.GET)
    public String resultProductos(Model model){		

		//List<Index> marcas = marcaDAO.listaMarcas();
	    model.addAttribute("resultProductos", null);
	    return "resultProductos";
    }

}
