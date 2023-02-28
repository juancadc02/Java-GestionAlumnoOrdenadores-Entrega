package es.juancadc.ejemploWeb.aplicacion.DAO;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Juanca
 * 
 * DAO para la entidad del alumnoDAO
 */


@Entity
@Table(name="alumnos",schema = "public")
public class AlumnoDAO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "numeroAlumno", nullable = false)
	private Integer numeroAlumno;

	@Column(name = "nombreAlumno", nullable = false)
	private String nombreAlumno;

	@Column(name = "telefonoAlumno", nullable = false)
	private int telefonoAlumno;

	@OneToOne(cascade = CascadeType.MERGE)
	PortatilDAO portatilDAO;

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

	//Constructor para añadir los alumnos a la base de datos.
	public AlumnoDAO(String nombreAlumno, int telefonoAlumno, PortatilDAO portatilDAO) {
		super();
		this.nombreAlumno = nombreAlumno;
		this.telefonoAlumno = telefonoAlumno;
		this.portatilDAO = portatilDAO;
	}
	
	//Creamos el contructor por defecto vacio 
	public AlumnoDAO() {
		super();
		
	}

	//Constructor para eliminar alumno
	
	public AlumnoDAO(Integer numeroAlumno) {
		super();
		this.numeroAlumno = numeroAlumno;
	}
	

	

	
	
	
	
	
	
	
	
	
	
}
