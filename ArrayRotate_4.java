package com.tasks;
import java.util.Scanner;
import java.util.Arrays;
class ArrayRotate {
    
    private static int[] ArrayRotation (int inputList[], int rotate) {
        
        int n = inputList.length;
        
        int[] rotatedArr = new int[n];
        
        for (int i = 0; i < n; i++) {
            rotatedArr[(i + n - rotate) % n] = inputList[i];
        }
        
        System.out.println("Rotated array:");
        
        return rotatedArr;
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
        System.out.println("Give array rotation values");
        int rotate = s.nextInt();
    
        int[] rotatedArray = (ArrayRotation(inputList, rotate));
        
        System.out.println(Arrays.toString(rotatedArray));
        
    }

}
