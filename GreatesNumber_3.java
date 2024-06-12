package com.tasks;

import java.util.Scanner;

public class GreatesNumber_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter Your 1st number");
		int input1 = s.nextInt();
		
		System.out.print("Enter Your 2nd number");
		int input2 = s.nextInt();
		
		System.out.print("Enter Your 3rd number");
		int input3 = s.nextInt();
		
		int greatest = 0;
		
		if (input1 < input2) {
			greatest = input2;
			if (greatest < input3) {
				greatest = input3;
			}
		}
		else {
			greatest = input1;
			if (greatest < input3) {
				greatest = input3;
			}
		}
		System.out.print(greatest);

	}

}
