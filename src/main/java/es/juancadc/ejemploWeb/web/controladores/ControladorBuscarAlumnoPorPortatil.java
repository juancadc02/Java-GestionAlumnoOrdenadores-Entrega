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
public class ControladorBuscarAlumnoPorPortatil {

	@Autowired
	private Consultas consulta;
	
	ToDtoServicioImpl ToDto=new ToDtoServicioImpl();
	
	@RequestMapping(value="buscarAlumnoPorPortatil")
	public ModelAndView cargarPaginaBuscarAlumnoPorPortatil() {
		
		List<PortatilDAO> listaPortatilesDao= new ArrayList<PortatilDAO>();
		List<PortatilDTO> listaPortatilesDto= new ArrayList<PortatilDTO>();
		
		try {
		
			listaPortatilesDao=consulta.listadoDePortatiles();
		
			//Paso la listaDao a listaDto
			listaPortatilesDto=ToDto.ListPortatilToDTO(listaPortatilesDao);
			
			return new ModelAndView("buscarAlumnoPorPortatil","listaPortatiles",listaPortatilesDto);

		}catch (Exception e) {

			return new ModelAndView();

		}
		
	}
		@PostMapping(value="buscarAlumnoPorPortatil")
		public ModelAndView buscarAlumnoPorPortatil(@RequestParam("numeroIdentificador") int numeroIdentificador) {
			
			try {
			PortatilDAO portatilDAO = consulta.seleccionarPortatilPorID(numeroIdentificador);
			AlumnoDAO alumnoDAO = consulta.buscarAlumnoDePortatil(portatilDAO);
			
			//Comprobamos si ese portatil pertenece a algun alumno
			if(alumnoDAO==null)
				return new ModelAndView();
				
			
			//Paso el alumno a DTO para mostrarlo
			AlumnoDTO alumnoDto=ToDto.AlumnoToDTO(alumnoDAO);
			
			//Lo meto en la lista para mostrarlo
			List<AlumnoDTO> listaAlumnoDto= new ArrayList<AlumnoDTO>();
			listaAlumnoDto.add(alumnoDto);
			return new ModelAndView("resultadoBuscarAlumnoPorPortatil","lista",listaAlumnoDto);
			}catch (Exception e) {
				return new ModelAndView();		
				
			}

			}
		
		
	}

