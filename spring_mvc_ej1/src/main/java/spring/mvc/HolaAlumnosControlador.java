package spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HolaAlumnosControlador {

	
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario() {
		return "HolaAlumnosFormulario";
	}
	
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario() {
		
		 return "HolaAlumnosSpring";
	}
	
	
	@RequestMapping("/procesarFormulario2")
	public String otroProcesoFormulario(HttpServletRequest request, Model model) {
		
		String nombre = request.getParameter("nombreAlumno");
		nombre+= " es el mejor alumno";
		
		String mensajeFinal = "Quien es el mejor alumno? " + nombre;
		
		model.addAttribute("mensajeClaro", mensajeFinal);
		
		 return "HolaAlumnosSpring";
	}
	
}
