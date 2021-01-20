package com.company;

public class Filter {
    Console c=new Console();
    public void filterArray(int[] array) {

        c.printConsole("\nЭлементы массива кратные 3: ");
        for (int i : array) {
            if (i % 3 == 0) {
                c.printConsole(i + " ");
            }
        }
    }
}
