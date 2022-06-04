package com.syntax.exercise;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		String[] word=new String[size];
		for(int i=0; i<size; i++) {
			word[i]=sc.next();
		}
		sc.close();
		String duplicate="";
		for(int y=0; y<size; y++) {
			for(int j=0; j<size; j++) {
				if(y!=j && word[y].equals(word[j])) {
					//System.out.println("Duplicate word is "+word[y]);
					duplicate=word[y];
				}
			}
		}
		System.out.println("Duplicate word is "+duplicate);

	}

}
