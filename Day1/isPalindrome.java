package Day1;

class isPalindrome {
    public boolean isPalindrome1(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        int i = 0;
        int j = s.length() - 1;
        while(i <= j) {
        	char currFirst = s.charAt(i);
        	char currLast = s.charAt(j);
        	if (!Character.isLetterOrDigit(currFirst)) {  //check spaces betwwen strings
        		i++;
        	} else if(!Character.isLetterOrDigit(currLast)) {
        		j--;
        	} else {
        		if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
        			return false;
        		}
        		i++;
        		j--;
        	}
        }
        return true;
    }

	public static void main(String[] args) {
        isPalindrome solution = new isPalindrome();

        // Example input string
        String input1 = "A man, a plan, a canal: Panama";
        String input2 = "race a car";

        // Call the isPalindrome1 method
        System.out.println("Is \"" + input1 + "\" a palindrome? " + solution.isPalindrome1(input1));
        System.out.println("Is \"" + input2 + "\" a palindrome? " + solution.isPalindrome1(input2));
    }
}