package com.program;

import java.util.ArrayList;
import java.util.List;

public class CopyOneArray {
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		List<Integer> lis=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println("CopyArrayList:");
		for(Integer copy:list ) {
			lis.add(copy);
			System.out.println(copy);
	}
//		System.out.println("Copy ArrayList:");
//		for(Integer New: lis) {
//			System.out.println(New);
//		}
//	}
	}}
