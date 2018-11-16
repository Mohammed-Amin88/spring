package fr.goffa.pizzeria.client.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.goffa.pizzeria.client.business.IClientBusiness;
import fr.goffa.pizzeria.client.controller.IClientController;
import fr.goffa.pizzeria.client.domain.Clients;

@Controller
public class ClientControllerImpl implements IClientController {

	@Autowired
	private IClientBusiness clientBusiness;

	@Override
	@RequestMapping("/clients")
	public String afficherLesClients(Model model) {
		List<Clients> clients = clientBusiness.getClients();

		model.addAttribute("clients", clients);

		return "clients";
	}

}
