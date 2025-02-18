//Task 02: Container with Most Water
class Task2{

    //Complete this method so that it gives the Expected Output
    public static void mostWater( Integer[] height ){
        int hg = 0;
        for (int i = 0; i < height.length-1; i++) {
            for (int j = i+1; j < height.length; j++) {
                int len = height[j];
                if (height[i] < height[j]){
                    len = height[i];
                }
                int cal = len * (j-i);
                if (cal > hg){
                    hg = cal;
                }
            }
        }
    System.out.println(hg);    
}

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[] array = {1,8,6,2,5,4,8,3,7};
        System.out.println("Given Array: ");
        Arr.print(array);
        System.out.println("\nExpected Output:");
        System.out.print("49");
	System.out.print("\nYour Output:\n");
        mostWater( array );

    }
}
