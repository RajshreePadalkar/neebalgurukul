package com.gurukul.day1;

import java.util.Scanner;

public class assi1_question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter total days");
		int total=sc.nextInt();
		int yr,mnt,day,week;
		yr=total/365;
		total=total-(yr*365);
		
		mnt=total/30;
		total=total%30;
		
		week=total/7;
		total=total%7;
		
		day=total;
		
		System.out.println(yr+" year : "+mnt+" Months : "+week+" weeks : "+day+" days");
		
		
	}

}
