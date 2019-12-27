package com.kaushaltop;

public class QuickSort {

    public int[] sort(int[] inputArray) {

        quickSort(inputArray, 0, inputArray.length-1);

        return inputArray;
    }

    private void quickSort(int[] inputArray, int start, int end) {

        if (start <= end) {

            int mid = partition(inputArray, start, end);
            quickSort(inputArray, start, mid-1);
            quickSort(inputArray, mid+1, end);
        }
    }

    private int partition(int[] inputArray, int start, int end) {

        int pivot = inputArray[end];
        int i = start - 1;

        for (int j=start; j<end; j++) {

            if (inputArray[j] <= pivot) {
                i++;
                int temp = inputArray[i];
                inputArray[i] = inputArray[j];
                inputArray[j] = temp;
            }
        }
        int temp = inputArray[i+1];
        inputArray[i+1] = inputArray[end];
        inputArray[end] = temp;
        return i+1;
    }
}
