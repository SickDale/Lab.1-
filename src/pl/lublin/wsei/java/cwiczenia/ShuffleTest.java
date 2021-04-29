package pl.lublin.wsei.java.cwiczenia;
import java.util.Scanner;

public class ShuffleTest {

    private static pl.lublin.wsei.java.cwiczenia.mylib.StringFun StringFun;

    public static void main() {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("\nWprowadź tekst do wylosowania litery" +
                    " (wprowadź \"stop\" aby zakończyć): ");
            String sentence = scanner.nextLine();
            if (sentence.equals("stop")) break;
            System.out.print(StringFun.Shuffle(sentence));
        }
        while (true);
        return;
    }
}