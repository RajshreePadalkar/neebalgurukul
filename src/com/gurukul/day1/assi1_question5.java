package com.gurukul.day1;

import java.util.Scanner;

public class assi1_question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a,b,c,max;
		System.out.println("Enter number 1 :");
		a=sc.nextInt();
		System.out.println("Enter number 2 :");
		b=sc.nextInt();
		System.out.println("Enter number 3 :");
		c=sc.nextInt();
		if(a>b)
			max=a;
		else if(c>a)
			max = c;
			else
				max=b;
		System.out.println("Largest number :"+max);
		
			
			

	}

}
