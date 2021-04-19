package pl.lublin.wsei.java.cwiczenia; // deklaracja pakietu package lab1

public class /*definicja klasy public class Main*/ Main {

    public static void main(String[] args) /*
    *definicja metody public static void main*/ {
        int a = 3;
        double b = 4.21;
        String s = "tekst";

        System.out.printf("a = %d, b = %.2f, s = %20s %n",a,b,s);

        System.out.print("Nazywaliśmy to \"witaminą B3\" ");

        System.out.printf("alfa\tsin(alfa\n");
        for(int i = 0; i<370; i+=10){
            System.out.printf("%d\t%f\t\n" , i, Math.sin(i / 360.0 * 2 * Math.PI));
        }

    }
} 
