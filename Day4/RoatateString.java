package Day4;

public class RoatateString {
    
        public boolean rotateString(String s, String goal) {
    
            
    
            // find length of start string
            int n1 = s.length();
    
            // find length of goal string
            int n2 = goal.length();
    
            // Step1:
            // if they are unequal then, start cannot be converted to goal
            if(n1 != n2)
            {
                return false;
            }
    
            // We use StringBuilder as we are modifying the string
            // String cannot be used as they are immutable.
            StringBuilder str = new StringBuilder(goal);
    
            // Step2:
            // repeat the goal string.
            str=str.append(str);
    
            // Step3 and Step4:
            // if start string is present in it then return true.
            // otherwise return false
            
            return (str.indexOf(s)!=-1);   
    
            /*
            The return statement can be expanded as:
                    if(str.indexOf(s)!=-1)
                    {
                         return true;
                    }
                    else
                    {
                         return false;
                    }
            */   
        }
        public static void main(String[] args) {
            RoatateString rotateString = new RoatateString();
            
            // Example usage
            String s = "abcde";
            String goal = "cdeab";
            
            boolean result = rotateString.rotateString(s, goal);
            System.out.println("Can s be rotated to get goal? " + result);
        }
    }

