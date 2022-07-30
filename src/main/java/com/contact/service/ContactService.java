package com.contact.service;

import java.util.List;

import com.contact.entity.Contacts;

public interface ContactService {

	public List<Contacts> getContact(Long userId);
}
