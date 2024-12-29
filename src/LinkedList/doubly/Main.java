package LinkedList.doubly;
public class Main {
    static Node head;
    static Node last;
    static Node current;

    public static void printList() {
        Node ptr = head;

        while (ptr != null) {
            System.out.print("(" + ptr.key + "," + ptr.data + ")");
            ptr = ptr.next;
        }
    }

    public static boolean isEmpty() {
        return head == null;
    }

    public static void insertFirst(int key, int data) {
        Node link = new Node(key, data);

        if (isEmpty()) {
            last = link;
        } else {
            head.prev = link;
        }
        link.next = head;
        head = link;
    }

    public static void insertLast(int key, int data) {

        Node link = new Node(key, data);

        if (isEmpty()) {
            head = link;
        } else {

            last.next = link;
            link.prev = last;
        }

        last = link;
    }

    public static Node deleteAtBeginning() {
        if (isEmpty()) {
            return null;
        }
        Node tmp = head;

        if (head.next == null) {
            last = null;
        } else {
            head.next.prev = null;
        }
        head = head.next;
        return tmp;
    }

    public static Node deleteAtLast() {
        if (isEmpty()) {
            return null;
        }

        Node tmp = last;

        if (head.next == null) {
            head = null;
        } else {
            last.prev.next = null;
        }
        last = last.prev;

        return tmp;
    }

    public static Node delete(int key) {
        if (isEmpty()) {
            return null;
        }

        Node current= head;

        while(current.key != key) {
            if(current.next == null) {
                return null;
            } else {
                current= current.next;
            }
        }

        if(current == head) {
            head= head.next;
        } else {
            current.prev.next = current.next;
        }

        if(current == last) {
            last = current.prev;
        } else {
            current.next.prev = current.prev;
        }
        return current;
    }

    static String toString(Node link) {
        if(link.next == null) {
            return "("+ link.key +","+ link.data+ ")";
        }

        return  "("+ link.key +","+ link.data+ ")" + toString(link.next);
    }

    static boolean insertAfter(int key, int newKey, int data) {
        if(isEmpty()) {
            return false;
        }

        Node current= head;
        while(current.key != key) {
            if(current.next == null) {
                return false;
            }

            current = current.next;
        }
        Node node = new Node(newKey, data);
        if(current == last) {
            node.next = null;
            last.next = node;
        } else {
            current.next.prev = node;
            node.next = current.next;
        }

        node.prev = current;
        current.next = node;
        return true;

    }
    public static void main(String[] args) {
        insertFirst(1, 10);
        insertFirst(2, 20);
        insertFirst(3, 30);
        insertFirst(4, 1);

        insertLast(6, 1);
        insertLast(9, 1);


        System.out.print("Doubly Linked List: ");
        printList();

        deleteAtBeginning();
        System.out.print("\nDeletion at beginning: ");
        printList();

        deleteAtLast();
        System.out.print("\nDeletion at last: ");
        printList();

        delete(6);
        System.out.print("\nDeletion at key: "+ 6+ " : ");
        printList();

        Node nodeDelete2 = delete(2);
        System.out.println("\n");
        System.out.println(toString(nodeDelete2));
        System.out.print("\nDeletion at key: "+ 2+ " : ");
        printList();

        insertAfter(3, 4, 32);
        System.out.print("\nInsert  after  key: "+ 3+ " : ");
        printList();

    }
}