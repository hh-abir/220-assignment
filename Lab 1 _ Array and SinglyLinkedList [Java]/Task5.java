
public class Task5 {
public static int sumDist(Node head, Integer[] distArr) {
    int sum = 0;
    for (int i = 0; i < distArr.length; i++) {
        int nodeCount = 0;
        Node node = head;
        while (node != null) {
            if (nodeCount == distArr[i]) {
                sum += (Integer) node.elem;
                break;
            }
            node = node.next;
            nodeCount++;
        }
    }
    return sum;
}

    public static void main(String[] args) {
        System.out.println("=========Test Case 1=============");
        Node head1 = LinkedList.createList(new Integer[] { 10, 16, -5, 9, 3, 4 });
        Integer[] dist = new Integer[] { 2, 0, 5, 2, 8 };
        System.out.print("Given LinkedList: ");
        LinkedList.printLL(head1);
        System.out.print("Distance Array: ");
        Arr.print(dist);
        System.out.println("\nExpected Output: 4");
        int returnedValue = Task5.sumDist(head1, dist);
        System.out.println("Your Output: " + returnedValue); // This should print: Sum of Nodes: 4
    }
}
