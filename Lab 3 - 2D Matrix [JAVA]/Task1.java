//Task 01: Zigzag Walk
class Task1{

    //Complete this method so that it gives the Expected Output
    public static void walkZigzag( Integer[][] matrix ){
        boolean odd = true;
        for (int i = 0; i < matrix[0].length; i++) {
            if (odd){
                for (int j = 0; j < matrix.length; j+= 2) {
                    System.out.print(matrix[j][i]+ " ");
                }
                odd = false;
            }else{
                int j = matrix.length-1;
                if (matrix.length % 2 != 0){
                    j = matrix.length - 2;
                }
                for (; j>=0 ; j-=2) {
                    System.out.print(matrix[j][i]+ " ");
                }
                odd = true;
            }
            
            System.out.println();
        }

    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] floor1 = {
            {3 , 8 , 4 , 6 , 1},
            {7 , 2 , 1 , 9 , 3},
            {9 , 0 , 7 , 5 , 8},
            {2 , 1 , 3 , 4 , 0},
            {1 , 4 , 2 , 8 , 6}
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(floor1);
        System.out.println("\nExpected Output:");
        System.out.print("3 9 1\n1 2\n4 7 2\n4 9\n1 8 6\n");
        System.out.print("\nYour Output:\n");
        walkZigzag( floor1 );

        System.out.print("\n======================\n");

        Integer[][] floor2 = {
            {3 , 8 , 4 , 6 , 1},
            {7 , 2 , 1 , 9 , 3},
            {9 , 0 , 7 , 5 , 8},
            {2 , 1 , 3 , 4 , 0},
        };
        System.out.println("\nGiven Matrix: ");
        Arr.print2D(floor2);
        System.out.println("\nExpected Output:");
        System.out.print("3 9\n1 2\n4 7\n4 9\n1 8\n");
        System.out.print("\nYour Output:\n");
        walkZigzag( floor2 );

    }
}