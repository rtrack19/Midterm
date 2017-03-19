package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	private UUID SectionId;
	private UUID StudentId;
	private UUID EnrollmentId;
	private double Grade;
	public UUID getSectionId() {
		return SectionId;
	}
	public void setSectionId(UUID sectionId) {
		SectionId = sectionId;
	}
	public UUID getStudentId() {
		return StudentId;
	}
	public void setStudentId(UUID studentId) {
		StudentId = studentId;
	}
	public UUID getEnrollmentId() {
		return EnrollmentId;
	}
	public void setEnrollmentId(UUID enrollmentId) {
		EnrollmentId = enrollmentId;
	}
	public double getGrade() {
		return Grade;
	}
	public void setGrade(double grade) {
		Grade = Grade;
	}
	
	private Enrollment(){
		
	}
	public Enrollment(UUID SectionId, UUID StudentId){
		this.SectionId = SectionId;
		this.StudentId = StudentId;
		this.EnrollmentId=UUID.randomUUID();
		this.Grade = 0;
	}

}
