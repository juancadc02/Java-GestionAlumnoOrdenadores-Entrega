package es.juancadc.ejemploWeb.web.DTO;

import es.juancadc.ejemploWeb.aplicacion.DAO.PortatilDAO;

/**
 * @author Juanca Clase de la entidad AlumnoDAO a AlumnoDTO
 */

public class AlumnoDTO {

	private Integer numeroAlumno;
	private String nombreAlumno;
	private int telefonoAlumno;
	private PortatilDAO portatilDAO;
	
	//Getters and Setters
	public Integer getNumeroAlumno() {
		return numeroAlumno;
	}
	public void setNumeroAlumno(Integer numeroAlumno) {
		this.numeroAlumno = numeroAlumno;
	}
	public String getNombreAlumno() {
		return nombreAlumno;
	}
	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}
	public int getTelefonoAlumno() {
		return telefonoAlumno;
	}
	public void setTelefonoAlumno(int telefonoAlumno) {
		this.telefonoAlumno = telefonoAlumno;
	}
	public PortatilDAO getPortatilDAO() {
		return portatilDAO;
	}
	public void setPortatilDAO(PortatilDAO portatilDAO) {
		this.portatilDAO = portatilDAO;
	}
	
	//Constructor Completo
	
	public AlumnoDTO(Integer numeroAlumno, String nombreAlumno, int telefonoAlumno, PortatilDAO portatilDAO) {
		super();
		this.numeroAlumno = numeroAlumno;
		this.nombreAlumno = nombreAlumno;
		this.telefonoAlumno = telefonoAlumno;
		this.portatilDAO = portatilDAO;
	}
	
	//Contructor con nombre telefono y objeto Portatil
	public AlumnoDTO( String nombreAlumno, int telefonoAlumno, PortatilDAO portatilDAO) {
		super();
		
		this.nombreAlumno = nombreAlumno;
		this.telefonoAlumno = telefonoAlumno;
		this.portatilDAO = portatilDAO;
	}
	
	//Constructor vacio
	public AlumnoDTO() {
		super();
		
	}

	
	
	
	
}
