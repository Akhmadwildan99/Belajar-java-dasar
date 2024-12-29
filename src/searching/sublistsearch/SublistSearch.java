package searching.sublistsearch;

public class SublistSearch {
    public static class Node {
        int data;
        Node next;
    }

    public static Node newNode(int value) {
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = null;
        return newNode;
    }


    public static boolean sublistSearch(Node root, Node subRoot) {
        Node ptr1 = root;
        Node ptr2 = subRoot;

        if(root == null && subRoot == null) {
            return true;
        }

        if(subRoot == null) {
            return false;
        }

        while(root != null) {
            ptr1 = root;

            while (ptr2 != null) {
                if(ptr1 == null) {
                    return false;
                } else if (ptr1.data == ptr2.data) {
                    ptr1 = ptr1.next;
                    ptr2 = ptr2.next;
                }    else {
                    break;
                }
            }

            if(ptr2 == null) {
                return true;
            }

            ptr2 = subRoot;
            root = root.next;

        }

        return false;
    }


    public static void main(String[] args) {
        Node root = newNode(1);
        root.next = newNode(5);
        root.next.next = newNode(3);
        root.next.next.next = newNode(3);
        root.next.next.next.next = newNode(6);
        root.next.next.next.next.next = newNode(7);
        root.next.next.next.next.next.next = newNode(0);

        Node subRoot = newNode(3);
        subRoot.next = newNode(6);
        subRoot.next.next = newNode(0);

        boolean isContains = sublistSearch(root, subRoot);
        System.out.println(isContains);

    }

}
