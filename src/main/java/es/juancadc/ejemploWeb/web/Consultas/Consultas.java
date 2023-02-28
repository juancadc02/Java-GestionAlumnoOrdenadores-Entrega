package es.juancadc.ejemploWeb.web.Consultas;







import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.juancadc.ejemploWeb.aplicacion.DAO.AlumnoDAO;
import es.juancadc.ejemploWeb.aplicacion.DAO.PortatilDAO;
import es.juancadc.ejemploWeb.aplicacion.DAO.RepositorioAlumno;
import es.juancadc.ejemploWeb.aplicacion.DAO.RepositorioPortatil;

/**
 * @author Juanca
 * Clase que contiene la definicion de los metodos que actuan sobre la base de datos.
 */

@Service
public class Consultas implements ServicioConsultas {

	
	@Autowired
	private RepositorioAlumno ra;
	
	
	//*******************Consultas alumnos*******************************
	@Override
	public void insertarAlumno(AlumnoDAO alumnoDAO) throws Exception {
	
		ra.save(alumnoDAO);
		
	}
	@Override
	public List<AlumnoDAO> listadoDeAlumno() throws Exception {
		
		return (List<AlumnoDAO>) ra.findAll();
	}
	@Override
	public void bajaAlumno(Integer numeroAlumno) {
		ra.deleteById(numeroAlumno);
		
	}
	
	@Override
	public AlumnoDAO buscarAlumnoDePortatil(PortatilDAO portatilDAO) throws Exception {
		//Traemos todos los alumnmos
				List<AlumnoDAO> listAlumnos = (List<AlumnoDAO>) ra.findAll();	
				
				for (AlumnoDAO alumnoDAO : listAlumnos) {
					if(alumnoDAO.getPortatilDAO().getNumeroIdentificador() == portatilDAO.getNumeroIdentificador())
						return alumnoDAO;
				}	
				return null;
	}
	
	
	
	
	//Consultas de portatiles
	
	@Autowired
	private RepositorioPortatil rp;
	
	
	@Override
	public List<Integer> listaDePortatilesLibres() throws Exception {
		
		//Declaramos la lista que tienelos numeroIdentificadores de los portatiles libres	
		List<Integer> listaId = new ArrayList<Integer>();
				
				
				//Select de toda la tabla alumnos
				List<Integer> listaAlumnosID = new ArrayList<Integer>();
				try {
					List<AlumnoDAO> listaAlumnos = (List<AlumnoDAO>) ra.findAll();
					
					for (AlumnoDAO alumnoDAO : listaAlumnos) {
						PortatilDAO portailAux = alumnoDAO.getPortatilDAO();
						listaAlumnosID.add(portailAux.getNumeroIdentificador());
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				//Select de toda la tabla portatiles
				List<PortatilDAO> listaPortatiles = new ArrayList<PortatilDAO>();
				try {
					listaPortatiles = (List<PortatilDAO>) rp.findAll();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				for (PortatilDAO portatil : listaPortatiles) {
					boolean asignado = false;
					for (Integer alumno : listaAlumnosID) {
						if(portatil.getNumeroIdentificador() == alumno)
						{
							asignado = true;
				            break;
						}
					}
					if (!asignado) {
						listaId.add(portatil.getNumeroIdentificador());
				    }
				}
				
				return listaId;
		
	}

	@Override
	public PortatilDAO elegirPortatilPorId(Integer id) throws Exception {
		return rp.findById(id).orElse(null);
	}

	@Override
	public void insertarPortatil(PortatilDAO portatilDAO) throws Exception {

		rp.save(portatilDAO);
	}

	@Override
	public PortatilDAO buscarPortatilPorAlumno(int idAlumno) throws Exception {

		return ra.findById(idAlumno).get().getPortatilDAO();
	}
	@Override
	public List<PortatilDAO> listadoDePortatiles() throws Exception {
		
		return (List<PortatilDAO>) rp.findAll();
	}
	@Override
	public PortatilDAO seleccionarPortatilPorID(Integer id) throws Exception {
		return rp.findById(id).orElse(null);
	}
	
	
	
	
}
	
	
	
	

