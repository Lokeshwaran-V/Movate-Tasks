package com.tasks;

import java.util.Scanner;

class Palindrome_7 {
	private static String PalindromeWord(String word) {
		
		var result = "YES";
		for (int i = 0; i< word.length()/2; i++) {
        	if(word.charAt(i) == word.charAt(word.length()-1 - i)) {
        		result = "YES it is a palindrome";
        	}
        	else {
        		result = "NO it is not a palindrome";
        	}
        }
		return result;
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        
        System.out.println("Enter a word");
        String word = s.next();
        System.out.println(Palindrome_7.PalindromeWord(word));		
	}

}
