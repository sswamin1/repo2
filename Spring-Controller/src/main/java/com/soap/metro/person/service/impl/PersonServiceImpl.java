package com.soap.metro.person.service.impl;

import javax.jws.WebService;

import com.soap.metro.entity.Person;
import com.soap.metro.person.services.PersonService;

@WebService(endpointInterface = "com.soap.metro.person.services.PersonService")
public class PersonServiceImpl implements PersonService{

	@Override
	public Person getPerson(String Person) {
		Person person = new Person();
		person.setPersonId(3);
		person.setPersonName("Saravana");
		System.out.println("printing for change");
		System.out.println("Why are u not detecting this?");
		return person;
	}

	
}
