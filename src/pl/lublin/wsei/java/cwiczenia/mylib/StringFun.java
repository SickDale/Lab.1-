package pl.lublin.wsei.java.cwiczenia.mylib;

public class StringFun {

    public static boolean isPalindrome(String word){
        return false;
    }

    public static String Anarchize (String tekst)
    {
        int długość = tekst.length();
        char tekstChar[] = tekst.toCharArray();

        if(Character.isLowerCase(tekst.charAt(0))) {
            for (int i = 1; i < długość; i += 2) {
                tekstChar[i] = Character.toUpperCase(tekstChar[i]);
            }
        } else {
            for (int i = 0; i < długość; i += 2){
                tekstChar[i] = Character.toUpperCase(tekstChar[i]);
            }
    }
      return new String(tekstChar);
    }

}
