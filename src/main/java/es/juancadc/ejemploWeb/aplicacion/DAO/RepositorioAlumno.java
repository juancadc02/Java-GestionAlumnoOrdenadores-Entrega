package es.juancadc.ejemploWeb.aplicacion.DAO;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

/**
 * @author Juanca
 * Interfaz del RepositorioAlumno que hereda los metodos de CrudRepository
 */

public interface RepositorioAlumno extends CrudRepository<AlumnoDAO,Integer> {

	//Metodo propio utilizado para devolver el alumno que hemos eliminado, por el ID de ese alumno.
	 Optional<AlumnoDAO> findById(Integer numeroAlumno);
	
	

	


}
