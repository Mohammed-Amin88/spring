package fr.goffa.pizzeria.pizza.business;

import java.util.List;

import fr.goffa.pizzeria.pizza.domain.Pizza;

public interface IPizzaBuisiness {
	public List<String> getList();

	public List<Pizza> getPizzas();
	

}

