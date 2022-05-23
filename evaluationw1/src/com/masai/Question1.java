package com.masai;

public class Question1 {
	
//	Question 1:
//
//		Why String is immutable in java and what is the difference between String and String Builder? And Write some
//		of the methods of String class at least 5 with example.
	
//ans: Immutability of strings provides security. 
//Strings can be directly created using String class 
//while string builder uses object to create strings
// String methods: .toUpperCase(), .toLowerCase(), .concat(), .length(), .indexOf(), .lastIndexOf()
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Shubham";
		
		//1) string.length()
		int len = s.length();
		System.out.println(len);
		
		//2) string.indexOf();
		int ind = s.indexOf("m");
		System.out.println(ind);
		
		//3) string.lastIndexOf();
		int ind1 = s.lastIndexOf("a");
		System.out.println(ind1);
		 
		//4) string.toUpperCase();
		System.out.println(s.toUpperCase());
		
		//5) string.toUpperCase();
		System.out.println(s.toLowerCase());
	}

}
