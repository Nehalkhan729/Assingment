package com.program;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Iteration {
	
	private int id;
	private String name;
	private int age;
	private Date dateOfjoin;
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDateOfjoin() {
		return dateOfjoin;
	}
	public void setDateOfjoin(Date dateOfjoin) {
		this.dateOfjoin = dateOfjoin;
	}
	public Iteration(int id, String name, int age, Date dateOfjoin) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dateOfjoin = dateOfjoin;
	}
	
	@Override
	public String toString() {
		return "Iteration [id=" + id + ", name=" + name + ", age=" + age + ", dateOfjoin=" + dateOfjoin + "]";
	}
	public static void main(String[] args) {
		Iteration it=new Iteration(101, "Nehal", 25, new Date());
		Iteration iter=new Iteration(102, "Shahid", 26, new Date());
		Iteration iterrr=new Iteration(103, "Mudassir", 28, new Date());
		
		
		List<Iteration> list=new ArrayList<>();
		list.add(it);
		list.add(iter);
		list.add(iterrr);
		
//		Iterator<Iteration> itr=list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		for(Iteration student:list) {
			System.out.println("Student ID:" +student.getId());
			System.out.println(("Student Name: "+student.getName()));
			System.out.println("Student Age: "+student.getAge());
			System.out.println("Student Date Of Joining: "+student.getDateOfjoin() );
		}
	}
}
