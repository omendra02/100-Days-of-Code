package Day3;

public class FindtheIndex {
        public int strStr(String haystack, String needle) {
            int x = needle.length();
            for (int i = 0; i <= haystack.length() - x; i++) {
                if (haystack.substring(i, i + x).startsWith(needle)) {
                    return i;
                }
            }
            return -1;
        }

        public static void main(String[] args) {
            FindtheIndex solution = new FindtheIndex();
            
            // Test cases
            String haystack1 = "hello";
            String needle1 = "ll";
            System.out.println("Index of \"" + needle1 + "\" in \"" + haystack1 + "\": " + solution.strStr(haystack1, needle1));
            
            String haystack2 = "aaaaa";
            String needle2 = "bba";
            System.out.println("Index of \"" + needle2 + "\" in \"" + haystack2 + "\": " + solution.strStr(haystack2, needle2));
        }

    }


