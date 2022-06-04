package com.syntax.exercise;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner inp=new Scanner(System.in);
		int[] x=new int[5];
		for(int i=0; i<x.length; i++) {
			sum+=x[i]=inp.nextInt();
		}
		System.out.println(sum);
		inp.close();

	}

}
