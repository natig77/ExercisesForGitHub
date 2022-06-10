package com.syntax.exercise;

import java.util.Scanner;

//Create a method that will print whether given String is palindrome or not.
public class Class14Task3 {
	boolean isPalindrome(String word) {
		int x=0;
		int y=word.length()-1;
		while(x<y) {
			if(word.charAt(x)!=word.charAt(y)) 
				return false;
		
		x++;
		y--;
		
		}
		return true;
		
	}

	public static void main(String[] args) {
		Class14Task3 task=new Class14Task3();
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		sc.close();
		System.out.println(task.isPalindrome(str));

	}

}
