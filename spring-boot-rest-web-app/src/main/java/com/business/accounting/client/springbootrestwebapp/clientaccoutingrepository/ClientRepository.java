package com.business.accounting.client.springbootrestwebapp.clientaccoutingrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.business.accounting.client.springbootrestwebapp.clientaccountingbean.ClientBean;
import com.business.accounting.client.springbootrestwebapp.clientaccountingbean.ClientType;

@Repository
public interface ClientRepository extends JpaRepository<ClientBean, Integer>{

	public List<ClientBean> findByClientType(ClientType clientType);
}
