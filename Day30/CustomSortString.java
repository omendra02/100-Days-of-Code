package Day30;

public class CustomSortString {
   
        public String customSortString(String order, String str) {
            StringBuilder s1 = new StringBuilder();
            StringBuilder s2 = new StringBuilder();
            int[] count = new int[26];
            
            for (char c : str.toCharArray()) {
                if (order.indexOf(c) == -1) {
                    s2.append(c);
                } else {
                    count[c - 'a']++;
                }
            }
            
            for (char c : order.toCharArray()) {
                while (count[c - 'a']-- > 0) {
                    s1.append(c);
                }
            }
            
            return s1.toString() + s2.toString();
        }
    }
    

