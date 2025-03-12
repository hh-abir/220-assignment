// Task 04: Matrix Compression
class Task4{

public static Integer[][] compressMatrix( Integer[][] matrix ){
    Integer[][] newArr = new Integer[matrix.length/2][matrix.length/2];
    int r = 0;
    int c = 0;
    for (int i = 0; i < matrix.length; i+=2) {
        for (int j = 0; j < matrix[i].length; j+=2) {
            int sum = matrix[i][j] + matrix[i][j+1] + matrix[i+1][j] +  matrix[i+1][j+1];
            newArr[r][c++] = sum; 
        }
        c = 0;
        r++;
    }

    return newArr;
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