package com.company;

public class Filter {
    public void filterArray(int[] array) {

        System.out.print("\nЭлементы массива кратные 3: ");
        for (int i : array) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
