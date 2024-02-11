package Day3;
import java.util.Arrays;

public class ValidAnagram {
   
    public boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        
        return Arrays.equals(sChars, tChars);
    }

    public static void main(String[] args) {
        ValidAnagram va = new ValidAnagram();
        String s = "anagram";
        String t = "nagaram";
        boolean result = va.isAnagram(s, t);
        System.out.println("Are \"" + s + "\" and \"" + t + "\" anagrams? " + result);
    }
}

