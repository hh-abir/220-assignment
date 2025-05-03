public class Task2Tester {
    public static void main(String[] args) {
        MinHeap heap = new MinHeap(10);

        System.out.println("Inserting elements...");
        heap.insert(6);
        heap.insert(3);
        heap.insert(5);
        heap.insert(1);

        System.out.println("\nHeap structure:");
        heap.printHeap();

        System.out.println("\nExtracting min...");
        int min = heap.extractMin();
        System.out.println("Extracted min: " + min);

        System.out.println("\nHeap structure after extraction:");
        heap.printHeap();

        System.out.println("\nInserting more elements...");
        heap.insert(0);
        heap.insert(2);

        System.out.println("\nHeap structure after inserting 0 and 2:");
        heap.printHeap();

        System.out.println("\nExtracting min again...");
        int min2 = heap.extractMin();
        System.out.println("Extracted min: " + min2);

        System.out.println("\nFinal heap structure:");
        heap.printHeap();
    }
}
