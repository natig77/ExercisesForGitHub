package com.syntax.exercise;

import java.util.Scanner;

//Create a method that will say Hello in different language based on the country that will passed when 
//method is executed
public class Class14Task4 {
	void welcome(String country) {
		String word="";
		switch(country) {
		case "USA":
			word="Hello";
			break;
		case "Russia":
			word="Privet";
			break;
		case "Spain":
			word="Holla";
			break;
		case "Turkey":
			word="Salam";
			break;
		case "France":
			word="Bonjour";
			break;
			default:
				word="error";
				break;
		}
		System.out.println(word);
	}

	public static void main(String[] args) {
		Class14Task4 task=new Class14Task4();
		Scanner sc=new Scanner(System.in);
		String country=sc.nextLine();
		sc.close();
		task.welcome(country);

	}

}
