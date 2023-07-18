package com.gurukul.day1;

import java.util.Scanner;

public class triangle_area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side:");
		double sides = sc.nextDouble();
		 double area= Math.sqrt(3)/4*Math.pow(sides, 2);
		 System.out.println(":"+area);
		 

	}

}
