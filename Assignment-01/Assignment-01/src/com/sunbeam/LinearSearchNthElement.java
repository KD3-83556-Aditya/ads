package com.sunbeam;
import java.util.Scanner;

public class LinearSearchNthElement {
    public static int linearSearchNthOccurrence(int[] arr, int N, int key, int n) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == key) {
                count++;
                if (count == n) {
                    return i; 
                }
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = {11, 33, 55, 77, 30, 99, 33};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the key to be searched: ");
        int key = sc.nextInt();

        System.out.print("Enter the occurrence to find: ");
        int occurrence = sc.nextInt();

        int index = linearSearchNthOccurrence(arr, arr.length, key, occurrence);
        
        if (index != -1) {
            System.out.println("The index of the " + occurrence + "th occurrence of " + key + " is: " + index);
        } else {
            System.out.println("The " + occurrence + "th occurrence of " + key + " is not found.");
        }

        sc.close();
    }
}
