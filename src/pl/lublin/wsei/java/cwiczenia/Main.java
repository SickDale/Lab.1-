package pl.lublin.wsei.java.cwiczenia; // deklaracja pakietu package lab1

import java.util.Scanner;

public class /*definicja klasy public class Main*/ Main {


    public static void main(String[] args) /*
    *definicja metody public static void main*/{
        System.out.println("Hello Java world\n");
//7a
        System.out.print("Ala");
        System.out.print("ma");
        System.out.print("kota");
//7b
        System.out.println("Ala");
        System.out.println("ma");
        System.out.println("kota");
//7c
        System.out.print("Ala\n");
        System.out.print("ma\n");
        System.out.print("kota\n");
//7e-f
        int a = 3;
        double b = 4.21;
        String s = "tekst";

        System.out.printf("a = %d, b = %.2f, s = %20s %n",a,b,s);

        System.out.print("Nazwaliśmy to \" witaminą B3 \" ");

        System.out.printf("alfa\tsin(alfa)\n");
        for (int i = 0; i < 370; i+= 10){
            System.out.printf("%d\t%f\t\n", i, Math.sin(i / 360.0 * 2 * Math.PI));
        }

//8
        /*
        Scanner input = new Scanner (System.in);
        int num1, num2;
        System.out.print("Podaj pierwszą liczbę:");
        num1 = input.nextInt();
        System.out.print("Podaj drugą liczbę:");
        num2 = input.nextInt();
        System.out.printf("Wynik dodawania %d + %d = %d%n",num1,num2,num1+num2);
         */


//10b
        Scanner input = new Scanner(System.in);
        int num1;
        System.out.print("Podaj liczbę do przekonwertowania na typ szesnastkowy ");
        num1 = input.nextInt();
        System.out.println("liczba " + num1 + " w:\nPostaci szesnastkowej to " + Integer.toHexString(num1) + "\nPostaci binarnej to " + Integer.toBinaryString(num1) );

//10c

    }
}
