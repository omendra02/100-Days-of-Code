package Day5;

public class Sum1toN {
    public int Sum(int N){
        if(N>0){
            return N+Sum(N-1);
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
        Sum1toN sums = new Sum1toN();
        int result = sums.Sum(5);
        System.out.println(result);
    }
}
