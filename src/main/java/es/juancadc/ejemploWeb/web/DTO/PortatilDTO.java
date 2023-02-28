package es.juancadc.ejemploWeb.web.DTO;

/**
 * @author Juanca Clase de la entidad PortatilDAO a PortatilDTO
 *         
 */

public class PortatilDTO {

	private Integer identificadorPortatil;
	private String marcaPortatil;
	private String modeloPortatil;
	
	//Getters and Setters
	
	public Integer getIdentificadorPortatil() {
		return identificadorPortatil;
	}
	public void setIdentificadorPortatil(Integer identificadorPortatil) {
		this.identificadorPortatil = identificadorPortatil;
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
	
	//Contructor completo
	public PortatilDTO(Integer identificadorPortatil, String marcaPortatil, String modeloPortatil) {
		super();
		this.identificadorPortatil = identificadorPortatil;
		this.marcaPortatil = marcaPortatil;
		this.modeloPortatil = modeloPortatil;
	}
	
	//Constructor con marca y modelo
	
	public PortatilDTO(String marcaPortatil, String modeloPortatil) {
		super();
		
		this.marcaPortatil = marcaPortatil;
		this.modeloPortatil = modeloPortatil;
	}
	
	//Constructor por defecto
	
	public PortatilDTO() {
		super();
		
	}
	
	
	

}
