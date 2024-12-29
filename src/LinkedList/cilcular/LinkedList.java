package LinkedList.cilcular;

public class LinkedList {

    private Node head;
    private Node current;
    private Node last;

    int length() {
        int length = 0;
        if (head == null) {
            return length;
        }

        current = head;

        do {
            length++;
            current = current.next;
        } while (current.next != last.next) ; {
            length++;
        }
        return length;
    }

    void insertFirst(int key, int data) {
        Node link = new Node(key,data);

        if (head == null) {
            head = link;
            head.next = head;
            last = head;
        } else {
            link.next = head;
            head = link;

            last.next = head.next;

        }


    }

    void printList() {
        Node ptr = head;
        boolean isCilcular = true;
        System.out.print("\n[ ");

        //start from the beginning
        if (head != null) {
            do {
                System.out.print("(" + ptr.key + "," + ptr.data + ") ");
                ptr = ptr.next;
                if( last.next == ptr) {

                }

            } while (ptr.next != last.next) ; {

                System.out.print("(" + ptr.key + "," + ptr.data + ") ");

            }

        }
        System.out.print(" ]");
    }

    Node deleteFirst() {
        Node tmp = head;

        if(head.next == head){
            head = null;
            return tmp;
        }

        head = head.next;



        return tmp;

    }

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(1, 10);
        linkedList.insertFirst(2, 20);
        linkedList.insertFirst(3, 30);


        System.out.print("Original List: ");
        linkedList.printList();

        System.out.println("\nLinked List length: "+ linkedList.length());

        linkedList.deleteFirst();

        System.out.println("\nOriginal List delete 1: ");
        linkedList.printList();
//
//        linkedList.deleteFirst();
//
//        System.out.println("\nOriginal List delete 2: ");
//        linkedList.printList();
//
//        linkedList.deleteFirst();
//
//        System.out.println("\nOriginal List delete 3: ");
//        linkedList.printList();


    }
}
