package com.hb04.bi_onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student04 {

	@Id
	private int id;

	@Column(name = "std_name")
	private String name;

	private int grade;
	
	//eğer mappedBy kullanılmazsa her iki taraftada ilişki için bir sütun oluşur.
	@OneToOne(mappedBy="student")
	private Diary02 diary;

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
	
	public Diary02 getDiary() {
		return diary;
	}

	public void setDiary(Diary02 diary) {
		this.diary = diary;
	}

	@Override
	public String toString() {
		return "Student04 [id=" + id + ", name=" + name + ", grade=" + grade +"]";
	}

}
