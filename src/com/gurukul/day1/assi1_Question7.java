package com.gurukul.day1;

import java.util.Scanner;

public class assi1_Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter timing:");
		int tim= sc.nextInt();
		int min,hr;
		min=tim%100;
		tim=tim/100;
		if(tim>12)
		{	tim=tim-12;
			System.out.println(tim+":"+min+"pm");
		}
		else
			System.out.println(tim+":"+min+"am");
	}

}
