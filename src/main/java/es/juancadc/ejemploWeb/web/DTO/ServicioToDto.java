package es.juancadc.ejemploWeb.web.DTO;

import java.util.List;

import es.juancadc.ejemploWeb.aplicacion.DAO.AlumnoDAO;
import es.juancadc.ejemploWeb.aplicacion.DAO.PortatilDAO;

/**
 * @author Juanca Interfaz que tiene los metodos que pasan de DAO a DTO
 */
public interface ServicioToDto {

	/*
	 * Paso de DAO a DTO 
	 */
	public AlumnoDTO AlumnoToDTO(AlumnoDAO alumnoDAO);

	/*
	 * Paso de DAO a DTO (PortatilDAO _> PortatilDTO)
	 */
	public PortatilDTO PortatilToDTO(PortatilDAO portatilDAO);

	/**
	 * Paso de una lista de alumoDAO a alumnoDTO 
	
	 */
	public List<AlumnoDTO> ListAlumnoToDTO(List<AlumnoDAO> listAlumnoDAO);
	
	public List<PortatilDTO> ListPortatilToDTO(List<PortatilDAO> listPortatilDAO);
}
