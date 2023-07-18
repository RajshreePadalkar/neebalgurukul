package com.gurukul.day1;

import java.util.Scanner;

public class two_divi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number");
		int a= sc.nextInt();
		System.out.println("Enter sec number");
		int b= sc.nextInt();
		int ans;
		if(a>b)
		 ans=a/b;
		else
			ans=b/a;
		System.out.println("Answer :"+ ans);
		
	}

}
