package Day21;

public class stringoperation {
    
        // declare result as 0
        public int result = 0;
        public int finalValueAfterOperations(String[] operations) {
            // iterate over operations array:
            for(int i = 0; i < operations.length; i++) {
                // call operation function on each operation
                operation(operations[i]);
            }
            // return result
            return result;
        }
        // declare operation function that takes operation string:
        public void operation(String op) {
            // declare swith case:
            switch(op) {
                // declare case --x
                case "--X":
                    // apply operation --x on result
                    --result;
                    // break from switch
                    break;
                // declare case ++x
                case "++X":
                    // apply operation ++x on result
                    ++result;
                    // break from switch
                    break;
                // declare case x--
                case "X--":
                    // apply operation x-- on result
                    result--;
                    // break from switch
                    break;
                // declare case x++
                case "X++":
                    // apply operation x++ on result
                    result++;
                    // break from switch
                    break;
            }
    
        }
    }

