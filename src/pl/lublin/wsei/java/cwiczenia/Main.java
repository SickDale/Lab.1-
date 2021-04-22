package pl.lublin.wsei.java.cwiczenia; // deklaracja pakietu package lab1

import pl.lublin.wsei.java.cwiczenia.mylib.Account;

import java.util.Scanner;



//12
public class Main{

    public static void main(String[] args) {
        Account acc = new Account();
        acc.name = "Piotr Gołabek";
         System.out.println(acc.getName());

    }

}