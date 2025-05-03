public class Task3 {
    public static int[] taskSystem(int[] tasks, int m) {
        MinHeap heap = new MinHeap(m); 
        for (int a = 0; a < m; a++) {
            heap.insert(0);  
        }

        for (int task : tasks) {
            int mLD = heap.extractMin(); 
            mLD += task;  
            heap.insert(mLD);  
        }

        heap.sort();
        return heap.values;
    }

    public static void main(String[] args) {
        int[] given = {2, 4, 7, 1, 6};
        int m = 4;
        int[] otpt = taskSystem(given, m);
        System.out.print("Output: [");
        for (int a = 0; a < otpt.length; a++) {
            System.out.print(otpt[a]);
            if (a == otpt.length - 1) {
                System.out.println("]");
            } else {
                System.out.print(", ");
            }
        }        
    }
}