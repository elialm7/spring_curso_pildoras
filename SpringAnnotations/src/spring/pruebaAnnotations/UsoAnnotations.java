package spring.pruebaAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Empleados elias = context.getBean("ComercialExperimentado", Empleados.class);
		
		
		System.out.println(elias.getInforme());
		System.out.println(elias.getTareas());

	}

}
