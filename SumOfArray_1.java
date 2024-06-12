package com.tasks;

import java.util.Scanner;
class ArraySum {
    
    private static double sumOfArray(double inputList[]){
        
        double result = 0;
        for(int i=0; i<inputList.length; i++) {
            result += inputList[i];
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
        System.out.print(sumOfArray(inputList));
    }
}