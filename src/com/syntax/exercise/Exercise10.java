package com.syntax.exercise;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] x=new int[size];
		for(int i=0; i<size; i++) {
			x[i]=sc.nextInt();
		}
		sc.close();
		int max=x[0];
		int mi=0;
		for(int y=0; y<size; y++) {
			if(max<x[y]) {
				mi=y;
			}
		}
		int max2=0;
		for(int j=0; j<size; j++) {
			if(j==mi) {
				continue;
			}
			if(max2<x[j]) {
				max2=x[j];
			}
		}
		System.out.println("Second maximum number is "+max2);

	}

}
