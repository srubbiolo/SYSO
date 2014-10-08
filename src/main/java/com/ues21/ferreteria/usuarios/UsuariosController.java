package com.ues21.ferreteria.usuarios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping ("/usuarios")

public class UsuariosController 
{
	@Autowired private UsuariosDAO usuariosDAO;
	
	@RequestMapping(method = RequestMethod.GET)
	public String listaUsuarios(Model model)
	{
		List<Usuarios> usuarios = usuariosDAO.listaUsuarios();
	    model.addAttribute("usuarios", usuarios);
	    return "usuarios";
	}

}
