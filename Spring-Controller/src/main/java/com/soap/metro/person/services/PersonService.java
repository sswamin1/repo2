package com.soap.metro.person.services;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;

import com.soap.metro.entity.Person;

@WebService
@SOAPBinding(parameterStyle=ParameterStyle.BARE)
public interface PersonService {

	public Person getPerson(String Person);
}
