package com.company;

public class Filter {

    public void sayHelloSlava(String name) {

        if (name.equalsIgnoreCase("Вячеслав"))
            System.out.println("Привет, Вячеслав");
        else
            System.out.println("Нет такого имени");

    }
}
