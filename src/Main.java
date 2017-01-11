
public class Main {

	public static void main(String[] args) {
		
		int primeMax = 2000000000;

		PrimeSieve ps = new PrimeSieve();
		System.out.println("Number of prime numbers up to "+primeMax+": "+ps.sieve(primeMax));
		
		/*
		CommonSubstring cs = new CommonSubstring();
		String x = "My name is Joe Gibbs-Murray and I like chicken and computers. I am 21 years old. Bye";
		String y = "My name is Joe Joyce and I like Java and MongoDB. I am 26 years old. See ya";
		String z = "My name is Joe Gibbs-Murray and I like chicken and computers.";
		//System.out.println(cs.findString(x,z));
		String a = "aaaaaaaaaaaaaaaaabbbbaaann";
		String b = "bbbbaaa";
		
		
		StringToString st = new StringToString();
		System.out.println(st.transformStrings(y,x));
		*/
		
		
	}

}
