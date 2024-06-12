package com.tasks;

import java.util.Scanner;
public class PositiveOrNegative_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter Your number");
		int userinput = s.nextInt();
		
		if (userinput %2 == 0) {
			System.out.print(userinput + " is positive");
		}
		else {
			System.out.print(userinput + " is negative");
		}

	}

}
