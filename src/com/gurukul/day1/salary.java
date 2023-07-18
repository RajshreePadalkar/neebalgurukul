package com.gurukul.day1;

import java.util.Scanner;

public class salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary");
		int sal=sc.nextInt();
		
		if(sal<30000)
		
			sal=sal+(sal*5/100);
		
		System.out.println("Salary:"+sal);
		
		
	}

}
