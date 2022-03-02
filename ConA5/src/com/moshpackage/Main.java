package com.moshpackage;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	                                                                // find the shortest word
        String[] words ={"hello", "my", "name", "bhanu"};
        String sw = words[0];
        for (String fruit : words) {
            if (fruit.length() < sw.length()) {
                sw = fruit;
            }
        }
        System.out.println("Shortest word length: " + sw.length());

    }
}
