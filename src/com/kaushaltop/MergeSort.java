package com.kaushaltop;

public class MergeSort {

    public int[] sort(int[] a) {

        mergeSort(a, 0, a.length-1);

        return a;
    }

    public void mergeSort(int[] a, int start, int end) {

        if (end <= start) {
            return;
        }

        int mid = (start+end)/2;

        mergeSort(a, start, mid);
        mergeSort(a, mid+1, end);
        merge(a, start, mid, end);
    }

    public void merge(int[] inputArray, int start, int mid, int end) {

        //Get sizes for left and right arrays
        int s1 = mid - start + 1;
        int s2 = end - mid;

        //Create a left and right array
        int L[] = new int [s1];
        int R[] = new int [s2];

        //Copy elements into two separate arrays
        for (int i=0; i<s1; ++i)
            L[i] = inputArray[start + i];
        for (int j=0; j<s2; ++j)
            R[j] = inputArray[mid + 1+ j];


        int i = 0, j = 0;
        int k = start;

        //Start your comparision
        while (i < s1 && j < s2)
        {
            if (L[i] <= R[j])
            {
                inputArray[k] = L[i];
                i++;
            }
            else
            {
                inputArray[k] = R[j];
                j++;
            }
            k++;
        }

        //Copy the remaining elements
        while (i < s1)
        {
            inputArray[k] = L[i];
            i++;
            k++;
        }
        while (j < s2)
        {
            inputArray[k] = R[j];
            j++;
            k++;
        }
    }
}
