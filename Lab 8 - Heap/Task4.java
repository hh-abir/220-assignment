public class Task4 {
    public static int[] topK(int[] values, int k) {
        MaxHeap myHeap = new MaxHeap(values.length);

        for (int num : values) {
            myHeap.insert(num);
        }

        int[] newArray = new int[k];
        for (int a = 0; a < k; a++) {
            newArray[a] = myHeap.extractMax();
        }

        return newArray;
    }

    public static void main(String[] args) {
        int[] nums = {4, 10, 2, 8, 6, 7};
        int k = 3;
        int[] outputK = topK(nums, k);
        System.out.print("[");
        for (int a = 0; a < outputK.length; a++) {
            System.out.print(outputK[a] + (a == outputK.length - 1 ? "]\n" : ", "));
        }
        
    }
}
