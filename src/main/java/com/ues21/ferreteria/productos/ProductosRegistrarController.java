package com.ues21.ferreteria.productos;

import java.util.ArrayList;
import java.util.Map;

import org.apache.maven.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ues21.ferreteria.marca.MarcaDAO;
import com.ues21.ferreteria.productos.Productos;
import com.ues21.ferreteria.productos.ProductosDAO;

@Controller
@RequestMapping(value = "/registerProduct")
public class ProductosRegistrarController {
 
    @RequestMapping(method = RequestMethod.GET)
    public String viewRegistration(Map<String, Object> model) {
        Productos userForm = new Productos();    
        model.put("userForm", userForm);
         
        ArrayList<String> tipoUserList = new ArrayList<String>();
        tipoUserList.add("Stanley");
        tipoUserList.add("Bahco");
        tipoUserList.add("victorinox");
        model.put("tipoUserList", tipoUserList);
         
        return "registerProduct";
    }
    
    @Autowired private ProductosDAO productoDAO;
    @Autowired private MarcaDAO marcaDAO;
    
    @RequestMapping(method = RequestMethod.POST)
	public String submitProducto(@RequestParam(value="nombre") String nombre, @RequestParam(value="descripcion") String descripcion,
			@RequestParam(value="marca") String nom, @RequestParam(value="stock") int stock,
			@RequestParam(value="precio") double precio, Model model){
		
		Productos prod = new Productos();
		
		prod.setNombre(nombre);
		prod.setDescripcion(descripcion);
		prod.setPrecio(precio);
		prod.setStock(stock);
		prod.setMarca(marcaDAO.getMarcaId(nom));
		
		Productos productos=productoDAO.agregarProducto(prod);
		
		return "registerProduct";
	}
    /* 
    @RequestMapping(method = RequestMethod.POST)
    public String processRegistration(@ModelAttribute("userForm") Productos producto,
            Map<String, Object> model) {
         
        // implement your own registration logic here...
         Productos nuevoProducto = productosDAO.agregarProducto(producto);
        // for testing purpose:
         
        System.out.println("nombre: " + nuevaMarca.getNombre());
        System.out.println("email: " + nuevaMarca.getEmail());
        System.out.println("contraseña: " + nuevaMarca.getTelefono());
         
        return "registerProduct";
    }
	*/
}
