public class CommonSubstring {
	
	public String findString (String a, String b) {

		if (a.length() < b.length()) return findString(b,a);
		
		int sLength = b.length();
		
		//attempt to find entire shorter String (b) within longer String (a) and increment down
		for (int i = sLength; i > 0; i--) {
			//check for every substring length, i, starting at each position, j
			for (int j = 0; j <= sLength - i; j++) {
				String subString = b.substring(j,j+i);
				int ind = a.indexOf(subString);
				//first match to be found will be the longest
				if (ind != -1) return subString;
			}
		}	
		return "";
	}

}