package Day9;

public class LengthOfLastWord {
    
        public int lengthOfLastWord1(String s) {
            int count=0;
    
            for(int i=s.length()-1;i>=0;i--){
                if(s.charAt(i) != ' '){
                    count++;
                }
                else{
                    if(count > 0){
                        return count;
                    }
                }
                
            }
            return count;
            
        }
        public static void main(String[] args) {
            LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
            
            // Test cases
            String[] testCases = {
                "Hello World",
                "  Hello World  ",
                "  Hello  ",
                "", // Empty string, so last word length is 0
                "   ", // Only spaces, so last word length is 0
                "Programming", 
                "Java is awesome" 
            };
            
            for (String testCase : testCases) {
                int length = lengthOfLastWord.lengthOfLastWord1(testCase);
                System.out.println("Length of last word in '" + testCase + "': " + length);
            }
        }

    }

