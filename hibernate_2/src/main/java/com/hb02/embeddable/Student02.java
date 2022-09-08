package com.hb02.embeddable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

//Ctrl+Shift+O
//Ctrl+Space

//Bu annotationu koyduğumuz sınıf veritabanında bir tabloya karşılık gelecek
@Entity
//Eğer oluşacak tablo ismini değiştirmek istenirse name attribute ile bir tablo ismi verilir.
@Table(name="t_student02")
public class Student02 {
	
	//primary key oluşmasını sağlıyor.
	@Id
	//@Column(name="std_id")
	private int id;
	
	//length default=255
	//nullable=true /default
	//unique=false default 
	//Column annotationı zorunlu değil ancak customize edebilmek için  gerekli
	@Column(name="student_name",length = 100,nullable = false,unique=false)
	private String name;
	
	//veritabanı tablosunda grade adında bir kolon oluşturulmaz
	//@Transient
	private int grade;
	
    //large object ile büyük boyutlu datalar tutulabilir. 
//	@Lob
//	private byte [] image; 
	
	//@Embedded
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

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

	@Override
	public String toString() {
		return "Student02 [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}
	

}
