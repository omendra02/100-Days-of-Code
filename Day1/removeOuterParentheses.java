package Day1;
class removeOuterParentheses {
    public String removeOuterParentheses1(String s) {
        int len = s.length();
        if (len <= 2) return "";
        char[] c = s.toCharArray();
        StringBuilder newString = new StringBuilder();
        int open = 1;
       // int openLeft = 0;
        for (int i = 1; i < len; i++) {
            if (c[i] == '(') {
                open++;
                if (open > 1) newString.append('(');
            }
            else {
                if (open > 1) newString.append(')');
                open--;
            }
        }
        return newString.toString();
    }

    public static void main(String[] args) {
        removeOuterParentheses solution = new removeOuterParentheses();
        
        // Example input string
        String input = "(()())(())";
        
        // Call the removeOuterParentheses method
        String result = solution.removeOuterParentheses1(input);
        
        // Print the result
        System.out.println("Result: " + result);
    }
    
}
