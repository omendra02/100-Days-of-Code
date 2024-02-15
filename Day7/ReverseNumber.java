package Day7;

public class ReverseNumber {
    public int revno(int n, int reversedNumber) {
        // Base case: if n becomes 0, return the reversed number
        if (n == 0) {
            return reversedNumber;
        } else {
            // Extract the last digit of n
            int lastDigit = n % 10;
            // Multiply the current reversed number by 10 and add the last digit
            reversedNumber = reversedNumber * 10 + lastDigit;
            // Recursively reverse the remaining digits
            return revno(n / 10, reversedNumber);
        }
    }

    public static void main(String[] args) {
        int n = 1234;
        ReverseNumber rv = new ReverseNumber();
        int rev = rv.revno(n, 0); // Pass 0 as the initial value for reversedNumber
        System.out.println("Reversed number: " + rev);
    }
}
