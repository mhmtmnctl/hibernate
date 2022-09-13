package com.hb10.idgenerationstrategy;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book10 extends BaseEntity {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Book09 [id=" + getId()  + ", name=" + name + "]";
	}
	
}
