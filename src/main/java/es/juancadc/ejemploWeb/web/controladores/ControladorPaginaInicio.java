package es.juancadc.ejemploWeb.web.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorPaginaInicio {

	@RequestMapping(value="/paginaInicio")
	public ModelAndView cargarPaginaPrincipal (){
		return new ModelAndView("paginaInicio");
	}
}
