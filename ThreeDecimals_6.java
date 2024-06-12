package com.tasks;

import java.util.Scanner;

public class ThreeDecimals_6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the 1st decimal number, minimum three decimals");
		Double input1 = s.nextDouble();
		
		System.out.println("Enter the 2nd decimal number, minimum three decimals");
		Double input2 = s.nextDouble();
		
		input1 = input1 * 1000;
		input2 = input2 * 1000;
		
		String[] split1 = input1.toString().split("\\.");
		String[] split2 = input2.toString().split("\\.");
				
		if (split1[0] == split2[0]){
			System.out.println("Two numbers are same till 3 decimal points");
		}
		else {
			System.out.println("Two numbers are not same till 3 decimal points");
		}
	}

}
