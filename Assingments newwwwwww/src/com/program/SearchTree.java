package com.program;

import java.util.Map;
import java.util.TreeMap;

public class SearchTree {
	
	public static void main(String[] args) {
		
		TreeMap<Integer, String> map=new TreeMap<>();
		map.put(1, "sameer");
		map.put(2, "Nehal");
		map.put(3,"Sahil");
		map.put(4, "Rehan");
		
		int search=3;
		if(map.containsKey(search)) {
		//String val=map.get(search);
			System.out.println("Key is present..");
		}
		else {
			System.out.println("Key is not Present..");
		}
	}
}
