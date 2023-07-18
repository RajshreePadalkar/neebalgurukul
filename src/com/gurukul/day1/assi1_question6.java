package com.gurukul.day1;

import java.util.Scanner;

public class assi1_question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a 3 didit number :");
		int no = sc.nextInt();
		double a,a2,a3,b=0,c;
		a=no%10;
		a2=no/10%10;
		a3=no/100;
		b= (a*a*a)+(a3*a3*a3)+(a2*a2*a2);
		
		if(no==b)
			System.out.println("Armstrong number");
		else
			System.out.println("not armstrong");
		
		
		
		
	}

}
