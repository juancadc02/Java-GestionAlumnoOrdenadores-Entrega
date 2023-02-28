package es.juancadc.ejemploWeb.aplicacion.DAO;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Juanca
 * 
 * DAO para la entidad del portatilDAO
 */

@Entity
@Table(name="portatilesAlumnos",schema = "public")
public class PortatilDAO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "numeroIdentificador", nullable = false)
	private Integer numeroIdentificador;

	@Column(name = "marcaPortatil")
	private String marcaPortatil;

	@Column(name = "modeloPortatil")
	private String modeloPortatil;


	public Integer getNumeroIdentificador() {
		return numeroIdentificador;
	}

	public void setNumeroIdentificador(Integer numeroIdentificador) {
		this.numeroIdentificador = numeroIdentificador;
	}

	public String getMarcaPortatil() {
		return marcaPortatil;
	}

	public void setMarcaPortatil(String marcaPortatil) {
		this.marcaPortatil = marcaPortatil;
	}

	public String getModeloPortatil() {
		return modeloPortatil;
	}

	public void setModeloPortatil(String modeloPortatil) {
		this.modeloPortatil = modeloPortatil;
	}

	// Constructor para el añadir los portatiles a la base de datos 
	
	public PortatilDAO(String marcaPortatil, String modeloPortatil) {
		super();
		this.marcaPortatil = marcaPortatil;
		this.modeloPortatil = modeloPortatil;
	}
	
	//Creamos el contructor por defecto vacio 
	
	public PortatilDAO() {
		super();
		
	}

	
	
	

	
	
	
	
	
	
}
