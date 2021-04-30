package pl.lublin.wsei.java.cwiczenia;

import static pl.lublin.wsei.java.cwiczenia.StrongPasswordGenerator.Generate;

public class Main {

    public static void main(String[] args) {

     /*AnarchizeTest.main();*/
        /* CamelizeTest.main();*/
     //DecamelizeTest.main();
        //IsPalindromeTest.main();
        //ShuffleTest.main();

        for (int i = 0; i < 5; i++)
    { Generate(20, true,true,true,true,"!@#$%^&*()");
        System.out.print("\n"); }
}}