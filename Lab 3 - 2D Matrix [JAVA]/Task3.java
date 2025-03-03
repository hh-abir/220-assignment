// Task 03: Row Rotation Policy of BRACU Classroom
class Task3 {

    public static Integer rowRotation(Integer examWeek, String[][] matrix) {
        examWeek--;
        while (examWeek != 0) {
            String[] temp = matrix[matrix.length - 1];
            for (int i = matrix.length - 2; i >= 0; i--) {
                matrix[i + 1] = matrix[i];
            }
            matrix[0] = temp;
            examWeek--;
        }
        Arr.print2D(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].equals("AA")){
                    return i+1;
                }
            }
        }
        return -1;
    }

    // DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args) {
        String[][] seatStatus = {
                { "A", "B", "C", "D", "E" },
                { "F", "G", "H", "I", "J" },
                { "K", "L", "M", "N", "O" },
                { "P", "Q", "R", "S", "T" },
                { "U", "V", "W", "X", "Y" },
                { "Z", "AA", "BB", "CC", "DD" }
        };
        System.out.println("Given Seat Status: ");
        Arr.print2D(seatStatus);

        System.out.println("\nExpected Output:");
        System.out.println("| U  | V  | W  | X  | Y  | ");
        System.out.println("| Z  | AA | BB | CC | DD | ");
        System.out.println("| A  | B  | C  | D  | E  | ");
        System.out.println("| F  | G  | H  | I  | J  | ");
        System.out.println("| K  | L  | M  | N  | O  | ");
        System.out.println("| P  | Q  | R  | S  | T  | ");
        System.out.println("Your friend AA will be on row 2");

        System.out.print("\nYour Output:\n");
        Integer examWeek = 3;
        // This following should print modified seat status after rotation and return
        // the current exam week
        Integer rowNumber = rowRotation(examWeek, seatStatus);
        // The following should print Your friend AA will be on row 2
        System.out.println("Your friend AA will be on row " + rowNumber);
    }
}