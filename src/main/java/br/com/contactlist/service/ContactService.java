package br.com.contactlist.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import br.com.contactlist.entity.ContactEntity;
import br.com.contactlist.repository.ContactRepository;

@Service
public class ContactService {

	private ContactRepository contactRepository;

	public ContactService(ContactRepository contactRepository) {

		this.contactRepository = contactRepository;
	}

	/*
	 * Pensando na integração com os outros times, como por exemplo o front end,
	 * Todas as operações, GET, POST, PUT, DELETE, vão retornar uma lista
	 */
	
	
	public List<ContactEntity> create(ContactEntity contactEntity) { //Operação que vai ser o POST no controller e vai criar os objetos
		contactRepository.save(contactEntity);
		
		return list();
	
	}

	public List<ContactEntity> list(){  // operação que vai ser o GET no controller que irá retornar todos os objetos
		
		Sort sort = Sort.by(Direction.DESC, "prioridade")
				.and(Sort.by(Direction.ASC, "id"));
		
		return contactRepository.findAll(sort);
		
	}
	

	public ContactEntity update(ContactEntity contactEntity){ //Operação que vai ser o PUT no controller e vai atualizar os objetos
		
			contactRepository.save(contactEntity);
			
		   return contactEntity;		
	}
		
	public List<ContactEntity> delete(Long id){ //Operação que vai ser o DELETE no controller e vai apagar os objetos
		contactRepository.deleteById(id);
		
		return list();
		
	}

} 