package com.healthid.dto;

public class PatientData {
	
	private long id;	
	private long adharCard;
	private String name;
	private int age;
	private char gender;
	private String diseaseHistory;
	private long durationOfIllness;
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