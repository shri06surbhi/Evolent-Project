package com.spring.contact.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.spring.contact.model.Contact;

/**
 * Defines DAO operations for the contact model.
 *
 */

public interface ContactDAO {
	
	public void saveOrUpdate(Contact contact);
	
	public void delete(int contactId);
	
	public Contact get(int contactId);
	
	public List<Contact> list();
}
