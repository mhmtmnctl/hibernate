package com.hb10.idgenerationstrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Student10 extends BaseEntity {

	
	//BaseEntity'de @Id annotation olduğu için artık aşağıdaki @Id ihtiyaç yok.
	//@Id
	// @GeneratedValue //AUTO
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	// @GeneratedValue(strategy = GenerationType.SEQUENCE)
	// @GeneratedValue(strategy = GenerationType.TABLE)

//	@GeneratedValue(generator = "sequence", strategy = GenerationType.SEQUENCE)
//	@SequenceGenerator(name = "sequence",sequenceName = "student_seq",initialValue=1000, allocationSize = 10)

	
	//f7b6acf6-774f-4037-b4b8-e0b33b050a20
	//8-4-4-4-12=32=32*4=128 bit
//	@GeneratedValue(generator = "UUID")
//	@GenericGenerator(name = "UUID", strategy = "uuid2")
//	private String id;

	// private Long id;

	@Column(name = "student_name", nullable = false)
	private String name;

	private int grade;

//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}

//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}

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

	@Override
	public String toString() {
		return "Student10 [id=" + getId() + ", name=" + name + ", grade=" + grade + "]";
	}

}
