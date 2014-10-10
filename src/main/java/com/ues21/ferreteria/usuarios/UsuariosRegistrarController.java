package com.ues21.ferreteria.usuarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
@RequestMapping(value = "/registerUser")
public class UsuariosRegistrarController {
 
    @RequestMapping(method = RequestMethod.GET)
    public String viewRegistration(Map<String, Object> model) {
        Usuarios userForm = new Usuarios();    
        model.put("userForm", userForm);
         
        ArrayList<String> tipoUserList = new ArrayList<String>();
        tipoUserList.add("Administrador");
        tipoUserList.add("Usuario");
        tipoUserList.add("Empleado");
        model.put("tipoUserList", tipoUserList);
         
        return "registerUser";
    }
    
    @Autowired private UsuariosDAO usuariosDAO;
     
    @RequestMapping(method = RequestMethod.POST)
    public String processRegistration(@ModelAttribute("userForm") Usuarios user,
            Map<String, Object> model) {
         
        // implement your own registration logic here...
         Usuarios usuario = usuariosDAO.agregarUsuario(user);
        // for testing purpose:
        System.out.println("dni: " + user.getDni());
        System.out.println("email: " + user.getEmail());
        System.out.println("contraseña: " + user.getContrasena());
        System.out.println("tipo: " + user.getTipo());
         
        return "registerUser";
    }
}