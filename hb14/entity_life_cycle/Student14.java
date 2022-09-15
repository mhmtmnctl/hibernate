package com.hb14.entity_life_cycle;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student14 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "student_name", nullable = false)
	private String name;

	private int mathGrade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMathGrade() {
		return mathGrade;
	}
	
	public void setMathGrade(int mathGrade) {
		this.mathGrade = mathGrade;
	}


	@Override
	public String toString() {
		return "Student14 [id=" + id + ", name=" + name + ", mathGrade=" + mathGrade + "]";
	}


}
