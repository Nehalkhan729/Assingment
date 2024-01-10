package com.program;

import java.util.ArrayList;
import java.util.List;

public class CheckArrayList {
	
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		//list.add("Nehal");
		
		Boolean check=list.isEmpty();
		
		if(check) {
			System.out.println("ArrayList is Empty");
		}
		else {
			System.out.println("ArrayList is not Empty");
		}
	}
}
