package com.sunbeam;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionsort(SortEmployees[] employees, int n) {
        int comps = 0;
        for (int i = 1; i < n; i++) {
            SortEmployees temp = employees[i];
            int j = i - 1;

            while (j >= 0 && employees[j].getSalary() > temp.getSalary()) {
                employees[j + 1] = employees[j];
                j--;
                comps++;
            }
            employees[j + 1] = temp;
        }
        System.out.println("No of comparisons to sort the array: " + comps);
    }

    public static void main(String[] args) {
        SortEmployees[] employees = {
            new SortEmployees(4, "raj", 50000),
            new SortEmployees(2, "sam", 60000),
            new SortEmployees(1, "ramu", 45000),
            new SortEmployees(3, "gopi", 70000)
        };

        System.out.println("Array Before Sorting: " + Arrays.toString(employees));
        insertionsort(employees, employees.length);
        System.out.println("Array After Sorting: " + Arrays.toString(employees));
    }
}
