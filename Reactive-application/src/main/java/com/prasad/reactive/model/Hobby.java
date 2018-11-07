package com.prasad.reactive.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(ignoreUnknown=true)
public class Hobby {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private Long personId;
	private String hobby;
	public long getPersonId() {
		return personId;
	}
	public void setPersonId(long personId) {
		this.personId = personId;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	@Override
	public boolean equals(Object other) {
		if (this == other) return true;
		if (other == null || getClass() != other.getClass()) return false;
		Hobby hobby = (Hobby) other;
		return personId.equals(hobby.personId);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return personId.hashCode();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hobby {personId=" + this.personId + ", hobby='" + this.hobby + "'}";
	}
	
}
