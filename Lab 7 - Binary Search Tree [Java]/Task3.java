// Complete the sumOfLeaves method
public class Task3 {

    //===================================TASK#3======================
    // This method takes only 2 parameters
    // 1st one is root
    // 2nd one is the sum initiliazed as 0
    // You'll need to return the sum of the leaf nodes
public static Integer sumOfLeaves(BSTNode root, Integer sum) {
    int[] cVal = new int[1];
    cVal[0] = sum; 
    calculateSum(root, cVal);
    return cVal[0]; 
}

private static void calculateSum(BSTNode node, int[] sumHolder) {
    if (node == null) {
        return; 
    }
    
    if (node.left == null && node.right == null) {
        sumHolder[0] += node.elem;
    }

    calculateSum(node.left, sumHolder);
    calculateSum(node.right, sumHolder);
}
}
