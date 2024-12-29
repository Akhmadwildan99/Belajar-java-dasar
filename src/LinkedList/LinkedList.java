package LinkedList;

public class LinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    static void printList() {
        Node p = head;
        System.out.print("\n[");
        while (p != null) {
            System.out.print(" " + p.data + " ");
            p = p.next;
        }
        System.out.println("]");
    }

    static void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    static void insertAtTail(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

    }

    static void insertAtIndex(Node list, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = list.next;
            list.next = newNode;
        }
    }

    static void deleteAtHead() {
        if (head != null) {
            head = head.next;
        }
    }

    static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node temp;


        while (current != null) {
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        head= prev;
        return head;
    }

    static int searchList( int data) {
        Node p = head;
        int position = 0;
        while (p != null) {
            if (p.data == data) {
                return position;
            }

            position++;
            p= p.next;
        }

        return -1;
    }

    static void deleteAtTail() {
        if (head != null) {

            Node current = head;

            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
    }

    static void deleteAtIndex(int data) {
        // delete if data and head data match
        Node temp = head;
        Node prev = null;

        if(temp != null && temp.data == data) {
            head = temp.next;
            return;
        }

        // find node that have data as parameter
        while ( temp != null && temp.data != data) {
            prev = temp;
            temp = temp.next;
        }

        // if data parameter is not present
        if(temp == null) {
            return;
        }

        // remove the node
        prev.next = temp.next;
    }

    public static void main(String[] args) {
//        insertAtHead(12);
//        insertAtHead(13);
//        insertAtHead(14);
//        insertAtHead(15);
//
//        insertAtTail(12);
//        insertAtTail(13);
//        insertAtTail(14);
//        insertAtTail(15);
//
//        insertAtIndex(head.next.next.next.next, 99);
//
//        System.out.println("LinkedList: ");
//        printList();
//
//        deleteAtHead();
//
//        System.out.println("LinkedList after remove begin: ");
//        printList();
//
//        deleteAtTail();
//        System.out.println("LinkedList after remove end: ");
//        printList();
//
//        deleteAtIndex(99);
//        System.out.println("LinkedList after remove at index: ");
//        printList();


        System.out.println("===============================");
        head = new Node(12);
        head.next = new Node(45);
        head.next.next = new Node(90);
        head.next.next.next = new Node(100);

        head = reverse(head);

        printList();

        System.out.println(searchList(12));

    }
}
