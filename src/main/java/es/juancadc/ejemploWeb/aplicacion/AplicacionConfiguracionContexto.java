package es.juancadc.ejemploWeb.aplicacion;

import java.util.Properties;


import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;


import es.juancadc.ejemploWeb.aplicacion.DAO.AlumnoDAO;

/**
 * Definición de la configuración del contexto general de la aplicación
 * @author juanca
 *
 */
@Configuration
@ComponentScan
@PropertySource(value ="classpath:configuracion.properties")
@EnableJpaRepositories(value = "es.juancadc.ejemploWeb.aplicacion.DAO")
public class AplicacionConfiguracionContexto {

	
	@Autowired
	private Environment env;
	@Bean
	public DataSource dataSource() {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getProperty("database.driver"));
		dataSource.setUrl(env.getProperty("database.url"));
		dataSource.setUsername(env.getProperty("database.username"));
		dataSource.setPassword(env.getProperty("database.password"));
		return dataSource;
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {

		LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();
		entityManagerFactory.setDataSource(dataSource());
		entityManagerFactory.setPackagesToScan(AlumnoDAO.class.getPackage().getName());
		
		
		HibernateJpaVendorAdapter hibernateJpa = new HibernateJpaVendorAdapter();
		hibernateJpa.setDatabase(Database.POSTGRESQL);
		hibernateJpa.setDatabasePlatform("org.hibernate.dialect.PostgreSQLDialect");
		hibernateJpa.setGenerateDdl(true);
		hibernateJpa.setShowSql(true);
		entityManagerFactory.setJpaVendorAdapter(hibernateJpa);
		
		Properties propiedades = new Properties();
		propiedades.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
		propiedades.put("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
		propiedades.put("hibernate.format_sql", env.getProperty("hibernate.format_sql"));
		entityManagerFactory.setJpaProperties(propiedades);

		return entityManagerFactory;

	}

	@Bean
	public JpaTransactionManager transactionManager() {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
		return transactionManager;
	}

	
}
