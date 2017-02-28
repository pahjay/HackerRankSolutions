package DataStructures.LinkedLists;

public class InsertNodeAtHead {
    Node Insert(Node head,int x) {
        Node node = new Node();
        node.data = x;
        node.next = head;

        return node;

    }
}
