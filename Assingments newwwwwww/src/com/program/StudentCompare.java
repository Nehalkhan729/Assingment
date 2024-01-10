package com.program;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentCompare {
	private int id;
	private String name;
	private int age;
	public StudentCompare(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public StudentCompare() {
		super();
		// TODO Auto-generated constructor stub
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "StudentCompare [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
	class NameComparator implements Comparator<StudentCompare>
	{

		@Override
		public int compare(StudentCompare s1, StudentCompare s2) {
			return s1.getName().compareTo(s2.getName());
		}
	public static void main(String[] args) {
		
		StudentCompare compare=new StudentCompare(101, "Sameer", 25);
		StudentCompare student=new StudentCompare(102, "Sahil", 26);
		StudentCompare comparing=new StudentCompare(103, "Aman", 27);
	
		List<StudentCompare> list=new ArrayList<>();
		list.add(compare);
		list.add(comparing);
		list.add(student);
		
		list.sort(new NameComparator());
		
		System.out.println("Comparing by name");
		for(StudentCompare studentCompare : list) {
			System.out.println(studentCompare);
		}
	}
}
