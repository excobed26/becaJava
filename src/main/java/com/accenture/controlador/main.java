package com.accenture.controlador;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class main {
	@RequestMapping (value ="/main")
	public String sayHello (Model model) {
			model.addAttribute("llaveSaludo", "Que rollo!");
			return "main";
	}
}
