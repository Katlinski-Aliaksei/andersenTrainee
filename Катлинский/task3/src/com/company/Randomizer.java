package com.company;

public class Randomizer {
    Console c=new Console();
    private final static int MAX_NUMBER = 200;
    private final static int MIN_NUMBER = -200;
    int size = 20;

    public void displayRandomArrayMultipleToThree() {
        Filter filter = new Filter();
        int[] array = new int[size];
        c.printConsole("Массив имеет вид: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (MAX_NUMBER - MIN_NUMBER) + MIN_NUMBER);
            c.printConsole(array[i] + " ");
        }
        filter.filterArray(array);
    }
}
