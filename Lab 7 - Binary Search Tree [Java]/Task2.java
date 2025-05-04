public class Task2 {
public static String findPath(BSTNode root, int key) {
    int maxDepth = 100;
    int[] path = new int[maxDepth];
    boolean found = checkPath(root, key, path, 0);
    String output = "";
    if (found) {
        int t = 0;
        for (int i = 0; i < maxDepth; i++) {
            if (path[i] == key) {
                t = i + 1;
                break;
            }
        }
        for (int i = 0; i < t; i++) {
            output += path[i];
            if (i != t - 1) {
                output += " ";
            }
        }
    } else {
        return "No Path Found";
    }
    return output;
}

public static boolean checkPath(BSTNode root, int key, int[] waytoLeaf, int len) {
    if (root == null) {
        return false;
    }
    waytoLeaf[len] = root.elem;
    len++;

    if (root.elem == key) {
        return true;
    }

    if (checkPath(root.left, key, waytoLeaf, len)) {
        return true;
    }
    if (checkPath(root.right, key, waytoLeaf, len)) {
        return true;
    }

    return false;
}

}
