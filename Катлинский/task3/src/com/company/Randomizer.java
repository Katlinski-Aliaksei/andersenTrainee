package com.company;

public class Randomizer {
    private final static int MAX_NUMBER = 200;
    private final static int MIN_NUMBER = -200;
    int size = 20;

    public void setArray() {
        Filter filter = new Filter();
        int[] array = new int[size];
        System.out.print("Массив имеет вид: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (MAX_NUMBER - MIN_NUMBER) + MIN_NUMBER);
            System.out.print(array[i] + " ");
        }
        filter.filterArray(array);
    }
}
