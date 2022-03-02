package com.moshpackage;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
                                        //Sum of all elements except for smallest and biggest number
        int[] arr = {1,4,2,6,5,7};
        int sum = 0;
        Arrays.sort(arr);
        for(int i=1;i<arr.length-1;i++) {
            sum += arr[i];
        }
        System.out.println("Sum = " +sum);
    }
}
