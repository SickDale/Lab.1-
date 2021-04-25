package pl.lublin.wsei.java.cwiczenia.mylib;

//12

public class Account {
 private String name;

 public String getName() {
  return name;
 }

 public static String translit(String arg) {
  String ukrAlphabet = "абвгдеєжзиіїйклмнопрстуфхцчшщьюя";
  char[] ukrChar = ukrAlphabet.toCharArray();
  System.out.println(ukrAlphabet);
  String[] translitRepl = {"a", "b", "v", "g", "d", "e", "je", "zh", "z", "y", "i", "ji", "j",
          "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f", "h", "c",
          "ch", "sh", "shh", "'", "ju", "ja"};
  char[] tokens = arg.toCharArray();


  String output = "";
  for (int i = 0; i < tokens.length; i++)

   for (int j = 0; j < ukrChar.length; j++) {
    if (tokens[i] == ukrChar[j]) {
     output = output + translitRepl[j];
     break;
    }
   }

  return output;
 }

 public void setName(String name) {
  this.name = translit(name);
 }

}
