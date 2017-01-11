
public class Primes {
	
	//Test github change from Windows
	
		private boolean isPrime(int num) {
			double sqr = Math.sqrt(num);
			int max = (int) sqr;
			if (num % 2 == 0 && num != 2) return false;
			for (int i = 3; i <= max; i+=2) {
				if (num % i == 0) return false;
			}
			return true;
		}
	
	public int countPrimes(int num) {
		int primes = 0;
		if (num >= 2) primes ++;
		
		for (int i = 3; i <= num; i += 2) {
			if (isPrime(i)) primes ++;
		}
		return primes;
	}
	
	public int countPrimes(int num1, int num2) {
		int primes = 0;
		if (num1 % 2 == 0) num1 ++;
		int pcDone = 1;
		
		for (int i = num1; i <= num2; i += 2) {
			if (i % 10000000 == 1) {
				System.out.println("Reached "+i+" ("+pcDone+"% done)");
				pcDone ++;
			}
			if (isPrime(i)) primes += 1;
		}
		return primes;
	}
}
