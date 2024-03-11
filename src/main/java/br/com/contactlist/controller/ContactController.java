package br.com.contactlist.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.contactlist.entity.ContactEntity;
import br.com.contactlist.service.ContactService;
import br.com.contactlist.util.MediaType;

@RestController
@RequestMapping("/contact/v1") //V1 para versões da API
public class ContactController {

	
	private ContactService contactService;
	
	public ContactController(ContactService contactService) {
		this.contactService = contactService;
	}
	//Trocamos o mediaType pelo mediaType da classe que criamos, e apagamos o value do json
	
	@PostMapping(consumes = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,
			MediaType.APPLICATION_YML},
	             produces = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,
	            		 MediaType.APPLICATION_YML}) // metodo para criar de objetos 
	
	List<ContactEntity> create(@RequestBody ContactEntity contactEntity){
		
		return contactService.create(contactEntity);
		
	}
	
	@GetMapping( produces = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,
			MediaType.APPLICATION_YML})// metodo para retornar todos os objetos 
	List<ContactEntity> list(){
		
	return contactService.list();	
	}
	
	
	//VOLTAR PARA VERIFICAR O ID
	@PutMapping(
			consumes = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,
					MediaType.APPLICATION_YML  },
			produces = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML,
					MediaType.APPLICATION_YML  })
		public ContactEntity update(@RequestBody ContactEntity contactEntity) {
			return contactService.update(contactEntity);
		}
		
	
	@DeleteMapping("{id}") //Não tem produces e nem consumes pois só recebe id e não retorna nenhum conteudo
	List<ContactEntity> delete(@PathVariable("id") Long id) {
		return contactService.delete(id);
	}
	
}