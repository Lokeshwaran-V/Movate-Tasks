package com.tasks;

import java.util.*;
class RemoveAllDuplicate {
    
    private static void RemoveAllDuplicates (int inputList[], int key) {
   
        ArrayList<Integer> ar = new ArrayList<>();
        
        for (int i : inputList) {
        	if(i != key) {
        		ar.add(i);
        	}
        	
        }
        
        System.out.println("Array after removing all duplicates:");
        System.out.println(ar);
        
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the length of the array");
        int sizeOfArray = s.nextInt();
        
        int inputList[] = new int[sizeOfArray];
        System.out.println("Give input values");

        for(int i=0; i<sizeOfArray; i++) {
            inputList[i] = s.nextInt();
        }
        
        System.out.println("Enter the key element need to be deleted");
        int key = s.nextInt();
        
        RemoveAllDuplicate.RemoveAllDuplicates(inputList, key);
        
    }

}