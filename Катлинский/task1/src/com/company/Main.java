package com.company;

public class Main {

    public static void main(String[] args) {
        Console c=new Console();
        c.printConsole("Введите число:");
        ConsoleParser pars = new ConsoleParser();
        pars.parseValue();
    }
}
