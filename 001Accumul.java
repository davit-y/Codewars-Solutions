// https://www.codewars.com/kata/5667e8f4e3f572a8f2000039

public class Accumul {
    
    public static String accum(String s) {
      String result = "";
      for (int i = 0; i < s.length(); ++i) {
        result += formattedRepeater(s.charAt(i), i) + "-";
      }
      return result.substring(0,result.length()-1);
    }
    
    private static String formattedRepeater(char letter, int position) {
      String result =  Character.toString(Character.toUpperCase(letter));
      for (int i = 0; i < position; ++i) {
        result += Character.toString(Character.toLowerCase(letter));
      }
      return result;
    }
}
