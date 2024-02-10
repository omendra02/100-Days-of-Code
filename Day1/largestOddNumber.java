package Day1;

class largestOddNumber {
    public String largestOddNumber1(String num) {
        if((int)num.charAt(num.length()-1)%2==1) return num;
        int i=num.length()-1;
        while(i>=0){
            int n=num.charAt(i);
            if(n%2==1) return num.substring(0,i+1);
            i--;
        }
        return "";
    }

    public static void main(String[] args) {
        largestOddNumber solution = new largestOddNumber();

        // Example input string
        String input1 = "52";
        String input2 = "4206";
        String input3 = "35427";

        // Call the largestOddNumber1 method
        System.out.println("Largest odd number for \"" + input1 + "\": " + solution.largestOddNumber1(input1));
        System.out.println("Largest odd number for \"" + input2 + "\": " + solution.largestOddNumber1(input2));
        System.out.println("Largest odd number for \"" + input3 + "\": " + solution.largestOddNumber1(input3));
    }
}
