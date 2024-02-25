package Day17;
//Number of Employees Who Met the Target
public class CountNumbers {
   
        public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
            int n = hours.length;
            int count=0;
            for(int i = 0;i<n;i++){
                if(hours[i] >= target){
                    count++;
                }
            }
            return count;
        }
    }

