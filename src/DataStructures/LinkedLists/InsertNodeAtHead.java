package DataStructures.LinkedLists;

/**
 * Created by Ryan on 1/19/2017.
 */
class Node {
    int data;
    Node next;
}
public class InsertNodeAtHead {
    Node Insert(Node head,int x) {
        Node node = new Node();
        node.data = x;
        node.next = head;

        return node;

    }
}
