// Task 06: Matrix Compression
class LAB_01_SOLUTION_06{

    //Complete this method so that it gives the Expected Output
    public static Integer[][] compressMatrix( Integer[][] matrix ){

        //For this task you'll need to create new 2D array
        
        //TO DO

        //remove the line below and return the newly created Compressed 2D matrix
        Integer[][] new_arr = new Integer[matrix.length/2][matrix[0].length/2];
        int x = 0 ;
        int y = 0;
        for (int i = 0; i< matrix.length; i+=2) {

            for (int j = 0; j< matrix[0].length; j+=2){
                new_arr[x][y] = 0 ;
                new_arr[x][y] += matrix[i][j]+matrix[i][j+1]+matrix[i+1][j]+matrix[i+1][j+1]    ;
                y += 1 ;
            }
            x += 1 ;
            y = 0 ;
        }
        return new_arr;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            { 1 , 2 , 3 , 4 },
            { 5 , 6 , 7 , 8 },
            { 1 , 3 , 5 , 2 },
            {-2 , 0 , 6 ,-3 }
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        
        System.out.println("\nExpected Output:");
        System.out.print("| 14 | 22 |\n| 2  | 10 |\n");
        
        System.out.print("\nYour Output:\n");
        Integer[][] returnedArray = compressMatrix( matrix );
        Arr.print2D( returnedArray );
    }
}