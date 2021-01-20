package com.company;

import java.util.Scanner;

public class Console {

    public String inputConsole(){
        Scanner s = new Scanner(System.in);
       String name = s.nextLine();
       return name;
    }

    public void printConsole(String message){
        System.out.println(message);
    }

}
