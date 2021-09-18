package com.co.pa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        saveNumbers(num);
    }

    public static void saveNumbers(long num){
        char[] value = String.valueOf(num).toCharArray();
        int count = 0;

        for(int i = 0; i < value.length; i++) {
            int x = Integer.valueOf(String.valueOf(value[i]));
            if (num % x == 0)
                count++;
        }
        System.out.println(count);
    }
}
