package conexionHibernate;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Table(name="clientes")
public class Clientes {
	
	
	
	
	public Clientes() {
		
	}

	public Clientes(String nombre, String apellido, String direccion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="direccion")
	private String direccion;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Clientes [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
				+ "]";
	}
	
	
	

}
