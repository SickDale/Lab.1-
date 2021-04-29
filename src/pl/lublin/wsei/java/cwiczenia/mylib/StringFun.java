package pl.lublin.wsei.java.cwiczenia.mylib;

import org.apache.commons.lang3.StringUtils;

public class StringFun {

    public static boolean isPalindrome(String word) {
        return false;
    }

    /*public static String Anarchize(String tekst) {
        int długość = tekst.length();
        char tekstChar[] = tekst.toCharArray();

        if (Character.isLowerCase(tekst.charAt(0))) {
            for (int i = 1; i < długość; i += 2) {
                tekstChar[i] = Character.toUpperCase(tekstChar[i]);
            }
        }
        else {
            for (int i = 0; i < długość; i += 2) {
                tekstChar[i] = Character.toUpperCase(tekstChar[i]);
            }
        }
        return new String(tekstChar);
    }*/
    static String toProperCase(String t)
    {
        return t.substring(0, 1).toUpperCase() + t.substring(1).toLowerCase();
    }
    public static String Camelize(String tekst) {
        String znormalizowanyTekst = StringUtils.normalizeSpace(tekst);
        String[] części = znormalizowanyTekst.split(" ");
        String stringWCamelu = "";
        for (String część : części) {
            stringWCamelu = stringWCamelu + toProperCase(część);
        }

        char ch[] = stringWCamelu.toCharArray();
        ch[0] = Character.toLowerCase(ch[0]);

        return new String(ch);
    }

}
