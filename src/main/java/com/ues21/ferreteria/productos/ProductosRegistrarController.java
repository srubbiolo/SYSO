package com.ues21.ferreteria.productos;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ues21.ferreteria.marca.MarcaDAO;
import com.ues21.ferreteria.marca.Marcas;
import com.ues21.ferreteria.productos.Productos;
import com.ues21.ferreteria.productos.ProductosDAO;
import com.ues21.ferreteria.usuarios.Usuarios;

@Controller
@RequestMapping(value = "/registerProduct")
public class ProductosRegistrarController {
 
    @Autowired private ProductosDAO productoDAO;
    @Autowired private MarcaDAO marcaDAO;
	
    @RequestMapping(method = RequestMethod.GET)
    public String viewRegistration(Model model) {
    	
		Productos userForm = new Productos();
		List<Marcas> marcas = marcaDAO.listaMarcas();
		
		model.addAttribute("marcas", marcas);
		model.addAttribute("userForm", userForm);
         
        return "registerProduct";
    }
        
    @RequestMapping(method = RequestMethod.POST)
	public String submitProducto(@RequestParam(value="nombre") String nombre, @RequestParam(value="descripcion") String descripcion,
			@RequestParam(value="marca") Integer id_marca, @RequestParam(value="stock") int stock,
			@RequestParam(value="precio") double precio, @ModelAttribute("userForm") Productos producto,
            Map<String, Object> model){
		
		Productos prod = new Productos();
		
		prod.setNombre(nombre);
		prod.setDescripcion(descripcion);
		prod.setPrecio(precio);
		prod.setStock(stock);
		prod.setMarca(marcaDAO.getMarcaId(id_marca));
		
		String result=productoDAO.agregarProducto(prod);
		
		return "registerProduct";
	}
}
