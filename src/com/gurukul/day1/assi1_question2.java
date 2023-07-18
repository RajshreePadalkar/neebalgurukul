package com.gurukul.day1;

import java.util.Scanner;

public class assi1_question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int number= sc.nextInt();
		int a,b,c;
		a=number/100;
		b=number%100;
		c=b*100+a;
		System.out.println(c);

	}

}
