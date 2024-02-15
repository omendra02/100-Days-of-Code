package Day7;

public class SumOfDigits {
    // Method to calculate sum of digits recursively
    public int sumDigits(int n) {
        if (n == 0) {
            return 0; // Base case: if n becomes 0, return 0
        } else {
            // Get the last digit and add it to the sum of the remaining digits
            int last = n % 10;
            return last + sumDigits(n / 10);
        }
    }

    public static void main(String[] args) {
        int n = 12345; // Example number
        SumOfDigits sm = new SumOfDigits();
        int sum = sm.sumDigits(n);
        System.out.println("Sum of digits of " + n + " is: " + sum);
    }
}
