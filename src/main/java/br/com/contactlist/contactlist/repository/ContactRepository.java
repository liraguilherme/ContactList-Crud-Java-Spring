package br.com.contactlist.contactlist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.contactlist.contactlist.entity.ContactEntity;


public interface ContactRepository extends JpaRepository<ContactEntity, Long>{

}
