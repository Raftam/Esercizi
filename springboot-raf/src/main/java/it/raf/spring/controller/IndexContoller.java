package it.raf.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import it.raf.spring.model.Utente;

@Controller
public class IndexContoller {

	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/contatti")
	public String contatti() {
		return "contatti";
	}
	
	@GetMapping("/chi-sono")
	public String chi_sono() {
		return "chi_sono";
	}
	
	@GetMapping("/servizi")
	public String servizi() {
		return "servizi";
	}
	
	@PostMapping("/registrazione")
	public String registrazioneUtente(@ModelAttribute Utente utente, Model model) {
		System.out.print(utente.toString());
		
		System.out.println(utente.getNome());
		System.out.println(utente.getCognome());
		System.out.println(utente.getTelefono());
		System.out.println(utente.getEmail());
		model.addAttribute("nome", "Nome: "+utente.getNome());
		model.addAttribute("cognome", "Cognome: "+utente.getCognome());
		model.addAttribute("telefono", "Telefono: "+utente.getTelefono());
		model.addAttribute("email", "Email: "+utente.getEmail());
		
		return "registrato";
	}
	
}
