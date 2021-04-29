package pl.lublin.wsei.java.cwiczenia;
import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;

import java.util.Scanner;
//2b:

public class CamelizeTest {
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        String tekst=null;
        do{
            System.out.print("\nWprowadź tekst: ");
            tekst = scanner.nextLine();
            System.out.print(StringFun.Camelize(tekst));

        }while(true);
    }
}
