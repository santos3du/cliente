package br.com.eduardo.cliente.dto;

import java.io.Serializable;
import java.time.Instant;

import br.com.eduardo.cliente.entities.Client;

public class ClientDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String cpf;
	private Double income;
	private Instant birthDate;
	private Integer children;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	public Instant getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Instant birthDate) {
		this.birthDate = birthDate;
	}

	public Integer getChildren() {
		return children;
	}

	public void setChildren(Integer children) {
		this.children = children;
	}

	public ClientDto() {}

	public ClientDto(Long id, String name, String cpf, Double income, Instant birthDate, Integer children) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.setIncome(income);
		this.birthDate = birthDate;
		this.children = children;
	}
	
	public ClientDto(Client entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.cpf = entity.getCpf();
		this.setIncome(entity.getIncome());
		this.birthDate = entity.getBirthDate();
		this.children = entity.getChildren();
	}

	

}
	
	
