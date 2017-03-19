package com.cisc181.core;
import java.util.Date;
import java.util.UUID;

import com.cisc181.eNums.eMajor;
public class Course implements java.io.Serializable{
	private UUID CourseId;
	private String CourseName;
	private int GradePoints;
	private eMajor eMajor;
	
	public UUID getCourseId() {
		return CourseId;
	}
	public void setCourseId(UUID courseId) {
		CourseId = courseId;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public int getGradePoints() {
		return GradePoints;
	}
	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}
	public eMajor geteMajor(){
		return this.eMajor;
	}
	public void seteMajor(eMajor eMajor){
		this.eMajor = eMajor;
	}

	public Course(String CourseName, int GradePoints, eMajor eMajor){
		this.CourseId=UUID.randomUUID();
		this.CourseName=CourseName;
		this.GradePoints=GradePoints;
		this.eMajor=eMajor;
		
	}

}
