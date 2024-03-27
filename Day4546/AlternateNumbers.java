package Day4546;
public class AlternateNumbers {
    public class Solution {
        public static int[] alternateNumbers(int []a) {
            // Write your code here.
            int n = a.length;
           int[] ans = new int[n]; 
    
            int posindex = 0;
            int negindex = 1;
    
            for(int i = 0; i<n;i++){
                if(a[i]<0){
                    ans[negindex] = a[i];
                    negindex += 2;
                }
                else{
                    ans[posindex] = a[i];
                    posindex += 2;
                }
            }
           return ans;
        }
         
    }
}
