// https://www.codewars.com/kata/54b724efac3d5402db00065e

public class MorseCodeDecoder {
  public static String decode(String morseCode) {
    String finalValue = "";
    String[] allWords = morseCode.trim().split("   ");    
    for (String word: allWords) {
      String[] allCodes = word.split(" ");
      for (String code: allCodes) {
        finalValue += MorseCode.get(code);
      }
      finalValue += " ";
    }
    return finalValue.substring(0,finalValue.length() - 1);
  }
}
