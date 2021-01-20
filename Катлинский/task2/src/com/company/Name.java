package com.company;

import java.util.Scanner;

public class Name {

    public void setName() {

        Filter f = new Filter();
        Scanner s = new Scanner(System.in);
        String name = null;
        boolean flag = true;
        System.out.println("Введите имя");

        while (flag) {
            name = s.nextLine();
            if (name.matches("[а-яА-Яa-zA-Z]+")) {
                flag = false;
            } else {
                System.out.println("Вы ввели некорректное значение имени\n Введите имя еще раз:");
                continue;
            }

        }
        f.sayHelloSlava(name);
    }
}
