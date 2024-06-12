package com.tasks;

import java.util.Scanner;

public class WeekdayName_5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a digit and get the desired weekday name");
		int input1 = s.nextInt();
		
		int result = input1 % 7;
		String week[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		
		System.out.println("The digit belongs to : " + week[result]);
	}

}
