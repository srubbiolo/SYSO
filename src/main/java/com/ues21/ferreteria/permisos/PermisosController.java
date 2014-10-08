package com.ues21.ferreteria.permisos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping ("/permisos")

public class PermisosController {
@Autowired private PermisosDAO permisosDAO;
	
	@RequestMapping(method = RequestMethod.GET)
	public String listaPermisos(Model model)
	{
		List<Permisos> permisos = permisosDAO.listaPermisos();
	    model.addAttribute("permisos", permisos);
	    return "permisos";
	}

}
