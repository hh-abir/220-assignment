public class Task1Tester {
    public static void main(String[] args) {
        MaxHeap testHeap = new MaxHeap(10);
        System.out.println("Inserting elements...");
        testHeap.insert(6);
        testHeap.insert(3);
        testHeap.insert(5);
        testHeap.insert(1);
        System.out.println("\nHeap structure:");
        testHeap.printHeap();
        System.out.println("\nExtracting max...");
        int max = testHeap.extractMax();
        System.out.println("Extracted max: " + max);
        System.out.println("\nHeap structure after extraction:");
        testHeap.printHeap();
        System.out.println("\nInserting more elements...");
        testHeap.insert(7);
        testHeap.insert(2);
        System.out.println("\nHeap structure after inserting 7 and 2:");
        testHeap.printHeap();
        System.out.println("\nExtracting max again...");
        max = testHeap.extractMax();
        System.out.println("Extracted max: " + max);
        System.out.println("\nFinal heap structure:");
        testHeap.printHeap();
    }
}
