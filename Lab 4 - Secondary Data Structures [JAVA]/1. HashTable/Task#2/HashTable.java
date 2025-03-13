/*You will have to complete the FruitNode Contrustor first
 then within this class you only have to complete two methods
 hashFunction() and insert()
 the rest of the metods are already written
 DO NOT TOUCH any other methods or codes*/
public class HashTable {

    // ht[] :: is the HashTable array that stores the FruitNode objects
    private FruitNode[] ht;

    // Constructor that initializes the HashTable array
    // DO NOT change this Constructor
    public HashTable(int size) {
        this.ht = new FruitNode[size];
    }

    // This method basically prints the HashTable
    // DO NOT change this method
    public void show() {
        for (int i = 0; i < ht.length; i++) {
            System.out.print(i + " ");
            FruitNode n = ht[i];
            while (n != null) {
                System.out.print("('" + n.fruit[0] + "', " + n.fruit[1] + ") --> ");
                n = n.next;
            }
            System.out.println();
        }
    }

    private int hashFunction(String key) {
        int sum = 0;
        for (int i = key.length() % 2 == 0 ? 0 : 1; i < key.length(); i += 2) {
            sum += (int) key.charAt(i);
        }
        return sum % ht.length;
    }

    // you need to COMPLETE this method
    // The insert() method will create a FruitNode using name(Key) & price(value)
    // then inserts it in the proper hashed index
    // If collision occurs resolve using the steps explained in the question
    public void insert(String key, Integer value) {
        int idx = hashFunction(key);
        FruitNode temp = ht[idx];
        while (temp != null) {
            if ((Integer) temp.fruit[1] < value){
                ht[idx] = new FruitNode(key, value);
                ht[idx].next = temp;
                return;
            }
            if (temp.next != null && value > (Integer) temp.next.fruit[1]) {
                FruitNode n = temp.next;
                temp.next = new FruitNode(key, value);
                temp.next.next = n;
                return;
            }
            if (temp.next == null){
                temp.next = new FruitNode(key, value);
                return;
            }
            temp = temp.next;
        }
        ht[idx] = new FruitNode(key, value);
    }

}
