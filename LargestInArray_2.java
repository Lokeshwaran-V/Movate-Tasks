package com.tasks;

import java.util.Scanner;
class ArrayLargest {
    
    private static double largestOfArray(double inputList[]){
        double result = inputList[0];
        
        for(int i = 1; i<inputList.length; i++) {
            if (result < inputList[i]){
                result = inputList[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the length of the array");
        int sizeOfArray = s.nextInt();
        
        double inputList[] = new double[sizeOfArray];
        System.out.println("Give input values");

        for(int i=0; i<sizeOfArray; i++) {
            inputList[i] = s.nextDouble();
        }
        System.out.print(largestOfArray(inputList) + " is the largest number in the array");
    }
}

