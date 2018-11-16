package fr.goffa.pizzeria.pizza.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.goffa.pizzeria.pizza.business.IPizzaBuisiness;
import fr.goffa.pizzeria.pizza.domain.Pizza;

@Service
public class PizzaBusinessImpl implements IPizzaBuisiness{

	@Override
	public List<Pizza> getPizzas(){
		List<Pizza> pizzasListe = new ArrayList<>();
		
		Pizza p1= new Pizza("3 Fromages",15.00);
		Pizza p2= new Pizza("Fruit de mer",20.00);
		Pizza p3= new Pizza("Margarita",12.00);
		Pizza p4= new Pizza("Thon",17.00);
		Pizza p5= new Pizza("autres",11.00);
		
		
		pizzasListe.add(p1);
		pizzasListe.add(p2);
		pizzasListe.add(p3);
		pizzasListe.add(p4);
		pizzasListe.add(p5);
		
		
		return pizzasListe;
	}

	@Override
	public List<String> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
	

}
