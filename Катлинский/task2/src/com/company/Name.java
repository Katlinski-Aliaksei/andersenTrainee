package com.company;

import java.util.Scanner;

public class Name {

    public void scanName() {

        Filter f = new Filter();
        Console c=new Console();
        String name = null;
        boolean flag = true;
        c.printConsole("Введите имя");

        while (flag) {
           name = c.inputConsole();
            if (name.matches("[а-яА-Яa-zA-Z]+")) {
                flag = false;
            } else {
                c.printConsole("Вы ввели некорректное значение имени\n Введите имя еще раз:");
                continue;
            }

        }
        f.sayHelloSlava(name);
    }
}
