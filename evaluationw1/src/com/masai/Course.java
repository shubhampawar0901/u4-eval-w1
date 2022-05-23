package com.masai;

import java.util.Scanner;


public class Course {
	int courseid;
	String courseName;
	int courseFee;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Username :");
		String username = input.next();
		System.out.println("Enter Password :");
		int password = input.nextInt();
//		System.out.println("username and password :"+username+" " +password);
//		String username = "Admin";
//		int password = 1234;
		Course.authenticate(username,password);
		
		
		System.out.println("============= for invalid credentials=========");
		
		System.out.println("Enter Username :");
		String username12 = input.next();
		System.out.println("Enter Password :");
		int password12 = input.nextInt();
		Course.authenticate(username12,password12);

	}
	
	public void displayCourseDetails() {
		System.out.println("Course Details");
		System.out.println("Course ID  :"+ courseid);
		System.out.println("Course Name:"+ courseName);
		System.out.println("Course Fees :"+  courseFee);
	}
	
	public static void authenticate(String username, int password) {
		if(username.equals("Admin") && password == 1234) {
			
			Course c1 = new Course();
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter courseid :");
			int entCourseid = input.nextInt();
			input.nextLine();
			System.out.println("Enter coursename :");
			String entCourseName = input.nextLine();
			
			System.out.println("Enter courserfee :");
			int entCourseFee = input.nextInt();
			
			c1.courseFee = entCourseFee;
			c1.courseid = entCourseid;
			c1.courseName = entCourseName;
			c1.displayCourseDetails();
		}
		else {
			System.out.println("Invalid Username or password");
		}
	}

}
