package com.ues21.ferreteria.login;


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
@RequestMapping(value = "/login")
public class LoginController  {
	
	@Autowired private LoginDAO loginDAO;
	/*
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	  public String listaHome(Model model) {
	    model.addAttribute("login", null);
	    return "login";
	  }
	*/
	@RequestMapping(method = RequestMethod.GET)
    public String viewRegistration(Map<String, Object> model) {
        Login userForm = new Login();    
        model.put("userForm", userForm);
         
        return "login";
    }
     
    @RequestMapping(method = RequestMethod.POST)
    public String processRegistration(@ModelAttribute("userForm") Login user,
            Map<String, Object> model) {
         
        // implement your own registration logic here...
        Login login = loginDAO.verificarUsuario(user);
        // for testing purpose:
        System.out.println("username: " + user.getDni());
        System.out.println("password: " + user.getContrasena());
        
        if (login!=null)
        return "home";
        else return "index";
    }

}
