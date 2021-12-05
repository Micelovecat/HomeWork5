package ru.skypro;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        HomeWork5Easy1();
        System.out.println("HomeWork5. Exercise 1.");
        int[] integers = new int[]{1, 2, 3};
        double[] doubles = {1.57, 7.654, 9.986};
        float[] fractionalNumbers = new float[]{0.5f, 1.0f, 1.5f};

//        HomeWork5Easy2();
        System.out.println("HomeWork5. Exercise 2.");
        for (int i = 0; i < integers.length; i++) {
            if (i == integers.length - 1) {
                System.out.println(integers[i]);
            } else {
                System.out.print(integers[i] + ", ");
            }
        }
        for (int i = 0; i < doubles.length; i++) {
            if (i == doubles.length - 1) {
                System.out.println(doubles[i]);
            } else {
                System.out.print(doubles[i] + ", ");
            }
        }
        for (int i = 0; i < fractionalNumbers.length; i++) {
            if (i == fractionalNumbers.length - 1) {
                System.out.println(fractionalNumbers[i]);
            } else {
                System.out.print(fractionalNumbers[i] + ", ");
            }
        }
        System.out.println();

//       HomeWork5Easy3();
        System.out.println("HomeWork5. Exercise 3.");
        for (int i = integers.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(integers[i]);
            } else {
                System.out.print(integers[i] + ", ");
            }
        }

        for (int i = doubles.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(doubles[i]);
            } else {
                System.out.print(doubles[i] + ", ");
            }
        }

        for (int i = fractionalNumbers.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(fractionalNumbers[i]);
            } else {
                System.out.print(fractionalNumbers[i] + ", ");
            }
        }
        System.out.println();

//       HomeWork5Easy4();
        System.out.println("HomeWork5. Exercise 4.");
        for (int i = 0; i < integers.length; i++) {
            if (i % 2 == 0) {
                integers[i] = integers[i] + 1;
                {
                    System.out.println(integers[i]);
                }
            } else {
                    System.out.println(integers[i]);
            }
        }
        System.out.println();
    }
}
//     HomeWork5Easy();