//https://www.codewars.com/kata/5592e3bd57b64d00f3000047

public class ASum {
	public static long findNb(long m) {
    long vol = m, n = 1;
    while(vol >= 0) {
      if (vol == 0) {
        return n - 1;
      }
      vol -= (n * n * n);
      ++n;
    }
		return -1;
	}
}
