package com.kaushaltop;

public class SelectionSort {

    public int[] selectionSort(int a[]) {

        for (int i=0; i<a.length; i++) {

            int mini = i;

            for (int j=i+1; j<a.length; j++) {

                if (a[j] < a[mini]) {

                    mini = j;
                }
            }

            int temp = a[i];
            a[i] = a[mini];
            a[mini] = temp;
        }
        return a;
    }
}
