package com.company;

import java.util.Scanner;

public class ConsoleParser {

    public void parseValue() {
        Comparator compare = new Comparator();
        Console c=new Console();
        Double value = null;
        boolean flag = true;
        while (flag) {
            try {
                value = Double.parseDouble(c.inputConsole());
            } catch (NumberFormatException | NullPointerException e) {
                c.printConsole("Некорректный ввод данных! \n Введите число:");
                continue;
            }
            if (value > Double.MAX_VALUE || value < (Double.MIN_VALUE)) {
                c.printConsole("Введенное Вами число находится за пределами double \n Попробуйте ещё раз:");
                continue;
            }
            flag = false;

        }
        compare.sayHello(value);

    }
}
