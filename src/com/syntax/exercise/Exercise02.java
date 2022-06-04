package com.syntax.exercise;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp=new Scanner(System.in);
		String[] country=new String[5];
		for(int i=0; i<country.length; i++) {
			country[i]=inp.nextLine();
		}
		String capital;
		
		for(int y=0; y<country.length; y++) {
		switch(country[y]) {
		case "usa":
			capital="Washington";
			break;
		case "canada":
			capital="Ottawa";
			break;
		case "france":
			capital="Paris";
			break;
		case "germany":
			capital="Berlin";
			break;
		case "turkey":
			capital="Ankara";
			break;
			default:
				capital="unknown";
		}
	    System.out.println(capital);
		}
		inp.close();
	}
}
