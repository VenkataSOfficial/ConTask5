package com.moshpackage;

public class Q5 {
    public static void main(String args[]) {
                                                                            //Find the odd number in an array
        int a[] = {24, 2, 18, 36, 3, 94};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }
        }

    }
}
