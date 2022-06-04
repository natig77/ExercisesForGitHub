package com.syntax.exercise;

import java.util.Scanner;

public class Exercize09 {

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
		int min=x[0];
		for(int y=0; y<size; y++) {
			if(x[y]>max) {
				max=x[y];
			}
			if(x[y]<min) {
				min=x[y];
			}
		}
		System.out.println("Maximum number is "+max+" Minimum number is "+min);

	}

}
