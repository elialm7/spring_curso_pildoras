package spring.mvc;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Controlador {

	
	@RequestMapping
	public String muestraPagina() {
		return "paginaEjemplo";
	}
	
}
