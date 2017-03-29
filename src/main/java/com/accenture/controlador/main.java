package com.accenture.controlador;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.accenture.modelo.Caja;

@Controller
public class main {
	@RequestMapping (value ="/main")
	public String numCajas (@ModelAttribute ("caja")Caja caja) {
			System.out.println("cantidad: "+caja.getCantidad());
			return "main";
	}
}
