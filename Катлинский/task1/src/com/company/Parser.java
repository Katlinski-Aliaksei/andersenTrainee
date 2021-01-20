package com.company;

import java.util.Scanner;

public class Parser {

    public void parsValue() {
        Scanner s = new Scanner(System.in);
        Compare compare = new Compare();
        Double value = null;
        boolean flag = true;
        while (flag) {
            try {
                value = Double.parseDouble(s.nextLine());
            } catch (NumberFormatException | NullPointerException e) {
                System.out.println("Некорректный ввод данных! \n Введите число:");
                continue;
            }
            if (value > Double.MAX_VALUE || value < (Double.MIN_VALUE)) {
                System.out.println("Введенное Вами число находится за пределами double \n Попробуйте ещё раз:");
                continue;
            }
            flag = false;

        }
        compare.sayHello(value);

    }
}
