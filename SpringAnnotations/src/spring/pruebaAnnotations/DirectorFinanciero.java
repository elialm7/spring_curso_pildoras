package spring.pruebaAnnotations;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleados {
	
	public DirectorFinanciero(CreacionInformeFinanciero informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestion y Direccion de las operaciones  financieras de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return informeNuevo.getInformeFinanciero();
	}

	@PreDestroy
	public void mostrarDatos() {
		System.out.println(email + " : "+ datosEmpresas);
	}
	



	@Value("${email}")
	private String email;
	
	@Value("${nombreEmpresa}")
	private String datosEmpresas;
	
	private CreacionInformeFinanciero informeNuevo;
}
