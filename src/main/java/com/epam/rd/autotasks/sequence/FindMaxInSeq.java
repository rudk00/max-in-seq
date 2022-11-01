package com.epam.rd.autotasks.sequence;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int maxValue=value;
        while (true) {
            value = scanner.nextInt();
            if(value==0)break;
            if (value >= maxValue ) {
                maxValue = value;
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        System.out.println(max());
    }
}
