package com.syntax.exercise;

import java.util.Scanner;

public class Class14Task1 {
	void compare(int x,int y) {
		if(x>y) {
			System.out.println(x+" is larger than "+y);
		}else if(x<y) {
			System.out.println(y+" is larger than "+x);
		}else {
			System.out.println("Numbers are equal");
		}
	}
		

	public static void main(String[] args) {
		// Create a method that will take 2 parameters as a numbers and prints which number is larger.
		System.out.println("Please enter 2 numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		Class14Task1 task=new Class14Task1();
		task.compare(a, b);

	}

}
