package com.cisc181.core;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

import jdk.nashorn.internal.ir.annotations.Ignore;

public class Student_Test {
	ArrayList<Course> Courses = new ArrayList<Course>();
	ArrayList<Semester> Semesters = new ArrayList<Semester>();
	ArrayList<Student> Students = new ArrayList<Student>();
	ArrayList<Section> Sections = new ArrayList<Section>();
	ArrayList<Enrollment> Enrolled = new ArrayList<Enrollment>();
	Course course1 = new Course("Intro to coding",3,eMajor.COMPSI);
	Course course2 = new Course("Solid Mechancs",3,eMajor.PHYSICS);
	Course course3 = new Course("Thermodynamics",3,eMajor.CHEM);
	Date date1 = new Date(2016,9, 1);
	Date date2 = new Date(2016,12,20);
	Date date3 = new Date(2017,2,3);
	Date date4 = new Date(2017,5,18);
	Date date5 = new Date(1997,1,10);
	Date date6 = new Date(1997,6,16);
	Date date7 = new Date(1996,12,31);
	Date date8 = new Date(1995,4,12);
	Date date9 = new Date(1996,7,10);
	Date date10 = new Date(1997,4,23);
	Date date11 = new Date(1998,2,21);
	Date date12 = new Date(1995,9,15);
	Date date13 = new Date(1994,10,31);
	Date date14 = new Date(1996,8,2);
	Semester Fall = new Semester(date1,date2);
	Semester Spring = new Semester(date3,date4);
	Student student1 = new Student("test","test","test",date5, eMajor.COMPSI,"test"," ","test");
	Student student2 = new Student("test","test","test",date6, eMajor.BUSINESS,"test","","test");
	Student student3 = new Student("test","test","test",date7, eMajor.CHEM,"test","","test");
	Student student4 = new Student("test","test","test",date8, eMajor.NURSING,"test","","test");
	Student student5 = new Student("test","test","test",date9, eMajor.PHYSICS,"test","","test");
	Student student6 = new Student("test","test","test",date10, eMajor.COMPSI,"test","","test");
	Student student7 = new Student("test","test","test",date11, eMajor.BUSINESS,"test","","test");
	Student student8 = new Student("test","test","test",date12, eMajor.CHEM,"test","","test");
	Student student9 = new Student("test","test","test",date13, eMajor.NURSING,"test","","test");
	Student student10 = new Student("test","test","test",date14, eMajor.PHYSICS,"test","","test");
	Section section1 = new Section(Fall.getSemesterId(),course1.getCourseId(), 1);
	Section section2 = new Section(Fall.getSemesterId(),course2.getCourseId(), 2);
	Section section3 = new Section(Fall.getSemesterId(),course3.getCourseId(), 3);
	Section section4 = new Section(Spring.getSemesterId(),course1.getCourseId(), 1);
	Section section5 = new Section(Spring.getSemesterId(),course2.getCourseId(), 2);
	Section section6 = new Section(Spring.getSemesterId(),course3.getCourseId(), 3);
	double sum1 = 0;
	double sum2 = 0;
	double sum3 = 0;
	double sum4 = 0;
	double sum5 = 0;
	double sum6 = 0;
	double sum7 = 0;
	double sum8 = 0;
	double sum9 = 0;
	double sum10 = 0;
	double sum11 = 0;
	double sum12 = 0;
	double sum13 = 0;
	double gpa1 = 0;
	double gpa2 = 0;
	double gpa3 = 0;
	double gpa4 = 0;
	double gpa5 = 0;
	double gpa6 = 0;
	double gpa7 = 0;
	double gpa8 = 0;
	double gpa9 = 0;
	double gpa10 = 0;
	double average1 = 0;
	double average2 = 0;
	double average3 = 0;

	@BeforeClass
	public  void setup() {
		Courses.add(course1);
		Courses.add(course2);
		Courses.add(course3);
		Semesters.add(Fall);
		Semesters.add(Spring);
		Students.add(student1);
		Students.add(student2);
		Students.add(student3);
		Students.add(student4);
		Students.add(student5);
		Students.add(student6);
		Students.add(student7);
		Students.add(student8);
		Students.add(student9);
		Students.add(student10);
		Sections.add(section1);
		Sections.add(section2);
		Sections.add(section3);
		Sections.add(section4);
		Sections.add(section5);
		Sections.add(section6);
	}

	@Test
	public void test() {
		this.setup();
		for(Section e: Sections){
			for(Student f: Students){
				
				Enrolled.add(new Enrollment(e.getSectionId(),f.getStudentID()));
			}
		}
		for(Enrollment g:Enrolled){
				for(Section e:Sections){
					if((g.getSectionId()==e.getSectionId())){
						if((g.getStudentId()==student1.getStudentID())){
							g.setGrade(4);
						}
						else if((g.getStudentId()==student2.getStudentID())){
							g.setGrade(4);
						}
						else if((g.getStudentId()==student3.getStudentID())){
							g.setGrade(3.5);
						}
						else if((g.getStudentId()==student4.getStudentID())){
							g.setGrade(2.5);
						}
						else if((g.getStudentId()==student5.getStudentID())){
							g.setGrade(1.5);
						}
						else if((g.getStudentId()==student6.getStudentID())){
							g.setGrade(0);
						}
						else if((g.getStudentId()==student7.getStudentID())){
							g.setGrade(0.5);
						}
						else if((g.getStudentId()==student8.getStudentID())){
							g.setGrade(3);
						}
						else if((g.getStudentId()==student9.getStudentID())){
							g.setGrade(4);
						}
						else if((g.getStudentId()==student10.getStudentID())){
							g.setGrade(3);
						}
				}
				
			}
		}
		for(Enrollment g: Enrolled){
			for(Section e:Sections){
				for(Course c:Courses){
					if(g.getStudentId()==student1.getStudentID()){
						if(e.getCourseId()==c.getCourseId()){
							sum1 = sum1 + (g.getGrade()*c.getGradePoints());
						}
					}
					if(g.getStudentId()==student2.getStudentID()){
						if(e.getCourseId()==c.getCourseId()){
							sum2 = sum2 + (g.getGrade()*c.getGradePoints());
						}
					}
					if(g.getStudentId()==student3.getStudentID()){
						if(e.getCourseId()==c.getCourseId()){
							sum3 = sum3 + (g.getGrade()*c.getGradePoints());
						}
					}
					if(g.getStudentId()==student4.getStudentID()){
						if(e.getCourseId()==c.getCourseId()){
							sum4 = sum4 + (g.getGrade()*c.getGradePoints());
						}
					}
					if(g.getStudentId()==student5.getStudentID()){
						if(e.getCourseId()==c.getCourseId()){
							sum5 = sum5 + (g.getGrade()*c.getGradePoints());
						}
					}
					if(g.getStudentId()==student6.getStudentID()){
						if(e.getCourseId()==c.getCourseId()){
							sum6 = sum6 + (g.getGrade()*c.getGradePoints());
						}
					}
					if(g.getStudentId()==student7.getStudentID()){
						if(e.getCourseId()==c.getCourseId()){
							sum7 = sum7 + (g.getGrade()*c.getGradePoints());
						}
					}
					if(g.getStudentId()==student8.getStudentID()){
						if(e.getCourseId()==c.getCourseId()){
							sum8 = sum8 + (g.getGrade()*c.getGradePoints());
						}
					}
					if(g.getStudentId()==student9.getStudentID()){
						if(e.getCourseId()==c.getCourseId()){
							sum9 = sum9 + (g.getGrade()*c.getGradePoints());
						}
					}
					if(g.getStudentId()==student10.getStudentID()){
						if(e.getCourseId()==c.getCourseId()){
							sum10 = sum10 + (g.getGrade()*c.getGradePoints());
						}
					}
				}
			}
		}
		for(Enrollment g: Enrolled){
			for(Section c: Sections){
				if(g.getSectionId()==c.getSectionId()){
					if(c.getCourseId()==course1.getCourseId()){
						sum11 = sum11+g.getGrade();
					}
					if(c.getCourseId()==course2.getCourseId()){
						sum12 = sum12+g.getGrade();
					}
					if(c.getCourseId()==course3.getCourseId()){
						sum13 = sum13+g.getGrade();
					}		
				}
				
			}
		}
		gpa1 = sum1/6;
		gpa2 = sum2/6;
		gpa3 = sum3/6;
		gpa4 = sum4/6;
		gpa5 = sum5/6;
		gpa6 = sum6/6;
		gpa7 = sum7/6;
		gpa8 = sum8/6;
		gpa9 = sum9/6;
		gpa10 = sum10/6;
		average1 = sum11/20;
		average2 = sum12/20;
		average3 = sum13/20;
		
		assertEquals(gpa1,4);
		assertEquals(gpa2,4);
		assertEquals(gpa3,3.5);
		assertEquals(gpa4,2.5);
		assertEquals(gpa5,1.5);
		assertEquals(gpa6,0);
		assertEquals(gpa7,0.5);
		assertEquals(gpa8,3);
		assertEquals(gpa9,4);
		assertEquals(gpa10,3);
		assertEquals(average1,2.2);
		assertEquals(average2,2.2);
		assertEquals(average3,2.2);
	}
	@Test
	public void TesteMajor(){
		this.setup();
		student1.seteMajor(eMajor.PHYSICS);
		assertEquals(student1.geteMajor(),eMajor.PHYSICS);
	}
}