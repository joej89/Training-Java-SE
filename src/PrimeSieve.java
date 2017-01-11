public class PrimeSieve {
	
	public int sieve (int x) {
		long startTime = System.currentTimeMillis();
		//Array of booleans (default false) of size x
		boolean[] nums = new boolean[x];
		//number of prime numbers initially 0
		int primes = 0;
		//from 2 - first prime
		for (int i = 2; i < x; i++) {
			//if number is still false - default - it is a prime number
			if (nums[i] == false) {
				if (i < x / 2) {
					//all multiples of the number are set to true - not prime
					for (long j = 2*i; j < x; j+=i) {
						if(j < x) nums[(int) j] = true;
					}
				}
				//prime count incremented
				primes ++;
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println((endTime - startTime)/1000 + " seconds getting primes");
		return primes;
	}
}