package fr.goffa.pizzeria.pizza.controller;

import org.springframework.ui.Model;

public interface IPizzaController {
	public String test(Model model);

	public String getTableau(Model model);
	
	public String afficherLesPizzas(Model model);
}
