package spring.IOC;

public class SecretarioEmpleado implements Empleados {
	
	
	private String email; 
	private String nombreEmpresa;
	private CreacionInformes informeNuevo;
	

	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar las agendas de los jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Inform generado por el secretario: "+informeNuevo.getInforme();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	
	
}
