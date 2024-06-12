package com.tasks;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
class RemoveDuplicate {
    
    private static void RemoveDuplicates (Integer inputList[]) {
   
        Set<Integer> se = new HashSet<Integer>(Arrays.asList(inputList));
        
        System.out.println("Array after removing duplicates:");
        System.out.println(se);
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the length of the array");
        int sizeOfArray = s.nextInt();
        
        Integer inputList[] = new Integer[sizeOfArray];
        System.out.println("Give input values");

        for(int i=0; i<sizeOfArray; i++) {
            inputList[i] = s.nextInt();
        }
        RemoveDuplicate.RemoveDuplicates(inputList);
        
    }

}