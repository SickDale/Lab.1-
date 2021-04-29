package pl.lublin.wsei.java.cwiczenia.mylib;
import java.util.Random;


public class StringFun {
    /* public static boolean isPalindrome(String word) {

     // char charWord[] = word.toCharArray();
     // for(int i = charWord.length-1;)
         boolean output;

         String rev ="";

         System.out.println(rev);
         System.out.println(word);

         if(rev == word){
             output = true;
         }else{
             output = false;
         }
         System.out.println(output);
         return output;
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
     }

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

     public static String Decamelize(String sentence) {

         sentence = sentence.substring(0, 1).toLowerCase() + sentence.substring(1);

         int dlugosc = sentence.length();
         char charSentence[] = sentence.toCharArray();

         String decamelizeSentence = "";

         for (int i = 0; i < dlugosc; i++) {
             if (Character.isUpperCase(charSentence[i])) {
                 decamelizeSentence += " ";
             }
             decamelizeSentence += charSentence[i];

         }
         decamelizeSentence = decamelizeSentence.substring(0, 1).toUpperCase() + decamelizeSentence.substring(1);
         return decamelizeSentence;

     }*/
    public static Object Shuffle(String sentence) {
        Random random = new Random();

        int lenght;
        int lenght2 = sentence.length();
        char charSentence[];
        String shuffledSentence = "";
        int randomizedNumber;

        for (int i = 0; i < lenght2; i++) {
            lenght = sentence.length();
            randomizedNumber = random.nextInt(lenght);
            if (randomizedNumber == 0) randomizedNumber++;
            charSentence = sentence.toCharArray();

            shuffledSentence = shuffledSentence + charSentence[randomizedNumber - 1];

            sentence = sentence.substring(0, randomizedNumber - 1) + sentence.substring(randomizedNumber, lenght);

            return shuffledSentence;
        }
        return null;
    }
}