public class Task1 {
public static Integer lowestCommonAncestor(BSTNode root, Integer x, Integer y) {
    if (root == null) {
        return null;
    }
    if (root.elem.equals(x)) {
        if (checkNode(root, y)) {
            return x;
        }
    }
    if (root.elem.equals(y)) {
        if (checkNode(root, x)) {
            return y;
        }
    }
    boolean inLft = checkNode(root.left, x);
    boolean inylft = checkNode(root.left, y);
    if (inLft && inylft) {
        return lowestCommonAncestor(root.left, x, y);
    }
    boolean inxRgt = checkNode(root.right, x);
    boolean inyRgt = checkNode(root.right, y);

    if (inxRgt && inyRgt) {
        return lowestCommonAncestor(root.right, x, y);
    }
    return root.elem;
}
private static boolean checkNode(BSTNode node, Integer val) {
    if (node == null) {
        return false;
    }
    if (node.elem.equals(val)) {
        return true;
    }
    return checkNode(node.left, val) || checkNode(node.right, val);
}
}