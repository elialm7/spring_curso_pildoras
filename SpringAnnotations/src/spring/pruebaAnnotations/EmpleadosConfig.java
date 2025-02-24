package spring.pruebaAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("spring.pruebaAnnotations")
@PropertySource("classpath:datosEmpresas.propiedades")
public class EmpleadosConfig {
	

	
	@Bean
	public CreacionInformeFinanciero informefinancieroDtoCompras() {
		return new InformeFinancieroDtoCompras();
	}

	
	@Bean
	public Empleados directorFinanciero() {
		return new DirectorFinanciero(informefinancieroDtoCompras());
	}
}
