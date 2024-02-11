package Day3;

import java.util.HashMap;
import java.util.Map;

class RomanToInteger {
    
    public int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<>();
        
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        
        int ans = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
                ans -= m.get(s.charAt(i));
            } else {
                ans += m.get(s.charAt(i));
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        RomanToInteger romanConverter = new RomanToInteger();
        
        // Test cases
        System.out.println("Integer value of IV: " + romanConverter.romanToInt("IV"));
        System.out.println("Integer value of IX: " + romanConverter.romanToInt("IX"));
        System.out.println("Integer value of LVIII: " + romanConverter.romanToInt("LVIII"));
        System.out.println("Integer value of MCMXCIV: " + romanConverter.romanToInt("MCMXCIV"));
    }
    }

