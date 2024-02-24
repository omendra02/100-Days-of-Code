package Day16;

public class Search2d {
    
        public boolean searchMatrix(int[][] matrix, int target) {
            int rows = matrix.length ;
            int col = matrix[0].length ;
            int r=0 ;
            for(int i=0 ; i<rows ; i++){
                if(matrix[i][col-1]>=target){
                    r = i ;
                    break ;
                }
            }
            for(int i=0 ; i<col ; i++){
                if(matrix[r][i]==target){
                    return true ;
                }
            }
            return false ;
        }
    }

