package com.gurukul.day2;

import java.util.Scanner;

public class Number1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number :");
		a= sc.nextInt();
		System.out.println("Enter a number :");
		b= sc.nextInt();
		System.out.println((a>>(b-1))&1);
			
	}

}
