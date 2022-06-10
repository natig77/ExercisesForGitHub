package com.syntax.exercise;

import java.util.Scanner;

/*Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
score > 90 - A
score >80 - B
score >70 - C
score > 50 - D
anything else - F*/
public class Class14Task7 {
	char getGrade(int x) {
		char z;
		if(x>90) {
			z='A';
		}else if(x>80) {
			z='B';
		}else if(x>70) {
			z='C';
		}else if(x>50) {
			z='D';
		}else {
			z='D';
		}
		return z;
	}

	public static void main(String[] args) {
		Class14Task7 task=new Class14Task7();
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		sc.close();
		System.out.println(task.getGrade(score));

	}

}
