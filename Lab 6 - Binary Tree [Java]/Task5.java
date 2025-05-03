// Complete the subtractSummation method
public class Task5 {

    //===================================TASK#5===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
public static Integer subtractSummation( BTNode root ){
    return sumBTNode(root.left) - sumBTNode(root.right); 
}

private static Integer sumBTNode(BTNode root){
    int[] sum = new int[1];
    sumBTNode(root, sum);
    return sum[0];

}

private static void sumBTNode(BTNode root, int[] sum){
    if (root == null){
        return;
    }
    sum[0] += (Integer) root.elem;
    sumBTNode(root.left, sum);
    sumBTNode(root.right, sum);
}
    //============================================================================

}