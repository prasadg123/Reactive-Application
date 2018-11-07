package com.prasad.reactive.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(ignoreUnknown=true)
public class Account {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)	
	private Long id;
	
	private Long AccountId;
	public Long getAccountId() {
		return AccountId;
	}

	public void setAccountId(Long accountId) {
		AccountId = accountId;
	}

	private int score;
	private long personId;
	
	public Account() {
		
	}
	
	public Account(Long AccountId,int score,long personId)
	{
		this.AccountId=AccountId;
		this.score=score;
		this.personId=personId;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public long getPersonId() {
		return personId;
	}
	public void setPersonId(long personId) {
		this.personId = personId;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Account {id= "+id+"score= "+score+"personId= "+personId+"}";
	}
	
	
}
