package com.gurukul.day1;

import java.util.Scanner;

public class currency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the amount:");
		int amt= sc.nextInt();
		int thous,five,two,hund,fifty,twenty,ten,fi;
		
		thous= amt/2000;
		 amt= amt%2000;
		 
		 five=amt/500;
		 amt=amt%500;
		 
		 two=amt/200;
		 amt=amt%200;
		 
		 hund=amt/100;
		 amt= amt%100;
		 
		 fifty=amt/50;
		 amt=amt%50;
		 
		 twenty=amt/20;
		 amt= amt%20;
		 
		 ten=amt/10;
		 amt=amt%10;
		 
		 fi=amt/5;
		 System.out.println("2000X "+ thous+"="+(2000*thous));
		 System.out.println(" 500 X "+five+"="+(500*five));
		 System.out.println("200X"+two+"="+(200*two));
		 System.out.println("100X"+hund+"="+(100*hund));
		 System.out.println("50X"+fifty+"="+(50*fifty));
		 System.out.println("20X"+twenty+"="+(20*twenty));
		 System.out.println("10X"+ten+"="+(10*ten));
		 System.out.println("5X"+fi+"="+(5*fi));
		
		
				
		
		
		
	}

}
