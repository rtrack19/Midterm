package com.cisc181.core;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
	
	Date date1 = new Date(1950,10,17);
	Date date2 = new Date(1970,3,2);
	Date date3 = new Date(1900,1,1);
	Date date4 = new Date(1990,6,16);
	Date date5 = new Date(200,12,31);
	Date date6 = new Date(2010,9,1);
	Staff staff1= new Staff("Test","Test","Test",date1,"test", "(555) 555-5555", "test",
			"test", 2, 50.99, date6, eTitle.MR);
	Staff staff2 = new Staff("Bob","Jim","Davis",date2,"test", "(555) 555-5555", "test",
			"test", 2, 100.00, date6, eTitle.MR);
	Staff staff3 = new Staff("Bob","Jim","Davis",date3,"test", "(555) 555-5555", "test",
			"test", 2, 0.01, date6, eTitle.MR);
	Staff staff4 = new Staff("Bob","Jim","Davis",date4,"test", "(555) 555-5555", "test",
			"test", 2, 63.51, date6, eTitle.MR);
	Staff staff5 = new Staff("Bob","Jim","Davis",date5,"test", "1", "test",
			"test", 2, 150.50, date6, eTitle.MR);
	ArrayList<Staff> group = new ArrayList<Staff>();
	double sum = 0;
	double average = 0;
	boolean test = false;

	@BeforeClass
	public void setup() {
		group.add(staff1);
		group.add(staff2);
		group.add(staff3);
		group.add(staff4);
		group.add(staff5);
		
		for(Staff e: group){
			sum = e.getSalary();
		}
		average = sum/5;
		
	}
	
	@Test
	public void test() {
		this.setup();
		assertEquals(average,73.002);
	}
	@Test(expected = PersonException.class)
	public void testPhoneNumException() throws PersonException{
		this.setup();
		staff5.PhoneNumCheck();
	}
	
}
