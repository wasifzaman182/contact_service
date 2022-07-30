package com.contact.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contacts;

@Service
public class ContactServiceImpl implements ContactService {

	List<Contacts> list = new ArrayList<Contacts>();
	
	@Override
	public List<Contacts> getContact(Long userId) {
		
		list.add(new Contacts(1L, "waif@gamil.com", "wasif", 1231L));
		list.add(new Contacts(2L, "yasir@gamil.com", "yasir", 1232L));
		list.add(new Contacts(3L, "JAWAD@gamil.com", "jawad", 1233L));
		list.add(new Contacts(4L, "KASHIF@gamil.com", "kashif", 1234L));
		list.add(new Contacts(5L, "atif@gamil.com", "ATIF", 1235L));
		list.add(new Contacts(6L, "abid@gamil.com", "ABID", 1231L));
		
		return list.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
