//https://www.codewars.com/kata/550f22f4d758534c1100025a
/*
Description:
Once upon a time, on a way through the old wild west,…
… a man was given directions to go from one point to another. The directions were "NORTH", "SOUTH", "WEST", "EAST". Clearly "NORTH" and "SOUTH" are opposite, "WEST" and "EAST" too. Going to one direction and coming back the opposite direction is a needless effort. Since this is the wild west, with dreadfull weather and not much water, it's important to save yourself some energy, otherwise you might die of thirst!
How I crossed the desert the smart way.
The directions given to the man are, for example, the following:
["NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"].
Task:
Write a function dirReduc which will take an array of strings and returns an array of strings with the needless directions removed (W<->E or S<->N side by side).
*/

import java.util.ArrayList;
import java.util.Arrays;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
      ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
      for (int i = 0; i + 1 < list.size(); ++i) {
        if (i >= 0 && isRedundant(list.get(i), list.get(i + 1))) {
          list.remove(i);  
          list.remove(i);
          i = i - 2;
        }
      }
      return list.toArray(new String[list.size()]);
    }
        
    private static boolean isRedundant (String a, String b) {
      return (a.equals("NORTH") && b.equals("SOUTH")) || 
        (a.equals("EAST") && b.equals("WEST")) ||
        (a.equals("SOUTH") && b.equals("NORTH")) || 
        (a.equals("WEST") && b.equals("EAST"));
    }
}
