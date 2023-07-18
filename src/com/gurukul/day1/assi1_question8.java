package com.gurukul.day1;

import java.util.Scanner;

public class assi1_question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter name :");
		String name = sc.nextLine();
		System.out.println("Enter unit:");
		int unit=sc.nextInt();
		
		double chg=0, sur=0;
		if(unit>=100)
		{
			chg=100*4;
			unit=unit-100;
			
			if(unit<200)
			{
				chg=chg+unit*5;
				
			}
			else
			{
				chg=chg+200*5;
				unit= unit-200;
				chg=chg+unit*10;
			}		
			
		}
		else
			chg=unit*4;
		
		
		if(chg>1000)
		 sur = chg*0.05;
		System.out.println(chg);
		System.out.println(sur);
		double tot=chg+sur;
		double gst=tot*0.18;
		double total=tot+gst;
		System.out.println("Name: "+name+" \n gst: "+total);
		
		
		
		
		
		
		
		
		
		
		 
		
		
		
		
	}

}
