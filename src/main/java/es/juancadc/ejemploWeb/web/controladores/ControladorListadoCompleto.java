package es.juancadc.ejemploWeb.web.controladores;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import es.juancadc.ejemploWeb.aplicacion.DAO.AlumnoDAO;
import es.juancadc.ejemploWeb.aplicacion.DAO.PortatilDAO;
import es.juancadc.ejemploWeb.web.Consultas.Consultas;
import es.juancadc.ejemploWeb.web.DTO.AlumnoDTO;
import es.juancadc.ejemploWeb.web.DTO.PortatilDTO;
import es.juancadc.ejemploWeb.web.DTO.ToDtoServicioImpl;
/**
 * 
 * @author Juanca
 *
 *ControladorListadoCompleto: Controlador que controla la vista de listadoCompleto,
 *listadoCompleto y error.
 */
@Controller
public class ControladorListadoCompleto {

	@Autowired
	private Consultas consultas;
	
	ToDtoServicioImpl ToDto= new ToDtoServicioImpl();
	
	@RequestMapping("cargarListadoCompleto")
	public ModelAndView muestraTodosLosDatos() {
		
		try {
			
		//Creamos las listas con todos los datos
		List<AlumnoDAO> listaAlumno= consultas.listadoDeAlumno();
		List<PortatilDAO> listaPortatiles= consultas.listadoDePortatiles();
		
		//Creamos un Map para introducir en el las dos listas.
		Map<String, Object> miModelo= new HashMap<String, Object>();
		
		//Pasamos las listas a listasDTO
		List<AlumnoDTO> listaAlumnoDto=ToDto.ListAlumnoToDTO(listaAlumno);
		List<PortatilDTO> listaPortatilesDto=ToDto.ListPortatilToDTO(listaPortatiles);
		
		//Introducimos las dos listas en el Map
		miModelo.put("listaAlumno",listaAlumnoDto);
		miModelo.put("listaPortatiles", listaPortatilesDto);
		
		return new ModelAndView("listadoCompleto","miModelo",miModelo);
		}catch (Exception e) {

			return new ModelAndView("paginaError");
		}
		
		
	}
}
