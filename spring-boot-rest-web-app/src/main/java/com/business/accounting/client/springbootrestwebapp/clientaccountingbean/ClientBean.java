package com.business.accounting.client.springbootrestwebapp.clientaccountingbean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ClientBean {
	
	@Id
	@GeneratedValue
	private Integer clientId;
	private String clientName;
	private ClientType clientType;
	@Column(length = 1000)
	private String clientDescription;
	@Column(length = 1000)
	private String comments;
	
	public ClientBean() {
		super();
	}

	public ClientBean(Integer clientId, String clientName, ClientType clientType, String clientDescription,
			String comments) {
		super();
		this.clientId = clientId;
		this.clientName = clientName;
		this.clientType = clientType;
		this.clientDescription = clientDescription;
		this.comments = comments;
	}

	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public ClientType getClientType() {
		return clientType;
	}

	public void setClientType(ClientType clientType) {
		this.clientType = clientType;
	}

	public String getClientDescription() {
		return clientDescription;
	}

	public void setClientDescription(String clientDescription) {
		this.clientDescription = clientDescription;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "ClientBean [clientId=" + clientId + ", clientName=" + clientName + ", clientType=" + clientType
				+ ", clientDescription=" + clientDescription + ", comments=" + comments + "]";
	}

}
