package com.tasks;

import java.util.Scanner;

public class FloatingNumber_4 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the decimal number");
		float input1 = s.nextFloat();
		
		if (input1 < 0) {
			System.out.print(input1 + " is a negative number");
		}
		else if (input1 > 0) {
			System.out.print(input1 + " is a positive number");
		}
		else {
			System.out.print(input1 + " is Zero");
		}	
	}
}
