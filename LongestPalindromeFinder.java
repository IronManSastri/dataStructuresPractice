package level1;
public class LongestPalindromeFinder {

	public static void main(String[] args) {
		;
		System.out.println(longestPalindromeString("66767771717717"));
		//System.out.println(longestPalindromeString("171773717272"));
		//System.out.println(longestPalindromeString("abb"));
	}

	static public String intermediatePalindrome(String s, int left, int right) {
		if (left > right) 
			
			return null;
		
		while (left >= 0 && right < s.length()
				&& s.charAt(left) == s.charAt(right)) {
			left--;
			//System.out.println("Left--: "+left);
			right++;
			//System.out.println("right++: "+right);
		}
		//System.out.println(left+1 +" "+right);
		return s.substring(left + 1, right);
		
	}

	
	public static String longestPalindromeString(String s) {
		if (s == null) return null;
		String longest = s.substring(0, 1);
		for (int i = 0; i < s.length() - 1; i++) {
			//odd length 
			//System.out.println(s+" "+i);
			String palindrome = intermediatePalindrome(s, i, i);
			if (palindrome.length() > longest.length()) {
				longest = palindrome;
		//		System.out.println("Odd Case:"+palindrome);
			}
			//even length 
			palindrome = intermediatePalindrome(s, i, i + 1);
			if (palindrome.length() > longest.length()) {
				longest = palindrome;
			//	System.out.println("Even Case:"+palindrome);
			}
		}
		return longest;
	}

}