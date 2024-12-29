package LinkedList.doubly;

public class Node {
    public int key;
    public int data;
    public Node next;
    public Node prev;

    public Node(int key, int data) {
        this.key = key;
        this.data = data;
        next= null;
        prev= null;
    }
}
