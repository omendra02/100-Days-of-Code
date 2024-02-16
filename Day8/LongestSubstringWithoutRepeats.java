package Day8;

public class LongestSubstringWithoutRepeats {
    
        public static String longestSubstringWithoutRepeats(String s) {
            int start = 0;
            int maxLength = 0;
            int maxStart = 0;
    
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                int index = s.indexOf(c, start);
    
                if (index >= start && index < i) {
                    start = index + 1;
                }
    
                
                if (i - start + 1 > maxLength) {
                    maxLength = i - start + 1;
                    maxStart = start;
                }
            }
    
           
            return s.substring(maxStart, maxStart + maxLength);
        }

        public static void main(String[] args) {
            // Test the longestSubstringWithoutRepeats method with sample inputs
            String input1 = "abcabcbb";
            String input2 = "bbbbb";
            String input3 = "pwwkew";
            
            System.out.println("Longest substring without repeating characters in \"" + input1 + "\": "
                                + longestSubstringWithoutRepeats(input1));
            System.out.println("Longest substring without repeating characters in \"" + input2 + "\": "
                                + longestSubstringWithoutRepeats(input2));
            System.out.println("Longest substring without repeating characters in \"" + input3 + "\": "
                                + longestSubstringWithoutRepeats(input3));
        }
        
    }
    

