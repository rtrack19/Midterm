package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Section{
	private UUID CourseId;
	private UUID SemesterId;
	private UUID SectionId;
	private int RoomId;
	public UUID getSectionId() {
		return SectionId;
	}
	public void setSectionId(UUID sectionId) {
		SectionId = sectionId;
	}
	public int getRoomId() {
		return RoomId;
	}
	public void setRoomId(int roomId) {
		RoomId = roomId;
	}
	
	public UUID getCourseId() {
		return CourseId;
	}
	public void setCourseId(UUID courseId) {
		CourseId = courseId;
	}
	public UUID getSemesterId() {
		return SemesterId;
	}
	public void setSemesterId(UUID semesterId) {
		SemesterId = semesterId;
	}
	public Section(UUID SemesterId, UUID CourseId, int RoomId){
		this.SemesterId = SemesterId;
		this.CourseId = CourseId;
		this.SectionId = UUID.randomUUID();
		this.RoomId = RoomId;
		
	}

}
