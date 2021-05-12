package com.cpe.card.card.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Family")
@Table(name="Family")
public class Family {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Family(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Family() {
		
	}
	
	
}
