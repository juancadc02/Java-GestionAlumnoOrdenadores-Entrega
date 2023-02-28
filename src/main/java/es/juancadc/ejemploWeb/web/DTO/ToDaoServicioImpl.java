package es.juancadc.ejemploWeb.web.DTO;

import es.juancadc.ejemploWeb.aplicacion.DAO.AlumnoDAO;
import es.juancadc.ejemploWeb.aplicacion.DAO.PortatilDAO;

/**
 * @author Juanca Implementación de la interfaz ToDaoServicio
 */

public class ToDaoServicioImpl implements ToDaoServicio {

	@Override
	public AlumnoDAO AlumnoToDAO(AlumnoDTO alumnoDTO) {
		
		AlumnoDAO alumnoDao = new AlumnoDAO();

		
		alumnoDao.setNombreAlumno(alumnoDTO.getNombreAlumno());
		alumnoDao.setTelefonoAlumno(alumnoDTO.getTelefonoAlumno());
		alumnoDao.setPortatilDAO(alumnoDTO.getPortatilDAO());

		return alumnoDao;
	}

	@Override
	public PortatilDAO PortatilToDAO(PortatilDTO portatilDTO) {
		
		PortatilDAO portatilDao = new PortatilDAO();

		
		portatilDao.setMarcaPortatil(portatilDTO.getMarcaPortatil());
		portatilDao.setModeloPortatil(portatilDTO.getModeloPortatil());

		return portatilDao;
	}

}
