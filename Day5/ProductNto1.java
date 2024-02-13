package Day5;

public class ProductNto1 {
    public int Nto1prod(int N) {
        if (N > 0) {
            return N * Nto1prod(N - 1);
        } else {
            return 1; // Base case: factorial of 0 is 1
        }
    }

    public static void main(String[] args) {
        ProductNto1 productNto1 = new ProductNto1();
        int result = productNto1.Nto1prod(5); // Calculate factorial of 5
        System.out.println("Factorial of 5 is: " + result);
    }
}
