// Complete the levelSum method
public class Task6 {

    //===================================TASK#6===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    public static Integer levelSum( BTNode root ){
        int[] sum = new int[1];
        levelSum(root, sum, 0);
        return sum[0];
    }

    private static void levelSum(BTNode root,int[] sum, int lvl){
        if (root == null){
            return;
        }
        if (lvl%2 == 0){
            sum[0] -= (Integer) root.elem;
        }else{
            sum[0] += (Integer) root.elem;
        }

        levelSum(root.left, sum, lvl+1);
        levelSum(root.right, sum, lvl+1);
    }
    //============================================================================

}