package es.juancadc.ejemploWeb.web.controladores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import es.juancadc.ejemploWeb.aplicacion.DAO.PortatilDAO;
import es.juancadc.ejemploWeb.web.Consultas.Consultas;
import es.juancadc.ejemploWeb.web.DTO.PortatilDTO;
import es.juancadc.ejemploWeb.web.DTO.ToDtoServicioImpl;

@Controller
public class ControladorAñadirPortatil {

	@Autowired
	private Consultas consultas;
	
	ToDtoServicioImpl ToDto = new ToDtoServicioImpl();
	
	
	
	
	
	@RequestMapping(value="/añadirNuevoPortatil")
	public ModelAndView cargarPaginaAñadirPortatil() {
		
		return new ModelAndView("añadirPortatil");
	}
	
	@PostMapping(value = "/añadirPortatil")
	public ModelAndView usuarioRegistrado(
			@RequestParam("marcaPortatil") String marcaPortatil,
			@RequestParam("modeloPortatil") String modeloPortatil
			) {
		
		try {
		//Creamos el portatil con los parametro que le hemos pasado atravez del formulario
		PortatilDAO portatilDAO = new PortatilDAO(marcaPortatil, modeloPortatil);

		//Hago la consulta añadiendo ese portatil
		consultas.insertarPortatil(portatilDAO);
		
		//Paso ese portatil a DTO para mostrarlo en la vista 
		PortatilDTO portatilDto = ToDto.PortatilToDTO(portatilDAO);
		
		//Creo una lista de portatil para mostrarlo como insertado
		List<PortatilDTO>listaPortatil = new ArrayList<PortatilDTO>();
		listaPortatil.add(portatilDto);
		
		return new ModelAndView("portatilAñadidoCorrectamente","lista",listaPortatil);
		}catch (Exception e) {
				return new ModelAndView();
}
	}
}
