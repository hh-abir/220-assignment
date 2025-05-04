// Complete the sumOfLeaves method
public class Task4 {

public static Integer mirrorSum(BSTNode root) {
    if (root == null) {
        return 0;
    }
    int[] sumAr = new int[1];
    sumCalulate(root.left, root.right, sumAr);
    return sumAr[0];
}

private static void sumCalulate(BSTNode leftNode, BSTNode rightNode, int[] sumHolder) {
    if (leftNode == null && rightNode == null) {
        return;
    }
    if (leftNode == null || rightNode == null) {
        return;
    }

    sumHolder[0] = sumHolder[0] + leftNode.elem + rightNode.elem;

    sumCalulate(leftNode.left, rightNode.right, sumHolder);
    sumCalulate(leftNode.right, rightNode.left, sumHolder);
}
}
