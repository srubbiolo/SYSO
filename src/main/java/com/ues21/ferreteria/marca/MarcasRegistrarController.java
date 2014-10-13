package com.ues21.ferreteria.marca;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ues21.ferreteria.marca.Marcas;
import com.ues21.ferreteria.marca.MarcaDAO;

@Controller
@RequestMapping(value = "/registerBrand")
public class MarcasRegistrarController {
 
    @RequestMapping(method = RequestMethod.GET)
    public String viewRegistration(Map<String, Object> model) {
        Marcas userForm = new Marcas();    
        model.put("userForm", userForm);
         
        ArrayList<String> tipoUserList = new ArrayList<String>();
        tipoUserList.add("ADMINISTRADOR");
        tipoUserList.add("EMPLEADO");
        tipoUserList.add("CLIENTE");
        model.put("tipoUserList", tipoUserList);
         
        return "registerBrand";
    }
    
    @Autowired private MarcaDAO marcasDAO;
     
    @RequestMapping(method = RequestMethod.POST)
    public String processRegistration(@ModelAttribute("userForm") Marcas marca,
            Map<String, Object> model) {
         
        // implement your own registration logic here...
         Marcas nuevaMarca = marcasDAO.agregarMarca(marca);
        // for testing purpose:
        System.out.println("nombre: " + nuevaMarca.getNombre());
        System.out.println("email: " + nuevaMarca.getEmail());
        System.out.println("contraseña: " + nuevaMarca.getTelefono());
         
        return "registerBrand";
    }
}
