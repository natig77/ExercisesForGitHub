package com.syntax.exercise;

public class Exercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] x= {{3,5,2},
		            {4,1,7},
		            {6,8,9}};
		int sum=0;
		for(int i=0; i<x.length; i++) {
			for(int y=0; y<x[i].length; y++) {
				sum+=x[i][y];
			}
		}
		System.out.println(sum);

	}

}
