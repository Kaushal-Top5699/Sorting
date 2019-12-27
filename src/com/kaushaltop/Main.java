package com.kaushaltop;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        SelectionSort selectionSort = new SelectionSort();
        System.out.println("Selection Sort "+Arrays.toString(selectionSort.selectionSort(new int[]{9, 3, 6, 12, 7, 4, 10})));

        InsertionSort insertionSort = new InsertionSort();
        System.out.println("Insertion Sort "+Arrays.toString(insertionSort.insertionSort(new int[]{9, 3, 6, 12, 7, 4, 10})));

        MergeSort sort = new MergeSort();
        System.out.println("Merge Sort "+Arrays.toString(sort.sort(new int[]{9, 3, 6, 12, 7, 4, 10})));

        QuickSort sort1 = new QuickSort();
        System.out.println("Quick Sort "+Arrays.toString(sort1.sort(new int[]{9, 3, 6, 12, 7, 4, 10})));

    }
}
