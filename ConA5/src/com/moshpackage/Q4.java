package com.moshpackage;

public class Q4 {
    public static void main(String[] args) {
                                                    //Check if a string has repeating elements
        String str = "My Name is Bhanu";
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    flag = true;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("String has repeating characters");
        }

    }
}
