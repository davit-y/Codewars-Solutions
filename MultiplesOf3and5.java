// https://www.codewars.com/kata/514b92a657cdc65150000006
/*
Description:

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.

Note: If the number is a multiple of both 3 and 5, only count it once.
*/

public class MultiplesOf3and5 {

  public int solution(int number) {
    return sumMultiplesBelow(number,3) + sumMultiplesBelow(number,5)
      - sumMultiplesBelow(number,15);
  }
  
  int sumMultiplesBelow(int number, int multiple) {
    int largestMultipleBelow = (number - 1) - ((number - 1) % multiple);
    int quotientOfLMB = largestMultipleBelow / multiple;
    return multiple * (quotientOfLMB * (quotientOfLMB + 1) / 2);
  }
}
