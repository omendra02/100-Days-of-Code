package Day94100;

public class Q4 {
    class Solution {

        public boolean makeEqual(String[] words) {
            

            final int[] characterCount = new int[26];
    
            // Loop through each word in the input array 'words'.
            for (String inputWord : words) {

                for (char inputChar : inputWord.toCharArray()) {

                    characterCount[inputChar - 'a']++;
                }
            }
    

            for (int count : characterCount) {
                if (count % words.length != 0) {

                    return false;
                }
            }
    
            return true;
        }
    }
}
