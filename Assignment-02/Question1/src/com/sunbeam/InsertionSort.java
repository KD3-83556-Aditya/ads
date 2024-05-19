package com.sunbeam;

import java.util.Arrays;

public class InsertionSort {
	public static void insertionsort(int arr[], int n) {
		int comps = 0;
		for(int i=1;i<n;i++) {
			int temp=arr[i];
			int j = i-1;
			

			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
				comps++;
			}
			arr[j+1]=temp;
			
		}
		System.out.println("No of comparisons to sort an arrays :"+comps);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,34,63,87,25,99};
		System.out.println("Array Before Sorting"+Arrays.toString(arr));
		insertionsort(arr, arr.length);
		System.out.println("Array After Sorting"+Arrays.toString(arr));
		

	}

}
