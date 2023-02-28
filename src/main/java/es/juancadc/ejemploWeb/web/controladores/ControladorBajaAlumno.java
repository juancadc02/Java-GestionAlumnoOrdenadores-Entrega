package es.juancadc.ejemploWeb.web.controladores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import es.juancadc.ejemploWeb.aplicacion.DAO.*;
import es.juancadc.ejemploWeb.web.Consultas.Consultas;
import es.juancadc.ejemploWeb.web.DTO.AlumnoDTO;
import es.juancadc.ejemploWeb.web.DTO.ToDtoServicioImpl;
@Controller
public class ControladorBajaAlumno {

	@Autowired
	private Consultas consultas;
	
	//Declaro la clase ToDtoServicioImpl que es donde se encuentra los metodos para pasar de DAO a DTO
	ToDtoServicioImpl ToDto = new ToDtoServicioImpl();
	
	
	@RequestMapping(value="/darDeBajaAlumno")
	public ModelAndView cargarPaginaBajaAlumno() {
		
		//Creo una lista de AlumnoDao
		List<AlumnoDAO> listaDeAlumnoDAO = new ArrayList<AlumnoDAO>();
		
		try {

			//Igualo la lista al metodo de listar todos los alumno
			listaDeAlumnoDAO=consultas.listadoDeAlumno();
		
			//Paso esa lista de alumnosDAO a alumnosDTO
			List<AlumnoDTO> listaDeAlumnosDTO =ToDto.ListAlumnoToDTO(listaDeAlumnoDAO);
			
			return new ModelAndView("bajaAlumno","listaDeAlumno",listaDeAlumnosDTO);

		} catch (Exception e) {
			return new ModelAndView("errorAlCargarLaPagina");
		}
		
		
		
		
		
	}
	@PostMapping(value="bajaAlumno")
	public ModelAndView formularioBajaAlumno(@RequestParam("numeroAlumno") Integer numeroAlumno) {
		
		try {
			
			consultas.bajaAlumno(numeroAlumno);
			
			return new ModelAndView("alumnoEliminadoCorrectamente");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		return new ModelAndView();
	}
}