// Task04: Word Decoder


public class Task2 {

public static Node wordDecoder( Node head ){
    Node dHead = new Node(null, null);
    Node temp = head;
    int size = 0;
    while (temp != null){
        size++;
        temp = temp.next;
    }
    temp = head;
    int idx =13 % size;
    char[] arr = new char[size/idx];
    int index = 0;
    int arrN = 0;
    while (temp != null) {
        if (index % idx == 0 && index != 0){
            arr[arrN++] = (char) temp.elem;
        }
        index++;
        temp = temp.next;
    }

    temp = dHead;
    for (int i = arr.length-1; i >= 0; i--) {
        temp.next = new Node(arr[i]);
        temp = temp.next;
    }
    return dHead;
}

    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT TOUCH THE DRIVER CODE BELOW
    public static void main(String[] args){
        System.out.println("==============Test Case 1=============");
        Node head = LinkedList.createList(new Character[]{'B', 'M', 'D', 'T', 'N', 'O', 'A', 'P', 'S', 'C'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> C -> A -> T");
        Node result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> C -> A -> T
        System.out.println();
        System.out.println("==============Test Case 2=============");
        head = LinkedList.createList(new Character[]{'Z', 'O', 'T', 'N', 'X'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> N");
        result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> N
        System.out.println();
    }
}
