package com.company;

public class Filter {

  private   Console c=new Console();

    public void sayHelloSlava(String name) {

        if (name.equalsIgnoreCase("Вячеслав"))
            c.printConsole("Привет, Вячеслав");
        else
            c.printConsole("Нет такого имени");

    }
}
