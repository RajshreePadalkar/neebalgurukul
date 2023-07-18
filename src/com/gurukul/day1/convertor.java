package com.gurukul.day1;

import java.util.Scanner;

public class convertor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter km:");
		double km =  sc.nextDouble();
		double meter = km*1000;
		double cm = meter*100;
		double feet = cm*0.394;   // inch = cm/2.54; feet= inch/12;
		double inch = feet*12;
		
		System.out.println("Km to meter :"+meter);
		
		System.out.println("Km to cm  :"+cm);
		
		System.out.println("Km to Feet:"+feet);
		
		System.out.println("km to inch:"+ inch);
		
		

	}

}
