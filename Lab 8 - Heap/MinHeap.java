public class MinHeap {
    public int[] values;
    public int size = 0;

    public MinHeap(int c) {
        this.values = new int[c];
    }
    public void insert(int val){
        if (size == values.length) {
            System.out.println("Heap is full");
            return;
        }
        values[size] = val;
        swim(size);
        size++;
    }

    private void swim(int index) {
        while (index > 0 && values[index] < values[(index - 1) / 2]) {
            int t = values[index];
            values[index] = values[(index - 1) / 2];
            values[(index - 1) / 2] = t;
            index = (index - 1) / 2;
        }
    }
    public int extractMin() {
           int rmVal = values[0];
           values[0] = values[--size];
           sink(0);
           return rmVal;
       }
    
    
       private void sink(int idx) {
        int sml = idx;
        int lV = 2 * idx + 1;
        int rV = 2 * idx + 2;
        if (lV < size && values[lV] < values[sml])
            sml = lV;
        if (rV < size && values[rV] < values[sml])
            sml = rV;
    
        if (sml != idx) {
            int temp = values[idx];
            values[idx] = values[sml];
            values[sml] = temp;
    
            sink(sml);
        }
    }
    
    public void sort() {
        int[] srt = new int[size];
        int orSZ = size;
        for (int i = 0; i < srt.length; i++) {
            srt[i] = extractMin();
        }
        for (int i = 0; i < srt.length; i++) {
            values[i] = srt[i];
        }
        size = orSZ;
    }
    
    
    
    public void printHeap() {
        int lvl = 0;
        int itL = 1;
        int c = 0;
        for (int i = 0; i < size; i++) {
            System.out.print(values[i] + " ");
            c++;
            if (c == itL) {
                System.out.println();
                lvl++;
                itL = (int) Math.pow(2, lvl);
                c = 0;
            }
        }
        System.out.println();
    }  
}