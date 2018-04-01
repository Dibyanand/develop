 package com.capg.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComapareLabda {

	public static void main(String[] args) {
		
		Comparator<String> comparator=new Comparator<String>() {
			
			@Override
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(),s2.length());
			}
		};
		
		List<String> list =Arrays.asList("***","**","****","*");
		Collections.sort(list,comparator);
		for(String s:list){
			System.out.println(s);
		}
		
		System.out.println("========Using Java 8 Lambda Expression====================");
		
		//Comparator<String> comparatorLambda=(String s1, String s2)->Integer.compare(s1.length(),s2.length());
	      Comparator<String> comparatorLambda=(s1, s2)->Integer.compare(s1.length(),s2.length());
	      
		//Method reference : The type Integer does not define compare(String, String) that is applicable here
		//Comparator<String> comparatorLambda=Integer::compare;
	    
	    List<String> stringList =Arrays.asList("***","**","****","*");
		Collections.sort(stringList,comparatorLambda);
		for(String s:stringList){
			System.out.println(s);
		}
		
		//iterate through lambda fashion
		System.out.println("========Iterating through Lambda Expression====================");
		
		  stringList.forEach(String->System.out.println(String));
		
		//iterate through lambda fashion ..Method Refrence
		  System.out.println("========Iterating through Lambda Expression Method Refrence====================");
		  stringList.forEach(System.out::println);
		
		

	}

}
