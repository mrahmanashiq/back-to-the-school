import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 11, 1};
        int n = arr.length;
        
        for (int i=0; i<n/2; i++) {
           swap(arr, i, n - i - 1);

           int temp = arr[i];
           arr[i] = arr[n-i-1];
           arr[n-i-1] = arr[i]

        }

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
