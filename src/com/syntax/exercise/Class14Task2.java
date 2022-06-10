package com.syntax.exercise;

import java.util.Scanner;

//Create a method that will take a number and prints whether the number is even or odd.
public class Class14Task2 {
	void isEven(int x) {
		if(x%2==0) {
			System.out.println(x+" is even number");
		}else {
			System.out.println(x+" is odd number");
		}
	}

	public static void main(String[] args) {
		Class14Task2 task=new Class14Task2();
		System.out.println("Please enter the number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		sc.close();
		task.isEven(a);

	}

}
