package es.juancadc.ejemploWeb.web.Consultas;

import java.util.List;

import es.juancadc.ejemploWeb.aplicacion.DAO.AlumnoDAO;
import es.juancadc.ejemploWeb.aplicacion.DAO.PortatilDAO;


/**
 * 
 * @author Juanca 
 * ServicioConsultas: Define los métodos de consulta sobre base de datos.
 */

public interface ServicioConsultas {

	
	//Consultas para los alumno.
	
	/**
	 * insertarAlumno: Inserta en base de datos un nuevo alumno
	 */
	public void insertarAlumno(AlumnoDAO alumnoDAO) throws Exception;
	/**
	 * buscarAlumnoDePortatil: Compara los numero identificadores de los portatiles para ver si el alumno tiene el mismo numero identificador que el portatil
	 */
	public AlumnoDAO buscarAlumnoDePortatil(PortatilDAO portatilDAO) throws Exception;
	/**
	 * listadoDeAlumno: Lista todos los alumnos de la base de datos 
	 */
	public List<AlumnoDAO> listadoDeAlumno() throws Exception;
	/**
	 * eliminarAlumnoId:Elimina al alumno por el id introducido
	 */
	public void bajaAlumno(Integer numeroAlumno);
	
	
	//Consulta Portatiles
	
	/**
	 * listaDePortatilesLibres:Devuelve un listado de los id de los ordenadores libres.
	 */
	public List<Integer> listaDePortatilesLibres() throws Exception;
	/**
	 * elegirPortatilPorId: Select tabla portatil por id 
	 */
	public PortatilDAO elegirPortatilPorId(Integer id) throws Exception;

	/**
	 * insertarPortatil:Inserta en la tabla portatiles un portatil
	 */
	public void insertarPortatil(PortatilDAO portatilDAO) throws Exception;
	
	/**
	 * buscarPortatilPorAlumno: Se le pasa por parametro el id del alumno y devuelve su ordenador
	 */

	public PortatilDAO buscarPortatilPorAlumno(int idAlumno) throws Exception;
	
	/**
	 * listadoDePortatiles: Devuelve una lista con todos los portatiles de la BBDD
	 */
	public List<PortatilDAO> listadoDePortatiles() throws Exception;
	
	/**
	 * seleccionarPortatilPorID: Hace un select de la tabla dlk_tch_Portatil pero
	 * filtrando con un where por id
	 * 
	 */
	public PortatilDAO seleccionarPortatilPorID(Integer id) throws Exception;

}
