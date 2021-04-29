package pl.lublin.wsei.java.cwiczenia;


import pl.lublin.wsei.java.cwiczenia.mylib.StringFun;

import java.util.Scanner;

//2c:
public class DecamelizeTest {
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        String sentence=null;
        do{
            System.out.print("\nWprowadź tekst: ");
            sentence = scanner.nextLine();
            System.out.print(StringFun.Decamelize(sentence));

        }while(true);
    }
}