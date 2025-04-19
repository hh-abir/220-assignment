// Complete the sumTree method

import java.util.ArrayList;

public class Task3 {

        //===================================TASK#3===================================
        // This method takes only 1 parameter which is root of the given tree
        // This method returns an Integer
        // At times you may need to typeCast root.elem to Integer
        // You can use extra helper private static methods as per need
        public static Integer sumTree( BTNode root ){
            int[] sum = new int[1];
            sumOfNodes(root, sum, 0);
            return sum[0];
        }
        private static void sumOfNodes(BTNode root,int[] sum, int lvl){
            if (root == null){
                return;
            }
            if (lvl != 0){
               sum[0] += ((Integer) root.elem%lvl);
            }else{
                sum[0] += (Integer) root.elem;
            }
            sumOfNodes(root.left, sum, lvl+1);
            sumOfNodes(root.right, sum, lvl+1);
        }

        
        //============================================================================

}
