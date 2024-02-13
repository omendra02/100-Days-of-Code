package Day5;

public class NTo1 {
    public void Nto1(int N){
        if(N>0){
        System.out.println(N);
        Nto1(N-1);
    }
}
    public static void main(String[] args) {
        NTo1 n2one = new NTo1();
        n2one.Nto1(5);
    }
 }

