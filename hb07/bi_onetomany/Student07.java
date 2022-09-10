package com.hb07.bi_onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student07 {
	
	@Id
	private int id;
	
	@Column(name="student_name",nullable = false)
	private String name;
	
	private int grade;
	
	//orphan=yetim
	//orphanRemoval = true, parent silinirse, child da silinsin. Eğer bir obje yetim kalırsa onuda db'den sil.
	@OneToMany( mappedBy = "student",orphanRemoval = true)
	private List<Book07> bookList=new ArrayList<>();

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

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}


	public List<Book07> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book07> bookList) {
		this.bookList = bookList;
	}

	@Override
	public String toString() {
		return "Student07 [id=" + id + ", name=" + name + ", grade=" + grade + ", bookList=" + bookList + "]";
	}
	
	
}
