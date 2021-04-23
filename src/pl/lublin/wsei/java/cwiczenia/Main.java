package pl.lublin.wsei.java.cwiczenia; // deklaracja pakietu package lab1

import pl.lublin.wsei.java.cwiczenia.mylib.Account;

import java.util.Scanner;



//12
public class Main{

    public static void main(String[] args) {
        Account acc = new Account();
        acc.setName ("piotr gołabek");
         System.out.println(acc.getName());
        System.out.printf("%s%n",Account.capitalize("StanisŁaw maruSARz"));

    }

}