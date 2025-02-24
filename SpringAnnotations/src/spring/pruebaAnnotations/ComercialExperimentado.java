package spring.pruebaAnnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ComercialExperimentado")
//@Scope("prototype") //el modo es singleton por defecto , con protoype spring no maneja el ciclo completo bean, es decir @PreDestroy no se ejecuta
public class ComercialExperimentado implements Empleados {

	@Qualifier("informeFinancieroTrim4")
	@Autowired
	private CreacionInformeFinanciero nuevoInforme;
	
	/*@Autowired
	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}*/
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vender mas";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return nuevoInforme.getInformeFinanciero();
	}

	/*@Autowired
	public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}*/
	
	
	/*@PostConstruct
	public void init() {
		System.out.println("Se ejecuta despues de inicializar");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Se ejecuta antes de terminar(ciclo de vida del bean)");
	}
	*/
	

}
