import java.util.ArrayList;

public class PrimesTwo {
	public int primes(int num) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		for (int i = 3; i < num; i += 2) {
			double sqr = Math.sqrt(i);
			int max = (int) sqr;
			boolean prime = true;
			for (int x : primes) {
				if (x < max) {
					if (i % x == 0) {
						prime = false;
						break;
					}
				}
			}
			if (prime)
				primes.add(i);
		}
		// for (int n : primes) System.out.println(n);
		return primes.size();
	}

}
