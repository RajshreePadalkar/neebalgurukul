package com.gurukul.day1;

import java.util.Scanner;

public class Sum_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a 3 digit number:");
		int digit = sc.nextInt();
		int a= digit;
		
		int sum, reverse=0,digit1,digit2,digit3,s;
		digit1= digit%10;
		digit2= digit/10 %10;
		digit3= digit/100;
		
		System.out.println(""+digit1+""+digit2+""+digit3);
		s = digit1+digit2+digit3;
			 
		reverse = (digit1*100)+(digit2*10)+digit3;  
		sum = a+reverse;
		System.out.println("reverse:" + reverse + "\tSum:" + s + "\tReverse sum:" + sum);
		//int x=5,y=6;
		//System.out.println(x+y+"Has sum"+x+y);
		
		
		
		
			
		
	}

}
