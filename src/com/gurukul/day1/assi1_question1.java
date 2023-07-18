package com.gurukul.day1;

import java.util.Scanner;

public class assi1_question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the mili sec:");
		double mili= sc.nextDouble();
		int hr,sec,min;
		hr=(int) mili/(60*60*1000);
		mili = mili% (60*60*1000);
		
		min= (int)mili/(60*1000);
		mili=mili%(60*1000);
		
		sec= (int)mili/1000;
		
		System.out.println(hr+":"+min+":"+sec);
		
		
		
	}

}
