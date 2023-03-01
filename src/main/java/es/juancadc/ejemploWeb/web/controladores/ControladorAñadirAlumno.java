package es.juancadc.ejemploWeb.web.controladores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import es.juancadc.ejemploWeb.web.DTO.ToDaoServicioImpl;

/**
 * 
 * @author Juanca
 *
 *ControladorAñadirAlumno: Controlador que controla la vista de añadirAlumno,
 *alumnoAñadidoCorrectamente y errorRegistroDeAlumno.
 */
@Controller
public class ControladorAñadirAlumno {

	@Autowired
	private Consultas consulta;
	
	//Declaramos los metodos de pasar de DAO A DTO para usarlo en las transaciones con la vista.
	ToDaoServicioImpl ToDao = new ToDaoServicioImpl();
	ToDtoServicioImpl ToDto = new ToDtoServicioImpl();
	
	
	
	@RequestMapping(value="/añadirNuevoAlumno")
	public ModelAndView cargarPaginaAñadirAlumno() {
		
		//Declaramos una lista con los portatiles con el id libre y la incializamos en null
    	List<Integer> listIDsPortailesLibres = null;
		
    	try {
    		//Añadimos a esta lista los portatiles libres atravez de nuestro metodo
			listIDsPortailesLibres = consulta.listaDePortatilesLibres();
		} catch (Exception e) {
			
			return new ModelAndView("paginaError");
		}
    	
    	//Creamos una lista de String por si en el caso de que no haya portatiles libre,imprima el mensaje 
    	//de no hay portatiles disponibles.
    	List<String> listNull = new ArrayList<String>();
    	listNull.add("No hay portatiles libres");
    	
    	//Creamos una condicion que controle que si no hay portatiles libres devuelva la lista 
    	//de no hay portatiles libres y en el caso de que si, devuelva la lista con los id libres
    	if (listIDsPortailesLibres.isEmpty()) {
    		//Si no hay portatiles libres devolvemos la lista vacia
    		return new ModelAndView("añadirAlumno", "listIDsPortailesLibres", listNull);
    	} else {
    		//En el caso de que si, la devolvemos llena de esos id que estan libres.
    		return new ModelAndView("añadirAlumno", "listIDsPortailesLibres", listIDsPortailesLibres);
    	}
		
	}

	@PostMapping(value = "/añadirAlumno")
	public ModelAndView usuarioRegistrado(
			@RequestParam("nombreAlumno") String nombre,
			@RequestParam("telefonoAlumno") int telefono, 
			@RequestParam("identificadorPortatil") Integer identificadorPortatil) {

	     
		    try {
		        //Peticion a la base de datos para devolver el ordenador elegido
		        PortatilDAO portatilDAO = consulta.elegirPortatilPorId(identificadorPortatil);     
		        
		        // Creamos un DAO con los datos introducidos en el formulario
		        AlumnoDAO alumnoDAO = new AlumnoDAO(nombre, telefono, portatilDAO);
		       
		        // Guarda el objeto en la base de datos
		        consulta.insertarAlumno(alumnoDAO);
		        
		        //Pasamos el objeto a DTO para mostrarlo por la vista 
		        AlumnoDTO alumnoDTO=ToDto.AlumnoToDTO(alumnoDAO);
		       PortatilDTO portatilDto=ToDto.PortatilToDTO(portatilDAO);
		        //Creamos una lista de alumnoDTO y añadimor el alumnoDTO a esa lista
		        List<AlumnoDTO> alumnoMostrar= new ArrayList<AlumnoDTO>();
		        alumnoMostrar.add(alumnoDTO);
		      
		        //Creamos una lista de portatilDTO y añadimor el portatildto a esa lista
		        List<PortatilDTO> portatiMostrar=new ArrayList<PortatilDTO>();
		        portatiMostrar.add(portatilDto);
		        
		        //Los metemos en un mapa.
		        Map<String, Object> miModelo=new HashMap<String,Object>();
		        miModelo.put("listaAlumno", alumnoMostrar);
		        miModelo.put("listaPortatil", portatiMostrar);
		        return new ModelAndView("alumnoAñadidoCorrectamente","miModelo",miModelo);
		        
		    } catch (Exception e) {
		    	//Si da error mostramos una vista de error 
		        return new ModelAndView("paginaError");
		    }
	}
		
}
