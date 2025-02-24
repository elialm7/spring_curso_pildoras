package spring.IOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	/*	
		SecretarioEmpleado juan = context.getBean("miSecretario", SecretarioEmpleado.class);
		
		System.out.println(juan.getTareas());
		System.out.println(juan.getInforme());
		System.out.println(juan.getEmail());
		System.out.println(juan.getNombreEmpresa());*/
		
		
		
		Empleados emp = context.getBean("miDirector", Empleados.class);
		System.out.println(emp.getTareas());
		System.out.println(emp.getInforme());
		context.close();

	}

}
