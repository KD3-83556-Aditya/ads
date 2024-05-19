package com.sunbeam;

import java.util.Arrays;

public class InsertionSortDesc {
    public static void insertionSort(int arr[], int n) {
       
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < temp) {
                arr[j + 1] = arr[j];
                j --;
            }
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {25, 28, 94, 100, 76, 45, 34};
        System.out.println("Array Before sorting: " + Arrays.toString(arr));
        insertionSort(arr, arr.length);
        System.out.println("Array After sorting: " + Arrays.toString(arr));
    }
}
