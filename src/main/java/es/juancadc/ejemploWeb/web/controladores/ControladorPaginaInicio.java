package es.juancadc.ejemploWeb.web.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/**
 * 
 * @author Juanca
 *
 *ControladorPaginaInicio: Controlador que controla la vista de paginaInicio,
 * y error.
 */
@Controller
public class ControladorPaginaInicio {

	@RequestMapping(value="/paginaInicio")
	public ModelAndView cargarPaginaPrincipal (){
		try {
		return new ModelAndView("paginaInicio");
		}catch (Exception e) {
			return new ModelAndView("paginaError");
		}
	}
}
