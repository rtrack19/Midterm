package com.cisc181.core;

import java.util.Date;

public class PersonException extends Exception{
	private Person Person;

	public Person getPerson() {
		return Person;
	}

	public void setPerson(Person person) {
		Person = person;
	}
	public PersonException(Person Person){
		super();
		this.Person=Person;
	}

}
