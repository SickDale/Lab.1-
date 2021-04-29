package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

public class IsPalindromeTest {

    public static void main() {
        Scanner scn = new Scanner(System.in);
        do {
            System.out.println(" Podaj tekst do sprawdzenia : ");
            String tekst = scn.nextLine();

            int h = tekst.length();

            int kk = 0;
            int k = (h - 1);
            for (int i = 0; i < h; i++) {

                if (tekst.charAt(i) != tekst.charAt(k)) {
                    kk = 1;
                    break;
                }
                k--;
            }

            if (kk == 1)
                System.out.println("Nie jest palindromem");
            else {
                System.out.println("Jest palindromem");
            }
    }while (true);
}
}

