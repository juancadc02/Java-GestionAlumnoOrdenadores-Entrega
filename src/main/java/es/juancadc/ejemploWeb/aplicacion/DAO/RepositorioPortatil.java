package es.juancadc.ejemploWeb.aplicacion.DAO;

import org.springframework.data.repository.CrudRepository;

/**
 * @author Juanca
 * Interfaz del RepositorioPortatil que hereda los metodos de CrudRepository
 */

public interface RepositorioPortatil extends CrudRepository<PortatilDAO, Integer> {

}
