package com.cristiano.workshopmongodb.dto;

import java.io.Serializable;

import org.hibernate.validator.internal.IgnoreForbiddenApisErrors;

import com.cristiano.workshopmongodb.domain.User;

public class UserDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String id;
	private String email;
	private String nome;
	

	public UserDTO() {
			
	}
	
	public UserDTO(User obj) {
		super();
		this.id = obj.getId();
		this.email = obj.getEmail();
		this.nome = obj.getNome();
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
