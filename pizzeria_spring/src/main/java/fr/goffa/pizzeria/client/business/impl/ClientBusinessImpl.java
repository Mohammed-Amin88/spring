package fr.goffa.pizzeria.client.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.goffa.pizzeria.client.business.IClientBusiness;
import fr.goffa.pizzeria.client.domain.Clients;

@Service
public class ClientBusinessImpl implements IClientBusiness {

	@Override
	public List<Clients> getClients() {

		List<Clients> liste = new ArrayList<>();
		Clients c1 = new Clients("Bob", "B");
		Clients c2 = new Clients("Jack", "J");
		Clients c3 = new Clients("Hossin", "H");
		Clients c4 = new Clients("Marck", "M");

		liste.add(c1);
		liste.add(c2);
		liste.add(c3);
		liste.add(c4);

		return liste;
	}
}
