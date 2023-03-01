package es.juancadc.ejemploWeb;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import es.juancadc.ejemploWeb.aplicacion.AplicacionConfiguracionContexto;
import es.juancadc.ejemploWeb.web.WebConfiguracionContexto;

/**
 * 
 * @author Juanca
 * EnrutadorEjemploWeb:Clase configuracion a nivel aplicacion.
 *
 */

public class EnrutadorEjemploWeb extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { AplicacionConfiguracionContexto.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { WebConfiguracionContexto.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}
