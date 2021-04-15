package com.capg.lab9;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

class Employee{
	String fname;
	String lname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public String FullName(String fname,String lname) {
		return (fname.concat(lname));
	}
	
}
public class Ex4InstanceCreationDemo {

	public static void main(String[] args) {
		BiFunction<String,String,String> fun= new Employee()::FullName;
		String fullname=fun.apply("Pranjana", " Raizada");
		System.out.println(fullname);
	}

}
