package br.com.contactlist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.contactlist.entity.ContactEntity;


public interface ContactRepository extends JpaRepository<ContactEntity, Long>{

}
