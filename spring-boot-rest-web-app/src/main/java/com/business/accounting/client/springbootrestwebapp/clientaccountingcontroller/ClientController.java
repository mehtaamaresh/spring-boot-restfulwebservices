package com.business.accounting.client.springbootrestwebapp.clientaccountingcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.business.accounting.client.springbootrestwebapp.clientaccountingbean.ClientBean;
import com.business.accounting.client.springbootrestwebapp.clientaccountingbean.ClientType;
import com.business.accounting.client.springbootrestwebapp.clientaccoutingservice.ClientService;

@RestController
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	@GetMapping(path="/clients/{clientType}")
	public List<ClientBean> retrieveClients(@PathVariable ClientType clientType){
		return clientService.retriveClientsService(clientType);
		
	}
	
	@GetMapping(path="/client/{clientId}")
	public Optional<ClientBean> retrieveClient(@PathVariable Integer clientId){
		return clientService.retrieveClientService(clientId);
		
	}
	
	@PostMapping(path="/client")
	public void addClient(@RequestBody ClientBean client){
		clientService.addClientService(client);
		
	}

}
