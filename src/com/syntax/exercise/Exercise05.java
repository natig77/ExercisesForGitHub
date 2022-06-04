package com.syntax.exercise;

public class Exercise05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] x= {{3,5,2},
	            {4,1,7},
	            {6,8,9}};
		int even=0;
		int odd=0;
		for(int i=0; i<x.length; i++) {
			for(int y=0; y<x[i].length; y++) {
				if(x[i][y]%2==0) {
					even+=x[i][y];
				}else {
					odd+=x[i][y];
				}
			}
		}
		System.out.println(even+" "+odd);

	}

}
