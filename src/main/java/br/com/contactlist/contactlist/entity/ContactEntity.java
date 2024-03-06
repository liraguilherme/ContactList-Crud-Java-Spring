package br.com.contactlist.contactlist.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "contact")
public class ContactEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	private String name;
	
	@NotBlank
	private String number;
	
	
	@NotBlank
	private String description;
	
	private int prioridade;
	
	public ContactEntity() {
		
		
	}

	public ContactEntity(Long id, @NotBlank String name, String number, @NotBlank String description, int prioridade) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
        this.description = description;
		this.prioridade = prioridade;
	
	}

	public ContactEntity( String name, String number, String description, int prioridade) {
		super();
		this.name = name;
		this.number = number;
        this.description = description;
		this.prioridade = prioridade;
	

	}

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

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	} 
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}


	
	
	
	

}
