package com.business.accounting.client.springbootrestwebapp.clientaccoutingservice;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.business.accounting.client.springbootrestwebapp.clientaccountingbean.ClientBean;
import com.business.accounting.client.springbootrestwebapp.clientaccountingbean.ClientType;
import com.business.accounting.client.springbootrestwebapp.clientaccoutingrepository.ClientRepository;

@Component
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;
	
	public List<ClientBean> retriveClientsService(ClientType clientType){
		return clientRepository.findByClientType(clientType);
		
	}
	
	public Optional<ClientBean> retrieveClientService(Integer clientId) {
		return clientRepository.findById(clientId);
		
	}
	
	public void addClientService(ClientBean client) {
		clientRepository.save(client);
	}

}
