
package fr.goffa.pizzeria.pizza.controller.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.goffa.pizzeria.pizza.business.IPizzaBuisiness;
import fr.goffa.pizzeria.pizza.controller.IPizzaController;
import fr.goffa.pizzeria.pizza.domain.Pizza;


@Controller
public class PizzaControllerImpl implements IPizzaController {
	@Autowired
	private IPizzaBuisiness pizzzaBusiness;
	
	
	@Override 
	@RequestMapping("/test")
	public String test(Model model) {
		String chaine = " Thymeleaft";
		model.addAttribute("ch",chaine);
	return  "pizza/test";
	}
	
	@Override 
	@RequestMapping("/tableau")
	public String getTableau(Model model) {
		List<String> liste = new ArrayList<>();
		liste.add("Bonjour");
		liste.add("Bonsoir");
		liste.add("Salut");
		model.addAttribute("liste",liste);
		
		return  "tableau";
	}
	
	@Override 
	@RequestMapping("/pizzas")
	public String afficherLesPizzas(Model model) {
		List<Pizza> pizzas  = pizzzaBusiness.getPizzas();
		model.addAttribute("pizzas",pizzas);
		
		
	return  "pizza/pizzas";
	}
	
}


