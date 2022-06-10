package com.syntax.exercise;

import java.util.Scanner;

//Write a method to return whether given number is prime or not?
public class Class14Task6 {
	boolean isEven(int x) {
		if(x%2==0) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		Class14Task6 task=new Class14Task6();
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		sc.close();
		System.out.println(task.isEven(number));
	}

}
