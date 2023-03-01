package es.juancadc.ejemploWeb.web.controladores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import es.juancadc.ejemploWeb.aplicacion.DAO.AlumnoDAO;
import es.juancadc.ejemploWeb.aplicacion.DAO.PortatilDAO;
import es.juancadc.ejemploWeb.web.Consultas.Consultas;
import es.juancadc.ejemploWeb.web.DTO.AlumnoDTO;
import es.juancadc.ejemploWeb.web.DTO.PortatilDTO;
import es.juancadc.ejemploWeb.web.DTO.ToDtoServicioImpl;

@Controller
public class ControladorBuscarPortatilPorAlumno {

	@Autowired
	private Consultas consulta;
	
	ToDtoServicioImpl ToDto = new ToDtoServicioImpl();
	
	
	@RequestMapping(value="buscarPortatilPorAlumno")
	public ModelAndView cargarVistaBuscarPortatilPorAlumno() {
		
		List<AlumnoDAO> listaAlumnoDAO= new ArrayList<AlumnoDAO>();	
		List<AlumnoDTO> listaAlumnoDTO=new ArrayList<AlumnoDTO>();
		try {
		
			listaAlumnoDAO=consulta.listadoDeAlumno();
		
			listaAlumnoDTO=ToDto.ListAlumnoToDTO(listaAlumnoDAO);
			
			
			return new ModelAndView("buscarPortatilPorAlumno","lista",listaAlumnoDTO);
		}catch (Exception e) {
			return new ModelAndView("paginaError");
		}
		
	}
	
	@PostMapping(value="buscarPortatilPorAlumno")
	public ModelAndView buscarPortatilPorAlumno(@RequestParam("numeroAlumno") int numeroIdentificador) {
		
		//Creo un objeto PortatilDAO y PortatilDTO
		PortatilDAO portatilBuscadoDAO= new PortatilDAO();
		PortatilDTO portatilBuscadoDTO= new PortatilDTO();
		try {
		
		portatilBuscadoDAO =consulta.buscarPortatilPorAlumno(numeroIdentificador);
		
		//Paso el DAO a DTO
		portatilBuscadoDTO=ToDto.PortatilToDTO(portatilBuscadoDAO);
		
		//Lo añado a una vista para mostrarlo
		List<PortatilDTO> listaPortatilDTO= new ArrayList<PortatilDTO>();
		listaPortatilDTO.add(portatilBuscadoDTO);
		
		return new ModelAndView("resultadoBuscarPortatilPorAlumno","portatil",listaPortatilDTO);
		
		}catch (Exception e) {
			return new ModelAndView("paginaError");
		}
		
	}
}
