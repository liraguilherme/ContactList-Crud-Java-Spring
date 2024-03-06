package br.com.contactlist.contactlist.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.contactlist.contactlist.entity.ContactEntity;
import br.com.contactlist.contactlist.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {

	
	private ContactService contactService;
	
	public ContactController(ContactService contactService) {
		this.contactService = contactService;
	}
	
	
	@PostMapping // metodo para criar de objetos 
	List<ContactEntity> create(@RequestBody ContactEntity contactEntity){
		
		return contactService.create(contactEntity);
		
	}
	
	@GetMapping // metodo para retornar todos os objetos 
	List<ContactEntity> list(){
		
	return contactService.list();	
	}
	
	@PutMapping("{id}") //Metodo para atualização de objetos
	List<ContactEntity> update(@PathVariable Long id, @RequestBody ContactEntity contactEntity){
		
		return contactService.update(id, contactEntity);
		
	}
	
	@DeleteMapping("{id}")
	List<ContactEntity> delete(@PathVariable("id") Long id) {
		return contactService.delete(id);
	}
	
	
	
	
	
	
	
	
	
}
