
public class StringToString {
	
	public int deletions = 0;
	public int insertions = 0;
	
	//checks a substring of longer String a and counts how many chars match String b
	private int countSameChar (String a, String b, int x) {
		int sum = 0;
		a = a.substring(x, x + b.length());
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == b.charAt(i)) sum ++;
		}
		return sum;
	}
	
	//checks index at which to make a substring of longer String which best matches shorter String
	private int[] checkStrings (String a, String b) {
		int index = 0;
		int matches = 0;
		for (int i = 0; i <= a.length() - b.length(); i++) {
			int c = countSameChar(a,b,i);
			if (c > matches) {
				matches = c;
				index = i;
			}
		}
		int [] out = {index, matches};
		return out;
	}
	
	//trims start of longer string through individual chars
	private StringBuilder trimStart (StringBuilder sb, int ind) {
		for (int i = 0; i <= ind-1; i++) {
			sb.deleteCharAt(0);
			deletions ++;
		}
		return sb;
	}
	
	//trims end of longer string through individual chars
	private StringBuilder trimEnd (StringBuilder sb, int num) {
		for (int i = 0; i < num; i++) {
			sb.deleteCharAt(sb.length()-1);
			deletions++;
		}
		return sb;
	}
	
	public String transformStrings (String a, String b) {
		
		if (a.length() < b.length()) return transformStrings(b,a);
		
		//determines index of longer string at which the following chars best match the chars in the shorter string
		int[] start = checkStrings(a,b);
		int ind = start[0];
		
		StringBuilder out = new StringBuilder(a);
		
		//trimming the start
		out = trimStart(out, ind);
		
		//trimming the end
		int diff = out.length() - b.length();
		out = trimEnd(out, diff);
		
		//replacing mismatched chars - uses delete and insert instead of replace
		for (int i = 0; i < out.length(); i++) {
			
			char chA = out.charAt(i);
			char chB = b.charAt(i);
			
			if(chA != chB) {
				out.deleteCharAt(i);
				out.insert(i,chB);
				deletions++;
				insertions++;
				
			}
		}
		
		System.out.println(deletions+" deletions, and "+insertions+" insertions done...");
		
		return out.toString();
		
	}
	
	public void test () {
		/*
		String a = " l   ";
		String b = " h  p";
		System.out.println(countSameChar(a,b,0));
		*/
		
		String a = "a     bbaa";
		String b = "baa";
		checkStrings(a,b);
	}
	
}
