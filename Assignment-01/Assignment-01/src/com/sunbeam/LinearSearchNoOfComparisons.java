package com.sunbeam;

import java.util.Scanner;

public class LinearSearchNoOfComparisons  {
	    public static int linearSearch(int arr [],int N, int key) {
	        int lastIndex = -1;
	        for (int i = 0; i < N; i++) {
	            if (arr[i] == key) {
	                lastIndex = i;
	            }
	        }
	        return lastIndex;
	    }

	    public static void main(String[] args) {
	        int[] arr = {11, 33, 55, 77, 30, 99, 33};
	        Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter key to be searched : ");
			int key = sc.nextInt();
			
			int index = linearSearch(arr, arr.length, key);
			if(index != -1)
				System.out.println("Key is found at index " + index);
			else
				System.out.println("Key is not found");
			
			sc.close();
		}

	}


