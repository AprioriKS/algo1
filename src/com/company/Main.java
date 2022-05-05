package com.company;


import com.company.algo.BinnarySearch;
import com.company.algo.BubbleSort;
import com.company.algo.LinearSearch;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> mass = new ArrayList<>();
        mass.add("Bill");
        mass.add("Alice");
        mass.add("Bob");
        mass.add("Bogdan");
        mass.add("Vadym");
        int[] intArray = {10, 23, 124, 56, 1, 5, 15};

        System.out.println("Index = " + LinearSearch.linearSearch(mass, "Bogdan"));
        BubbleSort.bubbleSort(intArray);
        for (int t : intArray) {
            System.out.println(t);
        }
        BinnarySearch ob = new BinnarySearch();
        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                + result);
    }
}
