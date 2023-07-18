package com.gurukul.day1;

import java.util.Scanner;

public class tax_sal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary");
		double sal = sc.nextDouble();
		double after,tax=0;
		if(sal>1500000)
			tax= sal*30/100;
		else 
			if(sal>1000000)
				tax= sal*20/100;
			else 
				if(sal>750000)
					tax=sal*10/100;
				else
					System.out.println("no tax");
		
		after= sal- tax;
		System.out.println("Salary:"+sal +"\t tax:"+ tax +"after tax:"+after);
			
					
		
		

	}

}
