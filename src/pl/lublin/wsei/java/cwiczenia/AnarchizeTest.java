package pl.lublin.wsei.java.cwiczenia;
import java.util.Scanner;
//2a:

public class AnarchizeTest {
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        String tekst=null;
        do{
            System.out.print("\nWprowadź tekst: ");
            tekst = scanner.nextLine();
            //System.out.print(StringFun.Anarchize(tekst));

        }while(true);
    }
}
