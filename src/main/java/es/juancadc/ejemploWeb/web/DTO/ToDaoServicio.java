package es.juancadc.ejemploWeb.web.DTO;

import es.juancadc.ejemploWeb.aplicacion.DAO.AlumnoDAO;
import es.juancadc.ejemploWeb.aplicacion.DAO.PortatilDAO;

/**
 * @author Juanca Interfaz que tiene los metodos que pasan de DTO a DAO
 */

public interface ToDaoServicio {

	/*
	 * Paso de DTO a DAO 
	 */
	public AlumnoDAO AlumnoToDAO(AlumnoDTO alumnoDTO);
	
	

	/*
	 * Paso de DTO a DAO 
	 */
	public PortatilDAO PortatilToDAO(PortatilDTO portatilDTO);
}
