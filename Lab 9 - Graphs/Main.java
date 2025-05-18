
public class Main{
    public static void main(String[] args) {
        int[][] unweightedGraph  = {
            {1, 1, 1, 1, 1, 1, 1},
            {1, 0, 1, 1, 1, 1, 1},
            {1, 1, 1, 0, 1, 1, 0},
            {1, 1, 0, 0, 1, 0, 0},
            {1, 1, 1, 1, 0, 0, 0},
            {1, 1, 1, 0, 0, 0, 0},
            {1, 1, 0, 0, 0, 0, 0},
        };
         
        
        int[][] weightedGraph = {
            {0, 3, 2, 4, 0, 0, 0},
            {3, 0, 1, 0, 5, 0, 0},
            {2, 1, 0, 2, 1, 3, 0},
            {4, 0, 2, 0, 0, 4, 2},
            {0, 5, 1, 0, 0, 1, 3},
            {0, 0, 3, 4, 1, 0, 2},
            {0, 0, 0, 2, 3, 2, 0}
        };


        System.out.println("=== Testing Graph Functions ===");
        
        System.out.println("\nTask 1: Max Degree");
        System.out.println("Unweighted: " + Main.findMaxDegreeFMatrix(unweightedGraph));
        

        System.out.println("\nTask 2: Max Edge Weight Sum");
        System.out.println("Weighted: " + Main.findMaxEdgeMaxFMatrix(weightedGraph));

        System.out.println("\nTask 3a: Max Out Degree");
        System.out.println("Directed: " + Main.maxODegreeFMatrix(weightedGraph));

        System.out.println("\nTask 3b: Max Out Weighted Degree");
        System.out.println("Directed: " + Main.maxOutWDegreeFMatrix(weightedGraph));

        System.out.println("\nTask 4: Convert to Undirected");
        int[][] unDirGraph = {
            {0, 1, 0, 0},
            {0, 0, 1, 0},
            {0, 0, 0, 1},
            {1, 0, 0, 0}
        };
        System.out.println("Before conversion:");
        for (int[] row : unDirGraph) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        
        convertGraphFmatrix(unDirGraph);
        
        System.out.println("\nAfter conversion:");
        for (int[] row : unDirGraph) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }


    // Task 1
    public static int findMaxDegreeFMatrix (int[][] mat) {
        int mxDegree = 0;
        for (int i = 0; i < mat.length; i++) {
            int temp = 0;
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] == 1) {
                    temp++;
                }   
            }
            if (temp > mxDegree) {
                mxDegree = temp;
            }
            temp = 0;
        }
        return mxDegree;
    }
    // Task 2
    public static int findMaxEdgeMaxFMatrix (int[][] mat) {
        int mxWeight = 0;
        for (int i = 0; i < mat.length; i++) {
            int temp = 0;
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] > 0 ) {
                    temp += mat[i][j];
                }   
            }
            if (temp > mxWeight) {
                mxWeight = temp;
            }
            temp = 0;
        }
        return mxWeight;
    }

    // Task 3 for Task 1
    public static int maxODegreeFMatrix(int[][] mat) {
        int mxWeight = 0;
        for (int i = 0; i < mat.length; i++) {
            int temp = 0;
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] > 0 ) {
                    temp += 1;
                }   
            }
            if (temp > mxWeight) {
                mxWeight = temp;
            }
            temp = 0;
        }
        return mxWeight;
    }
    // Task 3 for Task 2
    public static int maxOutWDegreeFMatrix(int[][] mat) {
        int maxODegreeSum = 0;
        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat[i].length; j++) {
                sum += mat[i][j];
            }
            if (sum > maxODegreeSum) maxODegreeSum = sum;
        }
        return maxODegreeSum;
    }

    // Task 4
    public static void convertGraphFmatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] != 0) {
                    int temp = mat[i][j];
                    mat[j][i] = temp;
                }
            }
        }
        
    }
    
}