public class MaxHeap {
    public int[] values;
    public int size = 0;
    public MaxHeap(int c) {
        this.values = new int[c];
    }
    public void insert(int val) {
        if (size == values.length) {
            System.out.println("Heap is full");
            return;
        }
        values[size] = val;
        swim(size);
        size++;
    }
    private void swim(int index) {
        while (index > 0 && values[index] > values[(index - 1) / 2]) {
            int t = values[index];
            values[index] = values[(index - 1) / 2];
            values[(index - 1) / 2] = t;
            index = (index - 1) / 2;
        }
    }
    public int extractMax() {
        int rmVal = values[0];
        values[0] = values[--size];
        sink(0);
        return rmVal;
    }

    private void sink(int index) {
        int lrg = index;
        int lV = 2 * index + 1;
        int rV = 2 * index + 2;
        if (lV < size && values[lV] > values[lrg])
            lrg = lV;
        if (rV < size && values[rV] > values[lrg])
            lrg = rV;

        if (lrg != index) {
            int temp = values[index];
            values[index] = values[lrg];
            values[lrg] = temp;

            sink(lrg);
        }
    }

    public void sort() {
        int orgS = size;
        for (int a = size / 2 - 1; a >= 0; a--) {
            sink(a);
        }
        for (int a = size - 1; a > 0; a--) {
            int t = values[0];
            values[0] = values[a];
            values[a] = t;
            size--;
            sink(0);
        }
        size = orgS;
    }

    public void printHeap() {
        int lvl = 0;
        int iIlvl = 1;
        int c = 0;

        for (int a = 0; a < size; a++) {
            System.out.print(values[a] + " ");
            c++;

            if (c == iIlvl) {
                System.out.println();
                lvl++;
                iIlvl = (int) Math.pow(2, lvl);
                c = 0;
            }
        }
        System.out.println();
    }
}
