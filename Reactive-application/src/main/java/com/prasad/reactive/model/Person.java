package com.prasad.reactive.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(ignoreUnknown=true)
public class Person {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private Long personId;
	private String name;
	public Long getPersonId() {
		return personId;
	}
	public void setPersonId(Long personId) {
		this.personId = personId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public boolean equals(Object other) {
		if (this == other) return true;
		if (other == null || getClass() != other.getClass()) return false;
		Person person = (Person) other;
		return personId.equals(person.personId);
	}

	@Override
	public int hashCode() {
		return personId.hashCode();
	}

	@Override
	public String toString() {
		return "Person {personId=" + this.personId + ", name='" + this.name + "'}";
	}
	
}
