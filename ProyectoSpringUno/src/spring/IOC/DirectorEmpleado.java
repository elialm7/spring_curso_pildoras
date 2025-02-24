package spring.IOC;

public class DirectorEmpleado implements Empleados {

	private  CreacionInformes informeNuevo;
	
	
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar La plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el director : "+informeNuevo.getInforme();
	}
	
	//metodo init: ejecutar tareas antes que el bean este disponible
	
	public void init() {
		System.out.println("Dentro del metodo init: aqui irian las tareas a ejecutar antes del que el bean este listo");
	}
	
	//metodo destroy: ejecutar tareas despues de que el bean haya sido utilizado
	
	public void destroy() {
		System.out.println("Dentro del metodo dstroy: aqui irian las tareas a ejecutar dps de user el bean");
		
	}
	

}
