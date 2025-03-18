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
    int count = 0;
    Node p = null;
    while (temp != null) {
        Node t = temp.next;
        if (count != 0 && count % idx == 0){
            temp.next = p;
            p = temp;
        }
        temp = t;
        count++;
    }
    dHead.next = p;
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
