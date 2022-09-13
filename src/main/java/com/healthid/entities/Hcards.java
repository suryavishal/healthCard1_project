package com.healthid.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hCards")
public class Hcards {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="adhar_card", nullable= false ,unique= true)
	private long adharCard;
	
	@Column(name="patient_name",nullable = false )
	private String name;
	
	@Column(name="age", nullable=false)
	private int age;
	
	@Column(name="gender", nullable=false)
	private char gender;
	
	@Column(name="patient_history")
	private String diseaseHistory;
	
	@Column(name="duration_of_illness")
	private long durationOfIllness;
	
	@Column(name="doctor_name")
    private String doctorName;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getAdharCard() {
		return adharCard;
	}

	public void setAdharCard(long adharCard) {
		this.adharCard = adharCard;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getDiseaseHistory() {
		return diseaseHistory;
	}

	public void setDiseaseHistory(String diseaseHistory) {
		this.diseaseHistory = diseaseHistory;
	}

	public long getDurationOfIllness() {
		return durationOfIllness;
	}

	public void setDurationOfIllness(long durationOfIllness) {
		this.durationOfIllness = durationOfIllness;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	
	
   
    

}
