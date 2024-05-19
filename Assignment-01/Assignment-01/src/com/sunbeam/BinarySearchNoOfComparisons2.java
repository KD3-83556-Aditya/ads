package com.sunbeam;

import java.util.Scanner;

public class BinarySearchNoOfComparisons2 {
    public static int linearSearch(int[] arr, int N, int key) {

        int left = 0;
        int right = N - 1;
        int mid;
        int comps = 0;

        while (left <= right) {
            mid = (left + right) / 2;

            if (key == arr[mid])
                return mid;

            else if (key < arr[mid])
                right = mid - 1;
            else
                left = mid + 1;
            comps++;

        }
        System.out.println("No of Comparison to find key: " + comps);

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {11, 33, 55, 77, 30, 99, 33};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter key to be searched : ");
        int key = sc.nextInt();

        int index = linearSearch(arr, arr.length, key);
        if (index != -1)
            System.out.println("Key is found at index " + index);
        else
            System.out.println("Key is not found");

        sc.close();
    }

}
