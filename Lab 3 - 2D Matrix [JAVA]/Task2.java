//Task 02: Decryption Process
class Task2{
    public static Integer[] decryptMatrix( Integer[][] matrix ){
        Integer[] newArr = new Integer[matrix[0].length - 1];
        int c = 0;
        for (int i = 0; i < matrix[0].length-1; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < matrix.length; j++) {
                 sum1 += matrix[j][i];
                 sum2 += matrix[j][i+1];
            }
            newArr[c++] = sum2 - sum1;
        }
        
        return newArr;

    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            {1,3,1},
            {6,4,2},
            {5,1,7},
            {9,3,3},
            {8,5,4}
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        System.out.println("\nExpected Output:\n[ -13 1 ]");
        Integer[] returned_val_1 = decryptMatrix( matrix );
        System.out.print("\nYour Output:\n");
        Arr.print(returned_val_1);

    }
}