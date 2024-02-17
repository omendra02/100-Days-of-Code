package Day9;

import java.util.HashMap;

public class WordPattern {
  
    public boolean wordPattern(String pattern, String s) {
        String[] word = s.split(" ");
        if(word.length != pattern.length()) return false;

        HashMap<Character, String> map = new HashMap();
        for(int i=0; i<pattern.length(); i++){
            char c = pattern.charAt(i);

            if(map.containsKey(c)){
                if(!map.get(c).equals(word[i])){
                    return false;
                }
            }else {
                if(map.containsValue(word[i])){
                    return false;
                }
                map.put(c, word[i]);
            }
        }

        return true;
    }
    public static void main(String[] args) {
        WordPattern wordPattern = new WordPattern();
        
        // Test cases
        String[][] testCases = {
            {"abba", "dog cat cat dog"}, // true
            {"abba", "dog cat cat fish"}, // false
            {"aaaa", "dog cat cat dog"}, // false
            {"abba", "dog dog dog dog"} // false
        };
        
        for (String[] testCase : testCases) {
            boolean result = wordPattern.wordPattern(testCase[0], testCase[1]);
            System.out.println("Pattern '" + testCase[0] + "' and string '" + testCase[1] + "': " + result);
        }
    }

}
