// Complete the sumTree method

import java.util.ArrayList;

public class Task3 {

        //===================================TASK#3===================================
        // This method takes only 1 parameter which is root of the given tree
        // This method returns an Integer
        // At times you may need to typeCast root.elem to Integer
        // You can use extra helper private static methods as per need
        public static Integer sumTree( BTNode root ){
            int sum = 0;
            for (int i = 0; i <= height(root); i++) {
                ArrayList<Integer> list = getNodesAtDistance(root, i);
                int temp = 0;
                for (int j = 0; j < list.size(); j++) {
                    if (i != 0){
                        temp += (Integer) list.get(j) % i;
                    }else{
                        temp = (Integer) list.get(j);
                        break;
                    }
                }
                sum += temp;
            }
            return sum;
        }

        private static int height(BTNode root){
            if (root == null){
                return 0;
            }
            if (root.left == null && root.right == null){
                return 0;
            }
            
            return 1 + Math.max(height(root.left), height(root.right));
        }

        private static ArrayList<Integer> getNodesAtDistance(BTNode root, int distance){
            ArrayList<Integer> list = new ArrayList<>();
            getNodesAtDistance(root, distance, list);
            return list;
        }

        private static void getNodesAtDistance(BTNode root, int distance, ArrayList<Integer> list){
            if (root == null){
                return;
            }
            if (distance == 0){
                list.add((Integer)root.elem);
                return;
            }
            getNodesAtDistance(root.left, distance-1, list);
            getNodesAtDistance(root.right, distance-1, list);
        }
        //============================================================================

}
