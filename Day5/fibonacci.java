package Day5;

public class fibonacci {
    
        public int fib(int n) {
            if(n<2){
            return n;
            }
            return fib(n-1) +fib(n-2);
        }
        public static void main(String[] args) {
            fibonacci fibo1 = new fibonacci();
            System.out.println(fibo1.fib(6));
        }
    }

