package com.syntax.exercise;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		sc.close();
		String pri="qwerty";
		if(x<1) {
			pri="not prime";
		}else if(x==1 || x==2 || x==3) {
				pri="prime";
		}else {
			for(int i=2; i<=x/2; i++) {
				if(x%i==0) {
					pri="not prime";
					break;
				}else {
					pri="prime";
				}
			}
		}
		System.out.println(x+" is "+pri+" number");
	}

}
