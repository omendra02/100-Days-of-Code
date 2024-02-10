package Day1;

class reverseWords {
    public String reverseWords1(String s) {
        // Trim the input string to remove leading and trailing spaces
        String[] str = s.trim().split("\\s+");

        // Initialize the output string
        String out = "";

        // Iterate through the words in reverse order
        for (int i = str.length - 1; i > 0; i--) {
            // Append the current word and a space to the output
            out += str[i] + " ";
        }

        // Append the first word to the output (without trailing space)
        return out + str[0];
    }
    
    public static void main(String[] args) {
        reverseWords solution = new reverseWords();

        String input = "the sky is blue";

        // Call the reverseWords method
        System.out.println("Reversed words: " + solution.reverseWords1(input));
    }
}