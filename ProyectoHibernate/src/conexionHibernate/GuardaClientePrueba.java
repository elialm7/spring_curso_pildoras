package conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GuardaClientePrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		SessionFactory myFactory = new Configuration().configure("hibernate.cgf.xml").addAnnotatedClass(Clientes.class).buildSessionFactory();
		
		Session session = myFactory.openSession();
		try {
			Clientes c1 = new Clientes("Rodolfo Elias", "Ojeda Almada", "km8");
			session.beginTransaction();
			
			session.save(c1);
			
			session.getTransaction().commit();
			
			System.out.println("Registro insertado correctamente en base de datos");
			
			//Lectura de registro
			
			session.beginTransaction();
			
			System.out.println("Lectura de registro de la base de datos");
			
			Clientes insertado = session.get(Clientes.class, c1.getId());
			
			System.out.println(insertado.toString());
			
			session.getTransaction().commit();
			
			
			
			session.close();
			
		}finally {
			
			myFactory.close();
			
		}

	}

}
