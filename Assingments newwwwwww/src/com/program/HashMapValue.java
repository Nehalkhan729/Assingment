package com.program;

import java.util.HashMap;
import java.util.Map;

public class HashMapValue {
	
	public static void main(String[] args) {
		Map<String, String> map=new HashMap<>();
		map.put("Nehal", "Khan");
		map.put("sameer", "khan");
		map.put("Mahatma", "shami");
		
		for(Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+ " " +entry.getValue());
		}
	}
}
