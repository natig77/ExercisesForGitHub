package com.syntax.exercise;

public class Exercise08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		int y=1;
		System.out.println(x);
		System.out.println(y);
		for(int i=0; i<4; i++) {
		System.out.println(x+y);
		x=x+y;
		System.out.println(x+y);
		y=x+y;
		}

	}

}
