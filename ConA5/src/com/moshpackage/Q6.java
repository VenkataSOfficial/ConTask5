package com.moshpackage;

public class Q6 {
    public static void main(String[] args) {
                                                                    //swaps the case of the alphabets of the string

        String str = "Invert My CASE";

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                Character.toLowerCase(chars[i]);
                System.out.print(chars[i]);
            } else {
                Character.toUpperCase(chars[i]);
                System.out.print(chars[i]);

            }
        }
       // System.out.println(str.toCharArray());

    }
}
