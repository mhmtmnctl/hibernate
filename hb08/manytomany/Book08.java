package com.hb08.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Book08 {

	@Id
	private int id;
	
	private String name;
	
	//aşağıdaki 2 satır çift taraflı many-to-many mapping için
	@ManyToMany(mappedBy = "bookList")
	private List<Student08> students = new ArrayList<Student08>();

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
	
	@Override
	public String toString() {
		return "Book07 [id=" + id + ", name=" + name + "]";
	}

	public List<Student08> getStudents() {
		return students;
	}

	public void setStudents(List<Student08> students) {
		this.students = students;
	}
	
}
