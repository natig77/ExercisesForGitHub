package com.syntax.exercise;

import java.util.Scanner;

//Create a method createEmail(). Based on values of users name, lastName and email type, your method 
//should return complete email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
public class Class14Task5 {
	String createEmail(String name,String lastName,String type) {
		return (name+lastName+"@"+type+".com");
	}

	public static void main(String[] args) {
		Class14Task5 task=new Class14Task5();
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String lastName=sc.nextLine();
		String type=sc.nextLine();
		sc.close();
		System.out.println(task.createEmail(name, lastName, type));

	}

}
