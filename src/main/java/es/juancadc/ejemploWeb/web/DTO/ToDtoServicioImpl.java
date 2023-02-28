package es.juancadc.ejemploWeb.web.DTO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import es.juancadc.ejemploWeb.aplicacion.DAO.AlumnoDAO;
import es.juancadc.ejemploWeb.aplicacion.DAO.PortatilDAO;
/**
 * @author Juanca Implementación de la interfaz ToDtoServicio
 */
public class ToDtoServicioImpl implements ServicioToDto {

	@Override
	public AlumnoDTO AlumnoToDTO(AlumnoDAO alumnoDAO) {
		
		AlumnoDTO alumnoDto = new AlumnoDTO();

		
		alumnoDto.setNumeroAlumno(alumnoDAO.getNumeroAlumno());
		alumnoDto.setNombreAlumno(alumnoDAO.getNombreAlumno());
		alumnoDto.setTelefonoAlumno(alumnoDAO.getTelefonoAlumno());
		alumnoDto.setPortatilDAO(alumnoDAO.getPortatilDAO());

		return alumnoDto;
	}

	@Override
	public PortatilDTO PortatilToDTO(PortatilDAO portatilDAO) {
		PortatilDTO portatilDto = new PortatilDTO();

		
		portatilDto.setIdentificadorPortatil(portatilDAO.getNumeroIdentificador());
		portatilDto.setMarcaPortatil(portatilDAO.getMarcaPortatil());
		portatilDto.setModeloPortatil(portatilDAO.getModeloPortatil());

		return portatilDto;
	}

	@Override
	public List<AlumnoDTO> ListAlumnoToDTO(List<AlumnoDAO> listAlumnoDAO) {
		List<AlumnoDTO> listAlumnoDTO = new ArrayList<AlumnoDTO>();

		// El método map toma cada objeto AlumnoDAO en la lista original y lo convierte
		// en
		// un objeto AlumnoDTO mediante el uso de una expresión lambda. En la lambda se
		// crea
		// un nuevo objeto de tipo AlumnoDTO con el nombre, el telefono y la referencia
		// del portatil
		// de la clase AlumnoDAO y se devuelve. El resultado es una nueva a lista de
		// objetos AlumnoDTO.
		listAlumnoDTO = listAlumnoDAO.stream()
				.map(alumnoDAO -> new AlumnoDTO(alumnoDAO.getNumeroAlumno(), alumnoDAO.getNombreAlumno(), alumnoDAO.getTelefonoAlumno(), alumnoDAO.getPortatilDAO()))
				.collect(Collectors.toList());

		return listAlumnoDTO;
	}

	@Override
	public List<PortatilDTO> ListPortatilToDTO(List<PortatilDAO> listPortatilDAO) {
		List<PortatilDTO> listPortatilDTO = new ArrayList<PortatilDTO>();

		// El método map toma cada objeto PortatilDAO en la lista original y lo
		// convierte en
		// un objeto PortatilDTO mediante el uso de una expresión lambda. En la lambda
		// se crea
		// un nuevo objeto de tipo PortatilDTO con el nombre, el telefono y la
		// referencia del portatil
		// de la clase PortatilDAO y se devuelve. El resultado es una nueva a lista de
		// objetos PortatilDTO.
		listPortatilDTO = listPortatilDAO.stream()
				.map(portatilDAO -> new PortatilDTO(portatilDAO.getNumeroIdentificador(),portatilDAO.getMarcaPortatil(), portatilDAO.getModeloPortatil()))
				.collect(Collectors.toList());

		return listPortatilDTO;
	}

}
