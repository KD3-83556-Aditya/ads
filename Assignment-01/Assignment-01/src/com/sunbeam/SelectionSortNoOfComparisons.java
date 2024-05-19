package com.sunbeam;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortNoOfComparisons  {
	    public static void SelectionSort(int arr [],int N) {
	    	int comps=0;
	   for(int i=0; i<N-1;i++) {
		   for (int j=1;j<N;j++) {
			   if(arr[i]>arr[j]) {
				   int temp=arr[i];
				   arr[i]=arr[j];
				   arr[j]=temp;
				   comps++;
			   }
		   }
	   }
	   System.out.println("Number of comparisons-"+comps);
	}
	   

	    public static void main(String[] args) {
	        int[] arr = {11, 33, 55, 77, 30, 99, 33};
	     System.out.println("Array before sorting - "+Arrays.toString(arr));
     SelectionSort(arr,arr.length);
     
	   
		}

	}
	    


